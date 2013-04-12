package net.gupt.ebuy.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 商品类型后台管理数据访问接口实现类
 * @author glf
 *
 */
public class TypeDaoImpl implements TypeDao{

	public List<MainType> query(int currentPage, int pageSize) {
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//执行查询
		Query query = session.createQuery("from MainType as m");
		
		int firstResult = currentPage*pageSize;
		//设置查询结果集中的起始行数
		query.setFirstResult(firstResult);
		//设置查询结果集中的总记录数
		query.setMaxResults(pageSize);
		//获取结果集
		List<MainType> mainTypes = query.list();
		//提交事务
		tx.commit();
		//关闭会话
		session.close();
		return mainTypes;
	}

	public MainType findById(String id) {
		Integer iid = Integer.parseInt(id);
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		MainType mainType = (MainType) session.get(MainType.class, iid);
		
		tx.commit();
		session.close();
		return mainType;
	}

	public void update(MainType mainType) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(mainType);
		
		tx.commit();
		session.close();
	}

	public void delete(MainType mainType) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(mainType);
		
		tx.commit();
		session.close();
	}

	public void save(MainType mainType) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(mainType);
		
		tx.commit();
		session.close();
	}

}
