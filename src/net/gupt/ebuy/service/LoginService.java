package net.gupt.ebuy.service;

import net.gupt.ebuy.pojo.Customer;
/**
 * 用户登录模块业务接口
 * @author glf
 *
 */
public interface LoginService {
	
	/**
	 * 用户登录方法
	 * @param name 用户名
	 * @param pass 密码
	 * @return
	 */
	public Customer login(String name, String pass);
	
	/**
	 * 更新用户信息
	 * @param customer 用户
	 */
	public void update(Customer customer);

}
