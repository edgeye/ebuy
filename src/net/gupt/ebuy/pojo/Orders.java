package net.gupt.ebuy.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * ����ʵ����
 * @author glf
 *
 */
public class Orders {
	
	private int id;//����ID
	private int itemid;//������
	private String payment;//֧����ʽ
	private String address;//�ͻ���ַ
	private String email;//�û�����
	private String user;//�û�����
	private Date time;//��������ʱ��
	private double sum;//�����ܶ�
	//������ϸ��Ŀ
	private Set<OrderDetails> details = new HashSet<OrderDetails>();
	
	public Orders() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public Set<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(Set<OrderDetails> details) {
		this.details = details;
	}
	
	public void addDetails(OrderDetails detail) {
		this.details.add(detail);
		detail.setOrder(this);
	}

}
