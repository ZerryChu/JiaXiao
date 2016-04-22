package group.zerry.jiaxiao.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import group.zerry.jiaxiao.entity.Car;
import group.zerry.jiaxiao.entity.Coach;
import group.zerry.jiaxiao.entity.OrderCarInfo;
import group.zerry.jiaxiao.service.OrderCarService;

/**
 * @author Zirui Zhu
 * @content 练车相关： 练车记录查询 练车记录添加 练车记录删除
 * 
 */
@Controller  
@Scope("prototype") 
public class OrderCarAction extends ActionSupport {
	
	// 身份验证
	private String          username;
	private String          userToken;

	private int             order_id;
	private int    		    car_id;
	private int	   		    stu_id;
	private int    		    coach_id;
	private String 		    date;
	private Coach[]         coachs;
	private Car[]           cars;
	private OrderCarInfo[]  orders;
	
	@Autowired
	private OrderCarService orderCarService;
	
	// 获取当天空闲教练
	private void findCoachInRest() {
		coachs = orderCarService.getCoachInRest(date);
	}
	
	// 获取当天空闲车辆
	private void findCarInRest() {
		cars = orderCarService.getCarInRest(date);
	}
	
	// 获取当天空闲的车辆与教练
	public String show() {
		findCarInRest();
		findCoachInRest();
		return "searchTime_success";
	}
	
	public String registerForCarOrder() {
		if (orderCarService.registerForCar(stu_id, car_id, coach_id, date)) {
			return "add_success";
		} else {
			return "wrong";
		}
	}
	
	public String showInfo() {
		orders = orderCarService.showCarOrderInfo(date);
		return "query_success";
	}
	
	// 撤销练车记录
	public String deleteOrder() {
		if(true == orderCarService.deleteOrder(order_id))
			return "delete_success";
		else
			return "erorr";
	}

	public OrderCarInfo[] getOrders() {
		return orders;
	}

	public void setOrders(OrderCarInfo[] orders) {
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
	
	public Coach[] getCoachs() {
		return coachs;
	}

	public void setCoachs(Coach[] coachs) {
		this.coachs = coachs;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
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
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

}
