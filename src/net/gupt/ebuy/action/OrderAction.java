package net.gupt.ebuy.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import net.gupt.ebuy.pojo.CartItem;
import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.OrderDetails;
import net.gupt.ebuy.pojo.Orders;
import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.service.CartService;
import net.gupt.ebuy.service.OrderService;
import net.gupt.ebuy.service.OrderServiceImpl;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 订单页面前端控制器
 * @author glf
 *
 */
public class OrderAction extends BaseAction{
	private String id;//订单ID
	private String payment;//付款方式
	private String address;//收件地址
	private String email;//用户邮件
	private String msg;//备注
	private String time;//订单生成时间
	private String sum;//订单总额
	
	private Orders order;//订单
	private List<Orders> orders;//订单集合
	private List<OrderDetails> details;//订单详细信息集合
	private OrderService orderService = new OrderServiceImpl();
	
	private Integer currentPage;//当前页数；默认从0开始
	private Integer maxPage;//最大页数
	private Integer totalRecord;//数据总记录数
	private Integer pageSize;//每页显示记录数
	
	/**
	 * 存储订单及订单详细信息
	 * @return
	 * @throws Exception
	 */
	public String confirmOrder() throws Exception {
		//从session中取出已登录用户
		Customer customer = (Customer) session.get("customer");
		CartService cart = (CartService) session.get("cart");
		List<CartItem> items = cart.list().get("list1");
		//新增订单
		order = new Orders();
		order.setAddress(address);
		order.setEmail(email);
		order.setItemid(Integer.parseInt(id));
		order.setPayment(payment);
		order.setSum(Double.parseDouble(sum));
		order.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(time));
		order.setUser(customer.getName());
		//新增订单详细信息
		for(int i=0; i<items.size(); i++) {
			Product product = items.get(i).getProduct();
			OrderDetails detail = new OrderDetails();
			detail.setProId(product.getId()+"");
			detail.setProName(product.getName());
			detail.setProNumber(items.get(i).getQty());
			detail.setProPrice(product.getPrice());
			detail.setProCost(product.getPrice()*items.get(i).getQty());
			order.addDetails(detail);
		}
		//保存订单
		orderService.saveOrder(order);
		//清空购物车
		cart.empty();
		return "success";
	}
	
	/**
	 * 查询订单列表
	 * @return
	 * @throws Exception
	 */
	public String viewOrder() throws Exception {
		Customer customer = (Customer) session.get("customer");
		orders = orderService.queryOrders(customer.getName(), currentPage, pageSize);
		totalRecord = orderService.countOrders(customer.getName());
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 查询订单详细信息
	 * @return
	 * @throws Exception
	 */
	public String orderDetail() throws Exception {
		order = orderService.findOrder(id);
		details = new ArrayList<OrderDetails>(order.getDetails());
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetails> details) {
		this.details = details;
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
