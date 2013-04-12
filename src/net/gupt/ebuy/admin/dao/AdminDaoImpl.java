package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Admin;
import net.gupt.ebuy.util.HibernateUtils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 商城后台管理数据访问接口实现类
 * @author glf
 *
 */
public class AdminDaoImpl implements AdminDao{

	public boolean save(Admin admin) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(admin);
		
		tx.commit();
		session.close();
		return true;
	}

	public Admin findByName(String name) {
		Admin admin = null;
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Admin as a where a.name = ?");
		query.setParameter(0, name);
		
		List<Admin> admins = query.list();
		if(admins!=null && admins.size()>0) {
			admin = admins.get(0);
		}
		
		tx.commit();
		session.close();
		return admin;
	}

	public List<Admin> query(int currentPage, int pageSize) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Admin as a");
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		query.setMaxResults(pageSize);
		
		//获取结果集
		List<Admin> admins = query.list();
		
		tx.commit();
		session.close();
		return admins;
	}

	public Admin findById(String id) {
		Integer iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Admin admin = (Admin) session.get(Admin.class, iid);
		
		tx.commit();
		session.close();
		return admin;
	}

	public void update(Admin admin) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(admin);
		
		tx.commit();
		session.close();
	}

	public void delete(Admin admin) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(admin);
		
		tx.commit();
		session.close();
	}

}
