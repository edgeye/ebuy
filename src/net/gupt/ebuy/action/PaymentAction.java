package net.gupt.ebuy.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import net.gupt.ebuy.pojo.CartItem;
import net.gupt.ebuy.service.CartService;
/**
 * 付款页面前端控制器
 * @author glf
 *
 */
public class PaymentAction extends BaseAction{
	private String payment;//付款方式
	private String address;//收件地址
	private String email;//邮箱
	private String msg;//备注
	private int id;//订单号
	private String time;//订单生成时间
	
	private List<CartItem> list1;//购物车商品集合
	private double totalPrice;//购物车商品总价
	
	/**
	 * 确认订单
	 * @return
	 * @throws Exception
	 */
	public String confirmPay() throws Exception {
		Calendar cal =new GregorianCalendar();
		//格式化时间
		time = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		//生成订单号
		id = cal.get(Calendar.YEAR) + cal.get(Calendar.MONTH) + cal.get(Calendar.DATE) 
			+ cal.get(Calendar.HOUR) + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND);
		//从session中取出购物车
		CartService cart = (CartService)session.get("cart");
		//取出购物车中的商品集合
		list1 = cart.list().get("list1");
		//获取购物车商品总价格
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
