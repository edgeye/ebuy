package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * �û�ע��ģ�����ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class RegistDaoImpl implements RegistDao{

	public boolean submitReg(Customer customer) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(customer);
		
		tx.commit();
		session.close();
		return true;
	}

	public Customer findByName(String name) {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		
		//ִ�в�ѯ 
		Query query = session.createQuery("from Customer c where c.name = ?");
		//��hql��䴫����
		query.setParameter(0, name);
		
		//��ȡ�����
		List<Customer> customers = query.list();
		if(customers!=null && customers.size()>0) {
			//�û���Ψһ������ֻȡ��һ��
			return customers.get(0);
		}
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return null;
	}

}
