package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import group.zerry.jiaxiao.dao.UserDao;
import group.zerry.jiaxiao.entity.Count;
import group.zerry.jiaxiao.service.UserService;
import group.zerry.jiaxiao.utils.EncodeTools;

import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		// 密码先加密再比对
		password = EncodeTools.encoder(password, password.substring(0, 4));
		Count count = userDao.userLogin(username, password);
		if (0 == count.getNumber()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean updatePwd(String username, String new_pwd) {
		// TODO Auto-generated method stub
		try {
			// 密码加密
			new_pwd = EncodeTools.encoder(new_pwd, new_pwd.substring(0, 4));
			userDao.updatePwd(username, new_pwd);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
