package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Orders;
/**
 * �ͻ���Ϣ��̨����ҵ��ӿ�
 * @author glf
 *
 */
public interface CustomerService {
	
	/**
	 * ��ѯ��ǰҳ���µĿͻ���Ϣ�б�
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Customer> listAllCustomer(int currentPage, int pageSize);
	
	/**
	 * ����ID��ѯָ���ͻ���Ϣ
	 * @param id �ͻ�ID
	 * @return
	 */
	public Customer viewDetail(int id);
	
	/**
	 * �������Ʋ�ѯ�ͻ���Ϣ
	 * @param name �ͻ�����
	 * @return
	 */
	public Customer queryCust(String name);
	
}
