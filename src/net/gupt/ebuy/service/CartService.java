package net.gupt.ebuy.service;

import java.util.List;
import java.util.Map;

import net.gupt.ebuy.pojo.CartItem;
/**
 * 购物车平台类
 * @author glf
 *
 */
public interface CartService {
	
	/**
	 * 往购物车中添加商品
	 * @param ci 商品
	 * @return
	 */
	public boolean add(CartItem ci);
	
	/**
	 * 查询购物车商品列表
	 * @return
	 */
	public Map<String, List<CartItem>> list();
	
	/**
	 * 清空购物车
	 * @return
	 */
	public boolean empty();
	
	/**
	 * 根据ID删除指定商品
	 * @param id 商品ID
	 */
	public void delete(int id);
	
	/**
	 * 根据ID恢复被删除的商品
	 * @param id 商品ID
	 */
	public void recover(int id);
	
	/**
	 * 统计总价格
	 * @return
	 */
	public double count();
	
	/**
	 * 修改商品数量 
	 * @param n 数量
	 * @param id 商品ID
	 */
	public void change(int n, int id);

}
