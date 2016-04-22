package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Message;

public interface MessageDao {
	public Message[] selectAllMsg();
	
	public Message[] selectUnsolvedMsg();
	
}
