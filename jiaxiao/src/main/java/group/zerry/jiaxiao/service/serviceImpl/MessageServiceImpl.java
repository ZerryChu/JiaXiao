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
	
}
