package group.zerry.jiaxiao.interceptors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionInvocation;

import group.zerry.jiaxiao.dao.ExceptionLogDao;

/**
 * @author  zhuzirui
 * @content 异常日志处理
 *
 */
public class ExceptionCatchLogger extends LogInterceptor {
	
	private static org.apache.log4j.Logger logger = Logger.getLogger(ExceptionCatchLogger.class);
	
	@Autowired
	private ExceptionLogDao logDao;
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		String result;
		try {
			result = invocation.invoke();
		} catch (Exception e) {
			// 出现异常写入日志
			log(e.toString(), invocation.getProxy().getMethod());
		}
		return null;
	}

	@Override
	protected void log(String exception, String method) {
		// TODO Auto-generated method stub
		logDao.addExceptionLog(exception, method);
		System.out.println("exception： " + exception);
		System.out.println("已写入日志...");
	}
	
}
