package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.entity.Car;
import group.zerry.jiaxiao.entity.Coach;
import group.zerry.jiaxiao.entity.OrderCarInfo;
import group.zerry.jiaxiao.service.OrderCarService;


@Service(value = "carService")
public class OrderCarServiceImpl implements OrderCarService {

	@Override
	public boolean registerForCar(int stu_id, int car_id, int coach_id, String start_time) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderCarInfo[] showCarOrderInfo(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car getCarInRest(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coach getCoachInRest(String date) {
		// TODO Auto-generated method stub
		return null;
	}

}
