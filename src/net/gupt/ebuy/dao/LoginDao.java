package net.gupt.ebuy.dao;

import net.gupt.ebuy.pojo.Customer;
/**
 * 用户登录模块数据访问接口
 * @author glf
 *
 */
public interface LoginDao {
	/**
	 * 更新用户信息
	 * @param customer 用户
	 */
	public void update(Customer customer);
}
