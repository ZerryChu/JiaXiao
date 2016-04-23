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
	private String 			username;
	private String		    userToken;

	private int  	        stu_id;
	private int    			test_id;
	private String		    state;
	private String 			date;
	private Test[]          tests;
	private List<Test>      testList;
	private OrderTestInfo[] infos;

	@Autowired
	private OrderTestService orderTestService;

	@Autowired
	private StudentService studentService;

	public String showTestByStuId() {
		infos = orderTestService.showInfoByStuId(stu_id);
		return "query_success";
	}
	
	public String registerForTest() {
		if (orderTestService.registerForTest(stu_id, test_id)) {
			return "add_success";
		} else {
			return "error";
		}
	}
	
	// 展示没有过期的符合条件的考试
	public String showTest() {
		testList = new ArrayList<>();
		try {
			// 获取学生考试的当前阶段
			state = studentService.showInfoById(stu_id).getState();
		} catch (Exception e) {
			// 写日志
			e.printStackTrace();
		}
		
		Test[] temp = orderTestService.showTest();
		for (int i = 0;i < temp.length; i++)
			if (temp[i].getState().equals(state)) {
				testList.add(temp[i]);
			}
		return "show_Test_success";
	}

	public String showInfo() {
		infos = orderTestService.showInfo(date);
		return "query_success";
	}

	public String showTestByDate() {
		infos = orderTestService.showInfo(date);
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

	public Test[] getTests() {
		return tests;
	}

	public void setTests(Test[] tests) {
		this.tests = tests;
	}

	public OrderTestInfo[] getInfos() {
		return infos;
	}

	public void setInfos(OrderTestInfo[] infos) {
		this.infos = infos;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

}
