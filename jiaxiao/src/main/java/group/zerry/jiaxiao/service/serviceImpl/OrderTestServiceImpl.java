package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.dao.OrderCarDao;
import group.zerry.jiaxiao.dao.OrderTestDao;
import group.zerry.jiaxiao.dao.StudentDao;
import group.zerry.jiaxiao.dao.TestDao;
import group.zerry.jiaxiao.entity.OrderTestInfo;
import group.zerry.jiaxiao.entity.Test;
import group.zerry.jiaxiao.service.OrderTestService;

@Service(value = "testService")
public class OrderTestServiceImpl implements OrderTestService {

	@Autowired
	private OrderTestDao orderTestDao;
	
	@Autowired
	private TestDao      testDao;
	
	@Override
	public boolean registerForTest(int stu_id, int test_id) {
		// TODO Auto-generated method stub
		try {
			orderTestDao.addOrderTest(stu_id, test_id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public OrderTestInfo[] showInfo(String date) {
		// TODO Auto-generated method stub
		return orderTestDao.selectOrderTestByDate(date);		
	}

	@Override
	public Test[] showTest() {
		// TODO Auto-generated method stub
		return testDao.showTest();
	}

	@Override
	public OrderTestInfo[] showInfoByStuId(int stu_id) {
		// TODO Auto-generated method stub
		return orderTestDao.selectOrderTestByStuId(stu_id);
	}

}
