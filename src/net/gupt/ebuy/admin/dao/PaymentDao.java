package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Payment;
/**
 * ֧����ʽ��̨�������ݷ��ʽӿ�
 * @author glf
 *
 */
public interface PaymentDao {
	
	/**
	 * ����ҳ���ѯָ�������
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Payment> query(int currentPage, int pageSize);
	
	/**
	 * ����ID����ָ��֧����ʽ
	 * @param id
	 * @return
	 */
	public Payment findById(String id);
	
	/**
	 * ����
	 * @param payment
	 */
	public void update(Payment payment);
	
	/**
	 * ɾ��
	 * @param payment
	 */
	public void delete(Payment payment);
	
	/**
	 * ����
	 * @param payment
	 */
	public void save(Payment payment);

}
