package net.gupt.ebuy.service;

import net.gupt.ebuy.pojo.Customer;
/**
 * 用户注册模块业务接口
 * @author glf
 *
 */
public interface RegistService {
	
	/**
	 * 注册用户信息
	 * @param customer
	 * @return
	 */
	public boolean submitReg(Customer customer);
	
	/**
	 * 验证用户名是否被占用
	 * @param name 用户名
	 * @return
	 */
	public Customer validName(String name);

}
