package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Product;

/**
 * ��Ʒ��̨�������ݷ��ʽӿ�
 * @author glf
 *
 */
public interface ProductDao {
	
	/**
	 * ������ƷID��ѯ��Ʒ
	 * @param id ��ƷID
	 * @return ��Ʒ
	 */
	public Product queryById(String id);
	
	/**
	 * ��ѯָ��ҳ���µ���Ʒ
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return ��Ʒ����
	 */
	public List<Product> queryAll(int currentPage, int pageSize);
	
	/**
	 * ������Ʒ
	 * @param product ��Ʒ
	 * @return
	 */
	public boolean update(Product product);
	
	/**
	 * ɾ����Ʒ
	 * @param product
	 * @return
	 */
	public boolean delete(Product product);
	
	/**
	 * ������Ʒ
	 * @param product
	 * @return
	 */
	public boolean save(Product product);

}
