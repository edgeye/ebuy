package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Orders;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * �����������ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class OrderDaoImpl implements OrderDao{

	public boolean save(Orders order) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(order);
		
		tx.commit();
		session.close();
		return true;
	}

	public List<Orders> query(String name, int currentPage, int pageSize) {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//ִ�в�ѯ
		Query query = null;
		if(name==null) {
			query = session.createQuery("from Orders as o");
		}else {
			query = session.createQuery("from Orders as o where o.user = ?");
			//hql��䴫����
			query.setParameter(0, name);
		}
		//����������ʼ��
		int firstResult = currentPage*pageSize;
		//���ò�ѯ������е���ʼ����
		query.setFirstResult(firstResult);
		//���ò�ѯ������е��ܼ�¼��
		query.setMaxResults(pageSize);
		//��ȡ�����
		List<Orders> orders = query.list();
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return orders;
	}

	public Orders findById(String id) {
		Integer iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Orders order = (Orders) session.get(Orders.class, iid);
		
		tx.commit();
		session.close();
		return order;
	}

	public void delete(Orders order) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(order);
		
		tx.commit();
		session.close();
	}

	public Orders searchOrder(String itemid) {
		Orders order = null;
		int id = Integer.parseInt(itemid);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Orders as o where o.itemid = ?");
		query.setParameter(0, id);
		List<Orders> orders = query.list();
		if(orders!=null && orders.size()>0) {
			order = orders.get(0);
		}
		
		tx.commit();
		session.close();
		return order;
	}
	
	public int countOrders(String name) {
		int count = 0;
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Orders as o where o.user = ?");
		query.setParameter(0, name);
		
		List<Orders> orders = query.list();
		if(orders!=null && orders.size()>0) {
			count = orders.size();
		}
		return count;
	}

}
