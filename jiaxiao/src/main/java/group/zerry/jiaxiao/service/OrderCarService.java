package group.zerry.jiaxiao.service;

import group.zerry.jiaxiao.entity.Car;
import group.zerry.jiaxiao.entity.Coach;
import group.zerry.jiaxiao.entity.OrderCarInfo;

public interface OrderCarService {
	boolean registerForCar(int stu_id, int car_id, int coach_id, String start_time);
	
	OrderCarInfo[] showCarOrderInfo(String date);
	
	Car[] getCarInRest(String date);
	
	Coach[] getCoachInRest(String date);
}
