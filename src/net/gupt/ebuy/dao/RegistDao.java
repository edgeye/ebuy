package net.gupt.ebuy.dao;

import net.gupt.ebuy.pojo.Customer;
/**
 * �û�ע��ģ�����ݷ��ʽӿ�
 * @author glf
 *
 */
public interface RegistDao {
	
	/**
	 * ע���û���Ϣ
	 * @param customer �����û�
	 * @return
	 */
	public boolean submitReg(Customer customer);
	
	/**
	 * �������Ʋ�ѯ�û���Ϣ
	 * @param name �û�����
	 * @return
	 */
	public Customer findByName(String name);
}
