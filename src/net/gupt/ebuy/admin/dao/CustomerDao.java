package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Orders;
/**
 * 客户信息后台管理数据访问接口
 * @author glf
 *
 */
public interface CustomerDao {
	
	/**
	 * 查询当前页码下所有客户信息
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Customer> findAll(int currentPage, int pageSize);
	
	/**
	 * 根据ID查询指定客户信息
	 * @param id 客户ID
	 * @return
	 */
	public Customer findById(int id);
	
	/**
	 * 根据名称查找客户信息
	 * @param name 客户名称
	 * @return
	 */
	public Customer findByName(String name);
	
}
