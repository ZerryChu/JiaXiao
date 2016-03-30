package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.OrderCarInfo;

public interface OrderCarDao {
	void addOrderCarInfo(int stu_id, int car_id, int coach_id, String date);

	OrderCarInfo[] selectOrderCarByDate(String date);
		
}
