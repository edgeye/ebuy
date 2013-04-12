package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.admin.dao.NoticeDao;
import net.gupt.ebuy.admin.dao.NoticeDaoImpl;
import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
/**
 * 公告信息后台管理业务接口
 * @author glf
 *
 */
public class NoticeServiceImpl implements NoticeService{
	private NoticeDao noticeDao = new NoticeDaoImpl();

	public Notice findNotice(String id) {
		Notice notice = noticeDao.findById(id);
		return notice;
	}

	public void updateNotice(Notice notice) {
		noticeDao.update(notice);
	}

	public void deleteNotice(Notice notice) {
		noticeDao.delete(notice);
	}

	public void sendNotice(Notice notice) {
		noticeDao.save(notice);
	}

	public List<Idea> queryIdeas(int currentPage, int pageSize) {
		List<Idea> ideas = noticeDao.query(currentPage, pageSize);
		return ideas;
	}

	public void replyIdeas(Idea idea) {
		noticeDao.updateIdea(idea);
	}

	public Idea findIdea(String id) {
		Idea idea = noticeDao.findIdeaById(id);
		return idea;
	}

	public void deleteIdea(Idea idea) {
		noticeDao.deleteIdea(idea);
	}

}
