package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Message;

public interface MessageDao {
	public Message[] selectAllMsg();
	
	public Message[] selectUnsolvedMsg();
	
	public boolean   deleteMsg(int[] id);
	
	public boolean   addReply(int id, String content);
	
}
