package group.zerry.jiaxiao.action;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.tomcat.util.net.SecureNioChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import group.zerry.jiaxiao.service.UserService;
import group.zerry.jiaxiao.service.serviceImpl.UserServiceImpl;


@Controller  
@Scope("prototype") 
public class UserAction  extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;
	private String userToken;
	private String password;
	private String new_password;
	
	@Autowired
	private UserService userService;
	
	public String login() {
		if (userService.login(username, password) == true) {
			// 成功登录
			
			UUID uuid = UUID.randomUUID();
			userToken = uuid.toString();
			
			//add session
			Map<String, Object> session = ServletActionContext.getContext().getSession();
			session.put(username, userToken); 
			return "success";
		} else {
			return "wrong";
		}
	}
	
	// 修改密码
	public String updatePassword() {
		if (userService.login(username, password) == true) {
			// 验证账户和密码
			userService.updatePwd(username, new_password);
			return "success";
		} else {
			return "wrong";
		}
	}
	
	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
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
