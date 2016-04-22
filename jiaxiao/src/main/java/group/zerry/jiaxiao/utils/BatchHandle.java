package group.zerry.jiaxiao.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Zirui Zhu
 * @content 日志批处理工具，减少文件流操作
 *
 */
public final class BatchHandle {

	private LinkedBlockingQueue<Object> queue;
	private boolean running = true;
	private ExecutorService exec;
	private int batchSize = 10; // 根据用户数量、用户操作频繁程度增加
	private int queueSize = Integer.MAX_VALUE;
	private int timeout = 5000;
	private int taskCount = 1;
	private BatchHandler<Object> batchHandler;
	private EnqueueHandler<Object> enqueueHandler;
	private final String filePath = "/Users/zhuzirui/Documents/workspace/jiaxiao/WebContent/log/log.txt";
	
	public BatchHandle() throws Exception {
		BatchHandler<Object> batchHandler = new BatchHandler<Object>() {
			@Override
			public void handle(List<Object> list, Runnable task) {
				StringBuffer log = new StringBuffer();
				for (int i = 0; i < list.size(); i++) {
					log.append(list.get(i).toString());
				}
				// 写日志
				doLogger(log.toString());
			}
		};

		EnqueueHandler<Object> enqueueHandler = new EnqueueHandler<Object>() {
			@Override
			public void handle(BlockingQueue<Object> queue, Object obj) {
				queue.offer(obj);
			}
		};

		this.batchHandler = batchHandler;
		this.enqueueHandler = enqueueHandler;
		start();
	}

	public BatchHandle batchSize(int size) {
		if (size > 0) {
			this.batchSize = size;
		}
		return this;
	}

	public BatchHandle queueSize(int size) {
		if (size > 0) {
			this.queueSize = size;
		}
		return this;
	}

	public BatchHandle timeout(int timeout, TimeUnit unit) {
		if (timeout > 0) {
			this.timeout = (int) unit.toMillis(timeout);
		}
		return this;
	}

	public BatchHandle taskCount(int count) {
		if (count > 0) {
			this.taskCount = count;
		}
		return this;
	}

	public BatchHandle enqueueHandler(EnqueueHandler<Object> enqueueHandler) {
		this.enqueueHandler = enqueueHandler;
		return this;
	}

	public BatchHandle start() {
		check();
		queue = new LinkedBlockingQueue<Object>(queueSize);
		exec = Executors.newFixedThreadPool(taskCount);
		BatchTask task = new BatchTask();
		for (int i = 0; i < taskCount; i++) {
			exec.execute(task);
		}
		return this;
	}

	private void check() {
		if (batchHandler == null) {
			throw new RuntimeException("BatchHandler不能为空");
		}
	}

	private BatchHandle(BatchHandler<Object> batchHandler) {
		this.batchHandler = batchHandler;
		check();
	}

	/**
	 * 队列大小为{@link Integer#MIN_VALUE}的批量操作包装器
	 * 
	 * @param batchHandler
	 *            批量处理器
	 * @param batchSize
	 *            批量操作上限
	 * @param timeoutMs
	 *            超时时间(单位：毫秒)
	 * @param taskCount
	 *            处理线程数量
	 */
	public BatchHandle(BatchHandler<Object> batchHandler, int batchSize, int timeoutMs, int taskCount) {
		this(batchHandler, Integer.MAX_VALUE, batchSize, timeoutMs, taskCount);
	}

	/**
	 * 具有指定队列大小的批量操作包装器
	 * 
	 * @param batchHandler
	 *            批量处理器
	 * @param queueSize
	 *            队列大小
	 * @param batchSize
	 *            批量操作大小
	 * @param timeoutMs
	 *            取出元素超时时间(单位：毫秒)
	 * @param taskCount
	 *            处理线程数量
	 */
	public BatchHandle(BatchHandler<Object> batchHandler, int queueSize, int batchSize, int timeoutMs,
			int taskCount) {
		this(batchHandler, queueSize, batchSize, timeoutMs, taskCount, null);
	}

