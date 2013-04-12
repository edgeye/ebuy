package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 用户注册模块数据访问接口实现类
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
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		
		//执行查询 
		Query query = session.createQuery("from Customer c where c.name = ?");
		//给hql语句传参数
		query.setParameter(0, name);
		
		//获取结果集
		List<Customer> customers = query.list();
		if(customers!=null && customers.size()>0) {
			//用户名唯一，所以只取第一个
			return customers.get(0);
		}
		//提交事务
		tx.commit();
		//关闭会话
		session.close();
		return null;
	}

}
