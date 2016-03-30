package group.zerry.jiaxiao.interceptors;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class CheckAuthority extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		//Map<String, Object> session = ServletActionContext.getContext().getSession();
		String username = request.getParameter("username");
		String userToken = request.getParameter("userToken");
		System.out.println(username + userToken);
		//if ()
			return invocation.invoke(); 
		//else
		//	return "wrong";
	}
	

}
