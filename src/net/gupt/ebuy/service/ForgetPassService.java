package net.gupt.ebuy.service;

import net.gupt.ebuy.pojo.Customer;
/**
 * ��ѯ�û�����ҵ��ӿ�
 * @author glf
 *
 */
public interface ForgetPassService {
	
	/**
	 * �����û����Ʋ����û���Ϣ
	 * @param name �û�����
	 * @return
	 */
	public Customer initPass(String name);
}
