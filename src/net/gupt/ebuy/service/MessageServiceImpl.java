package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.dao.MessageDao;
import net.gupt.ebuy.dao.MessageDaoImpl;
import net.gupt.ebuy.pojo.Idea;
/**
 * 意见反馈模块业务接口实现类
 * @author glf
 *
 */
public class MessageServiceImpl implements MessageService{
	private MessageDao messageDao = new MessageDaoImpl();

	public boolean submitMessage(Idea idea) {
		messageDao.saveMess(idea);
		return true;
	}

	public List<Idea> queryMessage() {
		List<Idea> ideas = messageDao.findAll();
		return ideas;
	}

}
