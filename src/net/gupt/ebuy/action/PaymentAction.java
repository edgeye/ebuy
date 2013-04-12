package net.gupt.ebuy.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import net.gupt.ebuy.pojo.CartItem;
import net.gupt.ebuy.service.CartService;
/**
 * ����ҳ��ǰ�˿�����
 * @author glf
 *
 */
public class PaymentAction extends BaseAction{
	private String payment;//���ʽ
	private String address;//�ռ���ַ
	private String email;//����
	private String msg;//��ע
	private int id;//������
	private String time;//��������ʱ��
	
	private List<CartItem> list1;//���ﳵ��Ʒ����
	private double totalPrice;//���ﳵ��Ʒ�ܼ�
	
	/**
	 * ȷ�϶���
	 * @return
	 * @throws Exception
	 */
	public String confirmPay() throws Exception {
		Calendar cal =new GregorianCalendar();
		//��ʽ��ʱ��
		time = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		//���ɶ�����
		id = cal.get(Calendar.YEAR) + cal.get(Calendar.MONTH) + cal.get(Calendar.DATE) 
			+ cal.get(Calendar.HOUR) + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND);
		//��session��ȡ�����ﳵ
		CartService cart = (CartService)session.get("cart");
		//ȡ�����ﳵ�е���Ʒ����
		list1 = cart.list().get("list1");
		//��ȡ���ﳵ��Ʒ�ܼ۸�
		totalPrice = cart.count();
		return "success";
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<CartItem> getList1() {
		return list1;
	}

	public void setList1(List<CartItem> list1) {
		this.list1 = list1;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
