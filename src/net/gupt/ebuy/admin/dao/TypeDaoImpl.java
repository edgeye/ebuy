package net.gupt.ebuy.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * ��Ʒ���ͺ�̨�������ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class TypeDaoImpl implements TypeDao{

	public List<MainType> query(int currentPage, int pageSize) {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//ִ�в�ѯ
		Query query = session.createQuery("from MainType as m");
		
		int firstResult = currentPage*pageSize;
		//���ò�ѯ������е���ʼ����
		query.setFirstResult(firstResult);
		//���ò�ѯ������е��ܼ�¼��
		query.setMaxResults(pageSize);
		//��ȡ�����
		List<MainType> mainTypes = query.list();
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return mainTypes;
	}

	public MainType findById(String id) {
		Integer iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		MainType mainType = (MainType) session.get(MainType.class, iid);
		
		tx.commit();
		session.close();
		return mainType;
	}

	public void update(MainType mainType) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(mainType);
		
		tx.commit();
		session.close();
	}

	public void delete(MainType mainType) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(mainType);
		
		tx.commit();
		session.close();
	}

	public void save(MainType mainType) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(mainType);
		
		tx.commit();
		session.close();
	}

}
