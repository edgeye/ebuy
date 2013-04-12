package net.gupt.ebuy.service;

import net.gupt.ebuy.dao.RegistDao;
import net.gupt.ebuy.dao.RegistDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * 用户注册模块业务接口实现类
 * @author glf
 *
 */
public class RegistServiceImpl implements RegistService{
	private RegistDao registDaoImpl = new RegistDaoImpl();

	public boolean submitReg(Customer customer) {
		boolean flag = registDaoImpl.submitReg(customer);
		return flag;
	}

	public Customer validName(String name) {
		Customer customer = registDaoImpl.findByName(name);
		return customer;
	}

}
