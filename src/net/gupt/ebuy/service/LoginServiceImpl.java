package net.gupt.ebuy.service;

import net.gupt.ebuy.dao.LoginDao;
import net.gupt.ebuy.dao.LoginDaoImpl;
import net.gupt.ebuy.dao.RegistDao;
import net.gupt.ebuy.dao.RegistDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * 用户登录模块业务接口实现类
 * @author glf
 *
 */
public class LoginServiceImpl implements LoginService{
	private RegistDao registDaoImpl = new RegistDaoImpl();
	private LoginDao loginDao = new LoginDaoImpl();
	
	public Customer login(String name, String pass) {
		Customer customer = registDaoImpl.findByName(name);
		//密码正确则返回登录成功的用户，否则返回null
		if(customer!=null && customer.getPass().equals(pass)) {
			return customer;
		}
		return null;
	}

	public void update(Customer customer) {
		loginDao.update(customer);
	}

}
