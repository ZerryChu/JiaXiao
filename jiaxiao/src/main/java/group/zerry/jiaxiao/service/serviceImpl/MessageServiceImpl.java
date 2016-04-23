package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.dao.MessageDao;
import group.zerry.jiaxiao.entity.Message;
import group.zerry.jiaxiao.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageDao messageDao;
	
	@Override
	public Message[] showUnsolverdMsg() {
		// TODO Auto-generated method stub
		return messageDao.selectUnsolvedMsg();
	}

	@Override
	public Message[] showAllMsg() {
		// TODO Auto-generated method stub
		return messageDao.selectAllMsg();
	}

	@Override
	public boolean deleteMsg(int[] id) {
		// TODO Auto-generated method stub
		return messageDao.deleteMsg(id);
	}

	@Override
	public boolean replyMsg(int id, String content) {
		// TODO Auto-generated method stub
		return messageDao.addReply(id, content);
	}
	
}
