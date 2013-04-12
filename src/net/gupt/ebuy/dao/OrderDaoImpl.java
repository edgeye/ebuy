package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Orders;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 订单管理数据访问接口实现类
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
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//执行查询
		Query query = null;
		if(name==null) {
			query = session.createQuery("from Orders as o");
		}else {
			query = session.createQuery("from Orders as o where o.user = ?");
			//hql语句传参数
			query.setParameter(0, name);
		}
		//计算结果集起始行
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		query.setMaxResults(pageSize);
		//获取结果集
		List<Orders> orders = query.list();
		//提交事务
		tx.commit();
		//关闭会话
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
