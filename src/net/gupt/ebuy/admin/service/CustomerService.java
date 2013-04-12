package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Orders;
/**
 * 客户信息后台管理业务接口
 * @author glf
 *
 */
public interface CustomerService {
	
	/**
	 * 查询当前页码下的客户信息列表
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Customer> listAllCustomer(int currentPage, int pageSize);
	
	/**
	 * 根据ID查询指定客户信息
	 * @param id 客户ID
	 * @return
	 */
	public Customer viewDetail(int id);
	
	/**
	 * 根据名称查询客户信息
	 * @param name 客户名称
	 * @return
	 */
	public Customer queryCust(String name);
	
}
