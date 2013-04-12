package net.gupt.ebuy.dao;

import net.gupt.ebuy.pojo.Customer;
/**
 * 用户注册模块数据访问接口
 * @author glf
 *
 */
public interface RegistDao {
	
	/**
	 * 注册用户信息
	 * @param customer 新增用户
	 * @return
	 */
	public boolean submitReg(Customer customer);
	
	/**
	 * 根据名称查询用户信息
	 * @param name 用户名称
	 * @return
	 */
	public Customer findByName(String name);
}
