package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.Orders;
/**
 * ��������ҵ��ӿ�
 * @author glf
 *
 */
public interface OrderService {
	
	/**
	 * ���涩��
	 * @param order ��������
	 * @return
	 */
	public boolean saveOrder(Orders order);
	
	/**
	 * ��ѯ�û���ǰҳ���µĶ�����¼
	 * @param name �û���
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Orders> queryOrders(String name, int currentPage, int pageSize);
	
	/**
	 * ����ID��ѯ����
	 * @param id ����ID
	 * @return
	 */
	public Orders findOrder(String id);
	
	/**
	 * ɾ��ָ��ID�µĶ���
	 * @param id ����ID
	 */
	public void deleteOrder(String id);
	
	/**
	 * ���ݶ����Ų�ѯ����
	 * @param itemid ������
	 * @return
	 */
	public Orders searchOrder(String itemid);
	
	/**
	 * ��ѯ�û���Ӧ�������� 
	 * @param name
	 * @return
	 */
	public int countOrders(String name);

}
