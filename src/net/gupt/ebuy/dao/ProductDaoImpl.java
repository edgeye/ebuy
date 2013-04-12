package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.util.HibernateUtils;

/**
 * 商品后台管理数据访问接口实现类
 * @author glf
 *
 */
public class ProductDaoImpl implements ProductDao{

	public Product queryById(String id) {
		Integer iid = Integer.parseInt(id);
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//查询指定商品
		Product product = (Product) session.get(Product.class, iid);
		//提交事务
		tx.commit();
		//关闭会话
		session.close();
		return product;
	}

	public List<Product> queryAll(int currentPage, int pageSize) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Product as p");
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		query.setMaxResults(pageSize);
		
		List<Product> products = query.list();
		
		tx.commit();
		session.close();
		return products;
	}
	
	public boolean update(Product product) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(product);
		
		tx.commit();
		session.close();
		return true;
	}

	public boolean delete(Product product) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(product);
		
		tx.commit();
		session.close();
		return true;
	}

	public boolean save(Product product) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(product);
		
		tx.commit();
		session.close();
		return true;
	}

}
