package group.zerry.jiaxiao.service;

import group.zerry.jiaxiao.entity.Message;

public interface MessageService {
	public Message[] showUnsolverdMsg();

	public Message[] showAllMsg();

	public boolean   deleteMsg(int[] id);
	
	public boolean   replyMsg(int id, String content);
}
