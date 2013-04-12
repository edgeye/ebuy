package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 主页信息数据访问接口实现类
 * @author glf
 *
 */
public class MainDaoImpl implements MainDao {

	public List<Product> findLatestPro() {
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//最新上架商品查询按添加时间倒序输出
		Query query = session.createQuery("from Product as p order by p.time desc");
		//获取结果集
		List<Product> products = query.list();
		//提交事务
		tx.commit();
		//关闭会话
		session.close();
		return products;
	}

	public List<Product> findPromotPro() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		//促销商品查询依据价格排序输出 
		Query query = session.createQuery("from Product as p order by p.price");
		
		List<Product> products = query.list();
		
		tx.commit();
		session.close();
		return products;
	}

	public List<Notice> findNotice(int currentPage, int pageSize) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Notice as n");
		
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		query.setMaxResults(pageSize);
		//获取结果集
		List<Notice> notices = query.list();
		
		tx.commit();
		session.close();
		return notices;
	}

	public List<MainType> listType() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from MainType as m");
		
		List<MainType> list = query.list();
		
		tx.commit();
		session.close();
		return list;
	}

	public List<Product> searchPro(String type, String name) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Product as p where p.type = ? and p.name like ?");
		query.setParameter(0, type);
		query.setParameter(1, "%" + name + "%");
		
		List<Product> products = query.list();
		
		tx.commit();
		session.close();
		return products;
	}

	public List<Notice> findNotice() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Notice as n");
		
		List<Notice> notices = query.list();
		
		tx.commit();
		session.close();
		return notices;
	}

	public Product findById(String id) {
		int iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		Product product = (Product) session.get(Product.class, iid);
		tx.commit();
		session.close();
		return product;
	}

}
