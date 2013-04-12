package net.gupt.ebuy.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 订单实体类
 * @author glf
 *
 */
public class Orders {
	
	private int id;//订单ID
	private int itemid;//订单号
	private String payment;//支付方式
	private String address;//送货地址
	private String email;//用户邮箱
	private String user;//用户名称
	private Date time;//订单产生时间
	private double sum;//订单总额
	//订单详细条目
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
