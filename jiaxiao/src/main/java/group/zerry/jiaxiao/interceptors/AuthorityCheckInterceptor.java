package group.zerry.jiaxiao.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 
 * @author  朱梓瑞
 * @content 检查用户操作权限
 *
 */
public class AuthorityCheckInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		//Map<String, Object> session = ServletActionContext.getContext().getSession();
		String username = request.getParameter("username");
		String userToken = request.getParameter("userToken");
		HttpSession httpSession = request.getSession();
		if (null != httpSession.getAttribute(username) && httpSession.getAttribute(username).equals(userToken))
			return invocation.invoke(); 
		else
			return "noAuthority";
	}
	

}
