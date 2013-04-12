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
 * ��ҳ��Ϣ���ݷ��ʽӿ�ʵ����
 * @author glf
 *
 */
public class MainDaoImpl implements MainDao {

	public List<Product> findLatestPro() {
		//�����Ự
		Session session = HibernateUtils.openSession();
		//��������
		Transaction tx = session.beginTransaction();
		//�����ϼ���Ʒ��ѯ�����ʱ�䵹�����
		Query query = session.createQuery("from Product as p order by p.time desc");
		//��ȡ�����
		List<Product> products = query.list();
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
		return products;
	}

	public List<Product> findPromotPro() {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		//������Ʒ��ѯ���ݼ۸�������� 
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
		//���ò�ѯ������е���ʼ����
		query.setFirstResult(firstResult);
		//���ò�ѯ������е��ܼ�¼��
		query.setMaxResults(pageSize);
		//��ȡ�����
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
