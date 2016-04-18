package group.zerry.jiaxiao.action;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import group.zerry.jiaxiao.service.UserService;


@Controller  
@Scope("prototype") 
public class UserAction  extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;
	private String userToken;
	private String password;
	
	@Autowired
	private UserService userService;
	
	public String login() {
		if (true == userService.login(username, password)) {
			// 成功登录
			
			UUID uuid = UUID.randomUUID();
			userToken = uuid.toString();
			
			/*   add cookie
			Cookie cookie = new Cookie("userinfo", username + ',' + userToken);
			cookie.setMaxAge(600);
			cookie.setPath("/");
			HttpServletResponse response =  ServletActionContext.getResponse();
			response.addCookie(cookie);
			*/
			
			//add session
			Map<String, Object> session = ServletActionContext.getContext().getSession();
			session.put(username, userToken); 
			return "success";
		} else {
			return "wrong";
		}
	}
	
	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
