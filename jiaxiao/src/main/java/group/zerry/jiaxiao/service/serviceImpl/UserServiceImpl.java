package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import group.zerry.jiaxiao.dao.UserDao;
import group.zerry.jiaxiao.entity.Count;
import group.zerry.jiaxiao.service.UserService;
import group.zerry.jiaxiao.utils.EncodeTools;

import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		password = EncodeTools.encoder(password, password.substring(0, 4));
		Count count = userdao.userLogin(username, password);
		if (0 == count.getNumber()) {
			return false;
		} else {
			return true;
		}
	}
	
}
