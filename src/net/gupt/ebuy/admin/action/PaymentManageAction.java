package net.gupt.ebuy.admin.action;

import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.PaymentService;
import net.gupt.ebuy.admin.service.PaymentServiceImpl;
import net.gupt.ebuy.pojo.Payment;
import net.gupt.ebuy.util.HibernateUtils;

/**
 * ֧����ʽ��̨���������
 * @author glf
 *
 */
public class PaymentManageAction extends BaseAction{
	private PaymentService paymentService = new PaymentServiceImpl();
	
	private Payment payment;//֧����ʽ
	private List<Payment> payments;//֧����ʽ����
	
	private String id;//֧����ʽID
	private String way;//֧����ʽ����
	private String msg;//֧����ʽ��ע
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * ��ѯ֧����ʽ�б�
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
	 * ����ָ��֧����ʽ
	 * @return
	 * @throws Exception
	 */
	public String updatePayment() throws Exception {
		payment = paymentService.findPayment(id);
		return "success";
	}
	
	/**
	 * �ύ֧����ʽ������Ϣ
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdatePayment() throws Exception {
		//��ѯ��Ҫ���µ�֧����ʽ
		payment = paymentService.findPayment(id);
		//��ֵ
		payment.setWay(way);
		payment.setMsg(msg);
		//�ύ����
		paymentService.updatePayment(payment);
		return "success";
	}
	
	/**
	 * ɾ��֧����ʽ
	 * @return
	 * @throws Exception
	 */
	public String deletePayment() throws Exception {
		payment = paymentService.findPayment(id);
		paymentService.deletePayment(payment);
		return "success";
	}
	
	/**
	 * ����֧����ʽ���ҳ��
	 * @return
	 * @throws Exception
	 */
	public String addPayment() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ������֧����ʽ��Ϣ
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
