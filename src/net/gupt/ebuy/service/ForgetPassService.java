package net.gupt.ebuy.service;

import net.gupt.ebuy.pojo.Customer;
/**
 * 查询用户密码业务接口
 * @author glf
 *
 */
public interface ForgetPassService {
	
	/**
	 * 根据用户名称查找用户信息
	 * @param name 用户名称
	 * @return
	 */
	public Customer initPass(String name);
}
