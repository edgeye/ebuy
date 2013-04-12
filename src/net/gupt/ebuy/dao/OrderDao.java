package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Orders;
/**
 * 订单管理数据访问接口
 * @author Glf
 *
 */
public interface OrderDao {
	/**
	 * 保存
	 * @param order
	 * @return
	 */
	public boolean save(Orders order);
	
	/**
	 * 查询用户当前页码下订单记录
	 * @param name 用户名
	 * @param currentPage 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Orders> query(String name, int currentPage, int pageSize);
	
	/**
	 * 根据ID查询订单
	 * @param id 订单ID
	 * @return
	 */
	public Orders findById(String id);
	
	/**
	 * 删除
	 * @param order 订单
	 */
	public void delete(Orders order);
	
	/**
	 * 根据订单号查询订单
	 * @param itemid 订单号
	 * @return
	 */
	public Orders searchOrder(String itemid);
	
	/**
	 * 查询用户订单总数
	 * @param name 用户名
	 * @return
	 */
	public int countOrders(String name);

}
