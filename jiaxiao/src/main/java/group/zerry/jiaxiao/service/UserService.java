package group.zerry.jiaxiao.service;

public interface UserService {
	public boolean login(String username, String password);
	
	public boolean updatePwd(String username, String new_pwd);
}
