package net.gupt.ebuy.service;

import net.gupt.ebuy.pojo.Customer;
/**
 * �û�ע��ģ��ҵ��ӿ�
 * @author glf
 *
 */
public interface RegistService {
	
	/**
	 * ע���û���Ϣ
	 * @param customer
	 * @return
	 */
	public boolean submitReg(Customer customer);
	
	/**
	 * ��֤�û����Ƿ�ռ��
	 * @param name �û���
	 * @return
	 */
	public Customer validName(String name);

}
