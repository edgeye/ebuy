package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.Orders;
/**
 * 订单管理业务接口
 * @author glf
 *
 */
public interface OrderService {
	
	/**
	 * 保存订单
	 * @param order 新增订单
	 * @return
	 */
	public boolean saveOrder(Orders order);
	
	/**
	 * 查询用户当前页面下的订单记录
	 * @param name 用户名
	 * @param currentPage 当前页码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Orders> queryOrders(String name, int currentPage, int pageSize);
	
	/**
	 * 根据ID查询订单
	 * @param id 订单ID
	 * @return
	 */
	public Orders findOrder(String id);
	
	/**
	 * 删除指定ID下的订单
	 * @param id 订单ID
	 */
	public void deleteOrder(String id);
	
	/**
	 * 根据订单号查询订单
	 * @param itemid 订单号
	 * @return
	 */
	public Orders searchOrder(String itemid);
	
	/**
	 * 查询用户对应订单总数 
	 * @param name
	 * @return
	 */
	public int countOrders(String name);

}
