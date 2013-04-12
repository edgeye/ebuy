package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Payment;
/**
 * 支付方式后台管理数据访问接口
 * @author glf
 *
 */
public interface PaymentDao {
	
	/**
	 * 根据页码查询指定结果集
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Payment> query(int currentPage, int pageSize);
	
	/**
	 * 根据ID查找指定支付方式
	 * @param id
	 * @return
	 */
	public Payment findById(String id);
	
	/**
	 * 更新
	 * @param payment
	 */
	public void update(Payment payment);
	
	/**
	 * 删除
	 * @param payment
	 */
	public void delete(Payment payment);
	
	/**
	 * 新增
	 * @param payment
	 */
	public void save(Payment payment);

}
