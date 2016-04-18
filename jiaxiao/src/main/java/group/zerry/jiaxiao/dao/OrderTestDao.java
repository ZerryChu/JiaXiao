package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.OrderTestInfo;

public interface OrderTestDao {
	OrderTestInfo[] selectOrderTestByDate(String date);
	
	OrderTestInfo[] selectOrderTestByStuId(int stu_id);
	
	void addOrderTest(int stu_id, int test_id);
}
