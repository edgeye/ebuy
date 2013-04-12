package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.dao.ProductDao;
import net.gupt.ebuy.dao.ProductDaoImpl;
import net.gupt.ebuy.pojo.Product;

/**
 * ��Ʒ��̨����ҵ��ӿ�ʵ����
 * @author glf
 *
 */
public class ProductServiceImpl implements ProductService{
	private ProductDao productDao = new ProductDaoImpl();

	public Product queryById(String id) {
		Product product = productDao.queryById(id);
		return product;
	}

	public List<Product> queryProducts(int currentPage, int pageSize) {
		List<Product> products = productDao.queryAll(currentPage, pageSize);
		return products;
	}

	public boolean updateProduct(Product product) {
		productDao.update(product);
		return true;
	}

	public boolean deleteProduct(String id) {
		//���Ȳ�ѯ��Ҫɾ������Ʒ
		Product product = productDao.queryById(id);
		productDao.delete(product);
		return true;
	}

	public boolean addProduct(Product product) {
		productDao.save(product);
		return true;
	}

}
