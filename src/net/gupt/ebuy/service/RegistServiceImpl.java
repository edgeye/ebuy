package net.gupt.ebuy.service;

import net.gupt.ebuy.dao.RegistDao;
import net.gupt.ebuy.dao.RegistDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * �û�ע��ģ��ҵ��ӿ�ʵ����
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
