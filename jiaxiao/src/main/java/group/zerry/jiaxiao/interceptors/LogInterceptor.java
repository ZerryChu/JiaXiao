package group.zerry.jiaxiao.interceptors;

import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * @author zhuzirui
 * @content 所有日志处理拦截器的抽象类 
 *
 */
public abstract class LogInterceptor extends MethodFilterInterceptor {
	
	// 写日志
	protected abstract void log(String info, String method);


}
