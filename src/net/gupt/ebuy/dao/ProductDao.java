package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Product;

/**
 * 商品后台管理数据访问接口
 * @author glf
 *
 */
public interface ProductDao {
	
	/**
	 * 根据商品ID查询商品
	 * @param id 商品ID
	 * @return 商品
	 */
	public Product queryById(String id);
	
	/**
	 * 查询指定页码下的商品
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return 商品集合
	 */
	public List<Product> queryAll(int currentPage, int pageSize);
	
	/**
	 * 更新商品
	 * @param product 商品
	 * @return
	 */
	public boolean update(Product product);
	
	/**
	 * 删除商品
	 * @param product
	 * @return
	 */
	public boolean delete(Product product);
	
	/**
	 * 保存商品
	 * @param product
	 * @return
	 */
	public boolean save(Product product);

}
