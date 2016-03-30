package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Count;
import group.zerry.jiaxiao.entity.User;

public interface UserDao {
	public Count userLogin(String username, String password);
	
}
