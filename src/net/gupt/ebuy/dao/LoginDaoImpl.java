package net.gupt.ebuy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 用户登录模块数据访问接口实现类
 * @author Administrator
 *
 */
public class LoginDaoImpl implements LoginDao{

	public void update(Customer customer) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(customer);
		
		tx.commit();
		session.close();
	}

}
