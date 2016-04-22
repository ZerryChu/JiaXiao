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
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public OrderCarInfo[] showCarOrderInfo(String date) {
		// TODO Auto-generated method stub
		try {
			return orderCarDao.selectOrderCarByDate(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Car[] getCarInRest(String date) {
		// TODO Auto-generated method stub
		try {
			return carDao.selectCarsInRest(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Coach[] getCoachInRest(String date) {
		// TODO Auto-generated method stub
		try {
			return coachDao.selectCoachInRest(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		try {
			orderCarDao.deleteOrder(id);
			return true;
		} catch(Exception e) {
			return false;
		}
	}

}
