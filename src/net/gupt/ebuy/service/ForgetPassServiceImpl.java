package net.gupt.ebuy.service;

import net.gupt.ebuy.dao.RegistDao;
import net.gupt.ebuy.dao.RegistDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * 查询密码业务接口实现类
 * @author glf
 *
 */
public class ForgetPassServiceImpl implements ForgetPassService{
	private RegistDao registDaoImpl = new RegistDaoImpl();

	public Customer initPass(String name) {
		Customer customer = registDaoImpl.findByName(name);
		return customer;
	}

}
