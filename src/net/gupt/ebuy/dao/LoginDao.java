package net.gupt.ebuy.dao;

import net.gupt.ebuy.pojo.Customer;
/**
 * �û���¼ģ�����ݷ��ʽӿ�
 * @author glf
 *
 */
public interface LoginDao {
	/**
	 * �����û���Ϣ
	 * @param customer �û�
	 */
	public void update(Customer customer);
}
