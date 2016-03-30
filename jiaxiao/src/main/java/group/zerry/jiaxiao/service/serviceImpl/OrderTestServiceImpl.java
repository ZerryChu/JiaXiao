package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.dao.OrderTestDao;
import group.zerry.jiaxiao.dao.StudentDao;
import group.zerry.jiaxiao.dao.TestDao;
import group.zerry.jiaxiao.entity.OrderTestInfo;
import group.zerry.jiaxiao.service.OrderTestService;

@Service(value = "testService")
public class OrderTestServiceImpl implements OrderTestService {

	@Autowired
	private OrderTestDao orderTestDao;
	
	@Override
	public boolean registerForTest(int stu_id, int test_id, String date) {
		// TODO Auto-generated method stub
		try {
			orderTestDao.addOrderTest(stu_id, test_id, date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public OrderTestInfo[] showInfo(String date) {
		// TODO Auto-generated method stub
		return orderTestDao.selectOrderTestByDate(date);		
	}

}
