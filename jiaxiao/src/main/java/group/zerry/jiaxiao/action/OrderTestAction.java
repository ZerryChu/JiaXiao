package group.zerry.jiaxiao.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;

import group.zerry.jiaxiao.service.OrderTestService;

public class OrderTestAction extends ActionSupport {
	private int stu_id;
	private int test_id;
	private String date;

	@Autowired
	private OrderTestService orderTestService;

	public String registerForTest() {
		if (orderTestService.registerForTest(stu_id, test_id, date)) {
			return "success";
		} else {
			return "wrong";
		}
	}
	
	public void showInfo() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			String info = JSON.toJSONString(orderTestService.showInfo(date));
			out.write(info.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
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
	
}
