package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Payment;
/**
 * 支付方式后台管理业务接口
 * @author glf
 *
 */
public interface PaymentService {
	
	/**
	 * 查询指定页码下的记录
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Payment> queryPayments(int currentPage, int pageSize);
	
	/**
	 * 根据ID查询指定支付方式
	 * @param id 支付方式ID
	 * @return
	 */
	public Payment findPayment(String id);
	
	/**
	 * 更新支付方式
	 * @param payment
	 */
	public void updatePayment(Payment payment);
	
	/**
	 * 删除支付方式 
	 * @param payment
	 */
	public void deletePayment(Payment payment);
	
	/**
	 * 新增支付方式
	 * @param payment
	 */
	public void addPayment(Payment payment);

}
