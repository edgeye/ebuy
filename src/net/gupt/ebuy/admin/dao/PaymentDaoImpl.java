package net.gupt.ebuy.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Payment;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 支付方式后台管理数据访问接口实现类
 * @author glf
 *
 */
public class PaymentDaoImpl implements PaymentDao{

	public List<Payment> query(int currentPage, int pageSize) {
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//执行查询
		Query query = session.createQuery("from Payment as p");
		
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		if(pageSize>0) {
			query.setMaxResults(pageSize);
		}
		//获取结果集
		List<Payment> payments = query.list();
		//提交事务
		tx.commit();
		//关闭会话
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
