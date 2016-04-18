package group.zerry.jiaxiao.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;

import group.zerry.jiaxiao.entity.OrderTestInfo;
import group.zerry.jiaxiao.entity.Test;
import group.zerry.jiaxiao.service.OrderTestService;
import group.zerry.jiaxiao.service.StudentService;

@Controller
@Scope("prototype")
public class OrderTestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	// 身份验证
	private String username;
	private String userToken;

	private int    stu_id;
	private int    test_id;
	private String state;
	private String date;
	private List<Test> tests;
	private List<OrderTestInfo> infos;

	@Autowired
	private OrderTestService orderTestService;

	@Autowired
	private StudentService studentService;

	public String registerForTest() {
		if (orderTestService.registerForTest(stu_id, test_id, date)) {
			return "add_success";
		} else {
			return "wrong";
		}
	}

	public String showInfoByStuId() {
		infos = new ArrayList<>();
		OrderTestInfo[] info = orderTestService.showInfoByStuId(stu_id);
		for (int i = 0; i < info.length; i++)
			infos.add(info[i]);
		return "query_success";
	}

	// 展示没有过期的符合条件的考试
	public String showTest() {
		tests = new ArrayList<>();
		try {
			// 获取学生考试的当前阶段
			state = studentService.showInfoById(stu_id).getState();
		} catch (Exception e) {
			// 写日志
			e.printStackTrace();
		}
		
		Test[] test = orderTestService.showTest();
		for (int i = 0; i < test.length; i++) {
			if (state.equals(test[i].getState()))
				tests.add(test[i]);
		}
		return "show_Test_sucess";
	}

	public String showInfo() {
		infos = new ArrayList<>();
		OrderTestInfo[] info = orderTestService.showInfo(date);
		for (int i = 0; i < info.length; i++) {
			infos.add(info[i]);
		}
		return "query_success";
		/*
		 * JSON HttpServletResponse response =
		 * ServletActionContext.getResponse(); PrintWriter out = null; try {
		 * response.setCharacterEncoding("utf-8"); out = response.getWriter();
		 * String info = JSON.toJSONString(orderTestService.showInfo(date));
		 * out.write(info.toCharArray()); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } finally {
		 * out.close(); }
		 */
	}

	public String showTestByDate() {
		infos = new ArrayList<>();
		OrderTestInfo[] info = orderTestService.showInfo(date);
		for (int i = 0;i < info.length; i++) {
			infos.add(info[i]);
		}
		return "query_success";
	}
	
	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public List<OrderTestInfo> getInfos() {
		return infos;
	}

	public void setInfos(List<OrderTestInfo> infos) {
		this.infos = infos;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
