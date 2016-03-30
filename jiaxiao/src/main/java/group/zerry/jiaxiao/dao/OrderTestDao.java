package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.OrderTestInfo;

public interface OrderTestDao {
	OrderTestInfo[] selectOrderTestByDate(String date);
	
	void addOrderTest(int stu_id, int test_id, String date);
}
