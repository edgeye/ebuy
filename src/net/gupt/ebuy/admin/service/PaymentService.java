package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Payment;
/**
 * ֧����ʽ��̨����ҵ��ӿ�
 * @author glf
 *
 */
public interface PaymentService {
	
	/**
	 * ��ѯָ��ҳ���µļ�¼
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Payment> queryPayments(int currentPage, int pageSize);
	
	/**
	 * ����ID��ѯָ��֧����ʽ
	 * @param id ֧����ʽID
	 * @return
	 */
	public Payment findPayment(String id);
	
	/**
	 * ����֧����ʽ
	 * @param payment
	 */
	public void updatePayment(Payment payment);
	
	/**
	 * ɾ��֧����ʽ 
	 * @param payment
	 */
	public void deletePayment(Payment payment);
	
	/**
	 * ����֧����ʽ
	 * @param payment
	 */
	public void addPayment(Payment payment);

}
