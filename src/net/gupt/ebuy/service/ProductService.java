package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.Product;
/**
 * 商品后台管理业务接口
 * @author glf
 *
 */
public interface ProductService {
	
	/**
	 * 根据ID查找指定商品
	 * @param id 商品ID
	 * @return
	 */
	public Product queryById(String id);
	
	/**
	 * 查询指定的商品记录
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Product> queryProducts(int currentPage, int pageSize);
	
	/**
	 * 更新指定商品
	 * @param product 商品
	 * @return
	 */
	public boolean updateProduct(Product product);
	
	/**
	 * 删除指定商品
	 * @param id 商品ID
	 * @return
	 */
	public boolean deleteProduct(String id);
	
	/**
	 * 添加新商品
	 * @param product 新增商品
	 * @return
	 */
	public boolean addProduct(Product product);

}
