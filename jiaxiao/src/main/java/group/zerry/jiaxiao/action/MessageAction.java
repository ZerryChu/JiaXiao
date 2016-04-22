package group.zerry.jiaxiao.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;

import group.zerry.jiaxiao.entity.Message;
import group.zerry.jiaxiao.service.MessageService;

/**
 * @author Zirui Zhu
 * @content 处理留言相关的action
 *
 */
@Controller
@Scope("prototype")
public class MessageAction extends ActionSupport {

	private String username;
	private String userToken;

	/**
	 * params: 1: 获取所有留言 2: 获取未处理的留言
	 * 
	 */
	private int flag;

	@Autowired
	private MessageService messageService;

	/**
	 * @content 返回留言的json串，由ajax接收
	 */
	public void showMsg() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter pw = null;
		Message[] messages = null;
		response.setCharacterEncoding("utf-8");
		try {
			pw = response.getWriter();
			if (flag == 1) {
				messages = showAllMsg();
			} else {
				messages = showUnsolvedMsg();
			}
			String json = JSON.toJSONString(messages);
			pw.write("{\"returndata\":");
			pw.write(json);
			pw.write("}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally {
			pw.close();
		}
	}

	public String deleteMsg() {
		return null;
	}
	
	public String reply() {
		return null;
	}
	
	private Message[] showAllMsg() {
		return messageService.showAllMsg();
	}

	private Message[] showUnsolvedMsg() {
		return messageService.showUnsolverdMsg();
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
}
