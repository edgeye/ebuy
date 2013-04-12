package net.gupt.ebuy.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Payment;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * ֧����ʽ��̨�������ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class PaymentDaoImpl implements PaymentDao{

	public List<Payment> query(int currentPage, int pageSize) {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//ִ�в�ѯ
		Query query = session.createQuery("from Payment as p");
		
		int firstResult = currentPage*pageSize;
		//���ò�ѯ������е���ʼ����
		query.setFirstResult(firstResult);
		//���ò�ѯ������е��ܼ�¼��
		if(pageSize>0) {
			query.setMaxResults(pageSize);
		}
		//��ȡ�����
		List<Payment> payments = query.list();
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return payments;
	}

	public Payment findById(String id) {
		Integer iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Payment payment = (Payment) session.get(Payment.class, iid);
		
		tx.commit();
		session.close();
		return payment;
	}

	public void update(Payment payment) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(payment);
		
		tx.commit();
		session.close();
	}

	public void delete(Payment payment) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(payment);
		
		tx.commit();
		session.close();
	}

	public void save(Payment payment) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(payment);
		
		tx.commit();
		session.close();
	}

}
