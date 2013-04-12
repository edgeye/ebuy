package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * �������ģ�����ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class MessageDaoImpl implements MessageDao{

	public boolean saveMess(Idea idea) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.save(idea);
		tx.commit();
		session.close();
		return true;
	}

	public List<Idea> findAll() {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//���������ѯ���������ʱ�䵹����� 
		Query query = session.createQuery("from Idea as i order by new_time desc");
		//��ȡ�����
		List<Idea> ideas = query.list();
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return ideas;
	}

}
