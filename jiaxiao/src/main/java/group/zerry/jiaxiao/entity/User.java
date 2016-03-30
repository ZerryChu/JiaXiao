package group.zerry.jiaxiao.entity;

public class User {
	private int    id;
	private String name;
	private String username;
	private String password;
	private int    auth_level;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAuth_level() {
		return auth_level;
	}
	public void setAuth_level(int auth_level) {
		this.auth_level = auth_level;
	}
	
}
