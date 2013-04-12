package net.gupt.ebuy.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 公告信息后台管理数据访问接口实现类
 * @author glf
 *
 */
public class NoticeDaoImpl implements NoticeDao{

	public Notice findById(String id) {
		//将ID转换为整型
		Integer iid = Integer.parseInt(id);
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//执行查询
		Notice notice = (Notice) session.get(Notice.class, iid);
		//提交事务
		tx.commit();
		//关闭会话
		session.close();
		return notice;
	}

	public void update(Notice notice) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.update(notice);
		tx.commit();
		session.close();
	}

	public void delete(Notice notice) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(notice);
		tx.commit();
		session.close();
	}

	public void save(Notice notice) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.save(notice);
		tx.commit();
		session.close();
	}

	public List<Idea> query(int currentPage, int pageSize) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Idea as i");
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		query.setMaxResults(pageSize);
		//获取结果集
		List<Idea> ideas = query.list();
		tx.commit();
		session.close();
		return ideas;
	}

	public void updateIdea(Idea idea) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.update(idea);
		tx.commit();
		session.close();
	}

	public Idea findIdeaById(String id) {
		Integer iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Idea idea = (Idea) session.get(Idea.class, iid);
		tx.commit();
		session.close();
		return idea;
	}

	public void deleteIdea(Idea idea) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(idea);
		tx.commit();
		session.close();
	}

}
