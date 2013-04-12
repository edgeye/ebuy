package net.gupt.ebuy.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * ������Ϣ��̨�������ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class NoticeDaoImpl implements NoticeDao{

	public Notice findById(String id) {
		//��IDת��Ϊ����
		Integer iid = Integer.parseInt(id);
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//ִ�в�ѯ
		Notice notice = (Notice) session.get(Notice.class, iid);
		//�ύ����
		tx.commit();
		//�رջỰ
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
		//���ò�ѯ������е���ʼ����
		query.setFirstResult(firstResult);
		//���ò�ѯ������е��ܼ�¼��
		query.setMaxResults(pageSize);
		//��ȡ�����
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
