package net.gupt.ebuy.service;

import net.gupt.ebuy.dao.RegistDao;
import net.gupt.ebuy.dao.RegistDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * ��ѯ����ҵ��ӿ�ʵ����
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
