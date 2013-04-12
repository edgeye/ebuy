package net.gupt.ebuy.admin.action;

import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.PaymentService;
import net.gupt.ebuy.admin.service.PaymentServiceImpl;
import net.gupt.ebuy.pojo.Payment;
import net.gupt.ebuy.util.HibernateUtils;

/**
 * 支付方式后台管理控制器
 * @author glf
 *
 */
public class PaymentManageAction extends BaseAction{
	private PaymentService paymentService = new PaymentServiceImpl();
	
	private Payment payment;//支付方式
	private List<Payment> payments;//支付方式集合
	
	private String id;//支付方式ID
	private String way;//支付方式名称
	private String msg;//支付方式备注
	
	private Integer currentPage;//当前页数；默认从0开始
	private Integer maxPage;//最大页数
	private Integer totalRecord;//数据总记录数
	private Integer pageSize;//每页显示记录数
	
	/**
	 * 查询支付方式列表
	 * @return
	 * @throws Exception
	 */
	public String viewPayment() throws Exception {
		payments = paymentService.queryPayments(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Payment");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 更新指定支付方式
	 * @return
	 * @throws Exception
	 */
	public String updatePayment() throws Exception {
		payment = paymentService.findPayment(id);
		return "success";
	}
	
	/**
	 * 提交支付方式更新信息
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdatePayment() throws Exception {
		//查询需要更新的支付方式
		payment = paymentService.findPayment(id);
		//赋值
		payment.setWay(way);
		payment.setMsg(msg);
		//提交更新
		paymentService.updatePayment(payment);
		return "success";
	}
	
	/**
	 * 删除支付方式
	 * @return
	 * @throws Exception
	 */
	public String deletePayment() throws Exception {
		payment = paymentService.findPayment(id);
		paymentService.deletePayment(payment);
		return "success";
	}
	
	/**
	 * 加载支付方式添加页面
	 * @return
	 * @throws Exception
	 */
	public String addPayment() throws Exception {
		return "success";
	}
	
	/**
	 * 提交新增的支付方式信息
	 * @return
	 * @throws Exception
	 */
	public String confirmAddPayment() throws Exception {
		Payment payment = new Payment();
		
		payment.setWay(way);
		payment.setMsg(msg);
		
		paymentService.addPayment(payment);
		return "success";
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