	/**
	 * 具有指定队列大小和入队失败处理器的批量操作包装器
	 * 
	 * @param batchHandler
	 *            批量处理器
	 * @param queueSize
	 *            队列大小
	 * @param batchSize
	 *            批量操作大小
	 * @param timeoutMs
	 *            超时时间(单位：毫秒)
	 * @param taskCount
	 *            处理线程数量
	 * @param enqueueHandler
	 *            入队处理器
	 */
	public BatchHandle(BatchHandler<Object> batchHandler, int queueSize, int batchSize, int timeoutMs,
			int taskCount, EnqueueHandler<Object> enqueueHandler) {
		if (batchHandler == null || batchSize < 1 || timeoutMs < 0 || taskCount < 0) {
			throw new RuntimeException("参数错误：BatchHandler不能为null，batchSize必须大于0，timeout必须大于0，taskCount必须大于0");
		}
		this.queue = new LinkedBlockingQueue<Object>(queueSize);
		this.batchSize = batchSize;
		this.timeout = timeoutMs;
		this.batchHandler = batchHandler;
		this.enqueueHandler = enqueueHandler;
		exec = Executors.newFixedThreadPool(taskCount);
		BatchTask task = new BatchTask();
		for (int i = 0; i < taskCount; i++) {
			exec.execute(task);
		}
	}

	public void add(Object log) {
		try {
			if (enqueueHandler != null) {
				enqueueHandler.handle(queue, log);
			} else {
				queue.put(log);
			}
		} catch (Exception e) {
			// TODO
		}
	}

	public void add(Object log, int timeoutMs) {
		try {
			if (enqueueHandler != null) {
				enqueueHandler.handle(queue, log);
			} else {
				queue.offer(log, timeoutMs, TimeUnit.MILLISECONDS);
			}
		} catch (Exception e) {
			// TODO
		}
	}

	public void stop() {
		running = false;
		exec.shutdownNow();
	}

	/**
	 * @author lzy 批量处理器
	 */
	public static interface BatchHandler<E> {
		/**
		 * 批量方法
		 * 
		 * @param list
		 *            待处理的数据列表
		 * @param task
		 *            负责处理数据的线程
		 */
		void handle(List<E> list, Runnable task);
	}

	/**
	 * @author lzy 数据入队处理器
	 */
	public static interface EnqueueHandler<E> {
		/**
		 * 处理方法
		 * 
		 * @param queue
		 *            保存数据的队列
		 * @param obj
		 *            待保存数据
		 * @param e
		 *            异常
		 */
		void handle(BlockingQueue<E> queue, E obj);

	}

	/**
	 * @author lzy 批量处理任务
	 */
	private class BatchTask implements Runnable {

		@Override
		public void run() {
			ArrayList<Object> list = new ArrayList<Object>(batchSize);
			while (running && !Thread.interrupted()) {
				try {
					Object log = null;
					while (log == null) {
						log = queue.poll(timeout, TimeUnit.MILLISECONDS);
						Thread.sleep(100);
					}
					list.add(log);
					if (list.size() == batchSize) {
						batch(list);
					}
					// }
				} catch (Exception e) {
					// TODO
				}
			}
			// 停止处理后，批量处理内存中存在的数据
			while (queue.size() > 0) {
				Object log = queue.poll();
				if (log != null) {
					list.add(log);
					if (list.size() == batchSize) {
						batch(list);
					}
				}
			}
			batch(list);
		}

		private void batch(ArrayList<Object> list) {
			if (list.size() > 0) {
				try {
					batchHandler.handle(list, this);
				} finally {
					// 处理数据后，不管成功与否，均清空当前数据
					list.clear();
				}
			}
		}
	}

	public int excuteQuery(String sql) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jiaxiao", "root", "486579");
			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int num = rs.getInt(1);
			rs.close();
			return num;
			// 返回值处理
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void excuteUpdate(String sql) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jiaxiao", "root", "486579");
			java.sql.Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			// 返回值处理
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void doLogger(String log) {
		System.out.println("本地日志已更新...");
		File file = new File(filePath);
		FileWriter fw = null;
		if (file.exists()) {
			try {
	            fw = new FileWriter(file, true);
	            fw.write(log);
	            fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("log.txt is missing.");
		}
	}
	/*
	 * TEST
	 * 
	 * public static void main(String[] args) {
	 * 
	 * //final BatchHandleWrapper<Object> bhw =
	 * BatchHandleWrapper.batchHandler(batchHandler) //.batchSize(10)
	 * //.timeout(5, TimeUnit.SECONDS) //.taskCount(1)
	 * //.enqueueHandler(enqueueHandler) // ;
	 * 
	 * //Thread t = new Thread(){ // public void run() { BatchHandleWrapper bhw
	 * = new BatchHandleWrapper(); for(int i=1;i<=150;i++){ bhw.add("第"+i,50); }
	 * System.err.println("我放完了"); bhw.stop(); // }; //}; // t.start(); }
	 */
}