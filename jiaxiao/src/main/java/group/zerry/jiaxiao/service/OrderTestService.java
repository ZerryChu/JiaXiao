package group.zerry.jiaxiao.service;

import group.zerry.jiaxiao.entity.OrderTestInfo;

public interface OrderTestService {
	public boolean registerForTest(int stu_id, int test_id, String date);
	
	public OrderTestInfo[] showInfo(String date);
	
}
