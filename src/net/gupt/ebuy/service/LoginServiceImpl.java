package net.gupt.ebuy.service;

import net.gupt.ebuy.dao.LoginDao;
import net.gupt.ebuy.dao.LoginDaoImpl;
import net.gupt.ebuy.dao.RegistDao;
import net.gupt.ebuy.dao.RegistDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * �û���¼ģ��ҵ��ӿ�ʵ����
 * @author glf
 *
 */
public class LoginServiceImpl implements LoginService{
	private RegistDao registDaoImpl = new RegistDaoImpl();
	private LoginDao loginDao = new LoginDaoImpl();
	
	public Customer login(String name, String pass) {
		Customer customer = registDaoImpl.findByName(name);
		//������ȷ�򷵻ص�¼�ɹ����û������򷵻�null
		if(customer!=null && customer.getPass().equals(pass)) {
			return customer;
		}
		return null;
	}

	public void update(Customer customer) {
		loginDao.update(customer);
	}

}
