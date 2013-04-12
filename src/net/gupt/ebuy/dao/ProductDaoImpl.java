package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.util.HibernateUtils;

/**
 * ��Ʒ��̨�������ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class ProductDaoImpl implements ProductDao{

	public Product queryById(String id) {
		Integer iid = Integer.parseInt(id);
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//��ѯָ����Ʒ
		Product product = (Product) session.get(Product.class, iid);
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return product;
	}

	public List<Product> queryAll(int currentPage, int pageSize) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Product as p");
		int firstResult = currentPage*pageSize;
		//���ò�ѯ������е���ʼ����
		query.setFirstResult(firstResult);
		//���ò�ѯ������е��ܼ�¼��
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
