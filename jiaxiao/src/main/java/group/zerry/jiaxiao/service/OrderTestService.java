package group.zerry.jiaxiao.service;

import group.zerry.jiaxiao.entity.OrderTestInfo;
import group.zerry.jiaxiao.entity.Test;

public interface OrderTestService {
	public boolean 		   registerForTest(int stu_id, int test_id);
	
	public OrderTestInfo[] showInfo(String date);
	
	public OrderTestInfo[] showInfoByStuId(int stu_id);
	
	public Test[]  		   showTest();
	
}
