package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Orders;
/**
 * �ͻ���Ϣ��̨�������ݷ��ʽӿ�
 * @author glf
 *
 */
public interface CustomerDao {
	
	/**
	 * ��ѯ��ǰҳ�������пͻ���Ϣ
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Customer> findAll(int currentPage, int pageSize);
	
	/**
	 * ����ID��ѯָ���ͻ���Ϣ
	 * @param id �ͻ�ID
	 * @return
	 */
	public Customer findById(int id);
	
	/**
	 * �������Ʋ��ҿͻ���Ϣ
	 * @param name �ͻ�����
	 * @return
	 */
	public Customer findByName(String name);
	
}
