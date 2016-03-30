package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.dao.CarDao;
import group.zerry.jiaxiao.dao.CoachDao;
import group.zerry.jiaxiao.dao.OrderCarDao;
import group.zerry.jiaxiao.entity.Car;
import group.zerry.jiaxiao.entity.Coach;
import group.zerry.jiaxiao.entity.OrderCarInfo;
import group.zerry.jiaxiao.service.OrderCarService;


@Service(value = "carService")
public class OrderCarServiceImpl implements OrderCarService {

	@Autowired
	private CarDao      carDao;
	
	@Autowired
	private CoachDao    coachDao;
	
	@Autowired
	private OrderCarDao orderCarDao;
	
	@Override
	public boolean registerForCar(int stu_id, int car_id, int coach_id, String start_time) {
		// TODO Auto-generated method stub
		try {
			orderCarDao.addOrderCarInfo(stu_id, car_id, coach_id, start_time);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public OrderCarInfo[] showCarOrderInfo(String date) {
		// TODO Auto-generated method stub
		return orderCarDao.selectOrderCarByDate(date);
	}

	@Override
	public Car[] getCarInRest(String date) {
		// TODO Auto-generated method stub
		return carDao.selectCarsInRest(date);
	}

	@Override
	public Coach[] getCoachInRest(String date) {
		// TODO Auto-generated method stub
		return coachDao.selectCoachInRest(date);
	}

}
