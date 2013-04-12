package net.gupt.ebuy.service;

import java.util.List;
import java.util.Map;

import net.gupt.ebuy.pojo.CartItem;
/**
 * ���ﳵƽ̨��
 * @author glf
 *
 */
public interface CartService {
	
	/**
	 * �����ﳵ�������Ʒ
	 * @param ci ��Ʒ
	 * @return
	 */
	public boolean add(CartItem ci);
	
	/**
	 * ��ѯ���ﳵ��Ʒ�б�
	 * @return
	 */
	public Map<String, List<CartItem>> list();
	
	/**
	 * ��չ��ﳵ
	 * @return
	 */
	public boolean empty();
	
	/**
	 * ����IDɾ��ָ����Ʒ
	 * @param id ��ƷID
	 */
	public void delete(int id);
	
	/**
	 * ����ID�ָ���ɾ������Ʒ
	 * @param id ��ƷID
	 */
	public void recover(int id);
	
	/**
	 * ͳ���ܼ۸�
	 * @return
	 */
	public double count();
	
	/**
	 * �޸���Ʒ���� 
	 * @param n ����
	 * @param id ��ƷID
	 */
	public void change(int n, int id);

}
