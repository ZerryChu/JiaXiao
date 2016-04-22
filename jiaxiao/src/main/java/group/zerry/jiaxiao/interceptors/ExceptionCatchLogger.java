package group.zerry.jiaxiao.interceptors;

import java.util.Date;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionInvocation;
import com.sun.xml.internal.stream.Entity;

import group.zerry.jiaxiao.dao.ExceptionLogDao;
import group.zerry.jiaxiao.utils.BatchHandle;
import sun.util.logging.resources.logging_zh_HK;

/**
 * @author  Zirui Zhu
 * @content 日志处理，异常信息存入数据库，管理员操作信息存log文件
 *
 */
public class ExceptionCatchLogger extends LogInterceptor {
	
	// private static org.apache.log4j.Logger logger = Logger.getLogger(ExceptionCatchLogger.class);
	
	@Autowired
	private ExceptionLogDao logDao;
	
	@Autowired
	private BatchHandle     batcher;
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		// action执行的结果码
		String result = "";
		// action执行的相关方法
		String method = invocation.getProxy().getMethod();
		// 参数执行的管理员
		String username = (String) invocation.getInvocationContext().getValueStack().findValue("username");
		if (null == username || "".equals(username)) {
			username = "no_login";
		}
		
		// 日志处理信息
		StringBuffer log = new StringBuffer();
		
		try {
			result = invocation.invoke();
		} catch (Exception e) {
			// 出现异常写入日志
			log(e, method);
		}
		// 输出执行的action与返回的结果码
		
		log.append(username + ", " + method + ", " + result + "," + String.valueOf(new Date().toLocaleString()) + "\r\n");
		
		// 交由批处理器写入本地日志
		batcher.add(log, 50);
		return null;
	}

	@Override
	protected void log(Exception e, String method) {
		// TODO Auto-generated method stub
		String exceptionMsg = e.getMessage();
		// 异常写入日志
		logDao.addExceptionLog(exceptionMsg, method);
		System.out.println("exception： " + exceptionMsg);
		System.out.println("异常已写入数据库...");
	}
	
}
