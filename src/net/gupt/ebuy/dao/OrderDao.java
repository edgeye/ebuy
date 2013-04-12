package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Orders;
/**
 * �����������ݷ��ʽӿ�
 * @author Glf
 *
 */
public interface OrderDao {
	/**
	 * ����
	 * @param order
	 * @return
	 */
	public boolean save(Orders order);
	
	/**
	 * ��ѯ�û���ǰҳ���¶�����¼
	 * @param name �û���
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Orders> query(String name, int currentPage, int pageSize);
	
	/**
	 * ����ID��ѯ����
	 * @param id ����ID
	 * @return
	 */
	public Orders findById(String id);
	
	/**
	 * ɾ��
	 * @param order ����
	 */
	public void delete(Orders order);
	
	/**
	 * ���ݶ����Ų�ѯ����
	 * @param itemid ������
	 * @return
	 */
	public Orders searchOrder(String itemid);
	
	/**
	 * ��ѯ�û���������
	 * @param name �û���
	 * @return
	 */
	public int countOrders(String name);

}
