package net.gupt.ebuy.service;

import net.gupt.ebuy.pojo.Customer;
/**
 * �û���¼ģ��ҵ��ӿ�
 * @author glf
 *
 */
public interface LoginService {
	
	/**
	 * �û���¼����
	 * @param name �û���
	 * @param pass ����
	 * @return
	 */
	public Customer login(String name, String pass);
	
	/**
	 * �����û���Ϣ
	 * @param customer �û�
	 */
	public void update(Customer customer);

}
