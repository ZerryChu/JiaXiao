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

import group.zerry.jiaxiao.service.OrderCarService;

@Controller  
@Scope("prototype") 
public class OrderCarAction extends ActionSupport {
	private int    car_id;
	private int	   stu_id;
	private int    coach_id;
	private String date;

	@Autowired
	private OrderCarService orderCarService;
	
	public void findCoachInRest() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			String info = JSON.toJSONString(orderCarService.getCoachInRest(date));
			out.write(info.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
	
	public void findCarInRest() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			String info = JSON.toJSONString(orderCarService.getCarInRest(date));
			out.write(info.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
	
	public String registerForCar(int stu_id, int car_id, int coach_id, String start_time) {
		if (orderCarService.registerForCar(stu_id, car_id, coach_id, start_time)) {
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
			String info = JSON.toJSONString(orderCarService.showCarOrderInfo(date));
			out.write(info.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
	
	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public int getCoach_id() {
		return coach_id;
	}

	public void setCoach_id(int coach_id) {
		this.coach_id = coach_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
