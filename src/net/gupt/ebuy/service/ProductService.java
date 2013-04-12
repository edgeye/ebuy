package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.Product;
/**
 * ��Ʒ��̨����ҵ��ӿ�
 * @author glf
 *
 */
public interface ProductService {
	
	/**
	 * ����ID����ָ����Ʒ
	 * @param id ��ƷID
	 * @return
	 */
	public Product queryById(String id);
	
	/**
	 * ��ѯָ������Ʒ��¼
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Product> queryProducts(int currentPage, int pageSize);
	
	/**
	 * ����ָ����Ʒ
	 * @param product ��Ʒ
	 * @return
	 */
	public boolean updateProduct(Product product);
	
	/**
	 * ɾ��ָ����Ʒ
	 * @param id ��ƷID
	 * @return
	 */
	public boolean deleteProduct(String id);
	
	/**
	 * �������Ʒ
	 * @param product ������Ʒ
	 * @return
	 */
	public boolean addProduct(Product product);

}
