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

import group.zerry.jiaxiao.entity.Car;
import group.zerry.jiaxiao.entity.Coach;
import group.zerry.jiaxiao.entity.OrderCarInfo;
import group.zerry.jiaxiao.service.OrderCarService;

/*
 * @author Zirui Zhu
 * @content 练车相关
 */
@Controller  
@Scope("prototype") 
public class OrderCarAction extends ActionSupport {
	
	// 身份验证
	private String      username;
	private String      userToken;

	private int    		car_id;
	private int	   		stu_id;
	private int    		coach_id;
	private String 		date;
	private List<Coach> coachs;
	private List<Car>   cars;
	private List<OrderCarInfo> orders;
	
	@Autowired
	private OrderCarService orderCarService;
	
	public void findCoachInRest() {
		coachs = new ArrayList<>();
		Coach[] coach = orderCarService.getCoachInRest(date);
		for (int i = 0;i < coach.length; i++) {
			coachs.add(coach[i]);
		}
		
		/* JSON
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
		*/
	}
	
	public void findCarInRest() {
		cars = new ArrayList<>();
		Car[] car = orderCarService.getCarInRest(date);
		for (int i = 0;i < car.length; i++) {
			cars.add(car[i]);
		}
		/* JSON
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
		*/
	}
	
	public String show() {
		findCarInRest();
		findCoachInRest();
		return "searchTime_success";
	}
	
	public String registerForCar() {
		if (orderCarService.registerForCar(stu_id, car_id, coach_id, date)) {
			return "add_success";
		} else {
			return "wrong";
		}
	}
	
	public String showInfo() {
		orders = new ArrayList<>();
		OrderCarInfo[] order = orderCarService.showCarOrderInfo(date);
		for (int i = 0;i < order.length; i++) {
			orders.add(order[i]);
		}
		return "query_success";
		/* JSON
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
		*/
	}
	
	public List<OrderCarInfo> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderCarInfo> orders) {
		this.orders = orders;
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
	
	public List<Coach> getCoachs() {
		return coachs;
	}

	public void setCoachs(List<Coach> coachs) {
		this.coachs = coachs;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
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
