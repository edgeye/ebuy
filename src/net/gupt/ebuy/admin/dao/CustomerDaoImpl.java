package net.gupt.ebuy.admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Orders;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * �ͻ���Ϣ��̨�������ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class CustomerDaoImpl implements CustomerDao{

	public List<Customer> findAll(int currentPage, int pageSize) {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//ִ�в�ѯ
		Query query = session.createQuery("from Customer as c");
		//��ȡ�����
		List<Customer> customers = query.list();
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return customers;
	}

	public Customer findById(int id) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Customer as c where c.id = ?");
		query.setParameter(0, id);
		
		List<Customer> customers = query.list();
		
		tx.commit();
		session.close();
		return customers.get(0);
	}

	public Customer findByName(String name) {
		Customer customer = null;
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Customer as c where c.name = ?");
		query.setParameter(0, name);
		
		List<Customer> customers = query.list();
		if(customers!=null && customers.size()>0) {
			customer = customers.get(0);
		}
		
		tx.commit();
		session.close();
		return customer;
	}

}
