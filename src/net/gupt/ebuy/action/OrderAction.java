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
 * ����ҳ��ǰ�˿�����
 * @author glf
 *
 */
public class OrderAction extends BaseAction{
	private String id;//����ID
	private String payment;//���ʽ
	private String address;//�ռ���ַ
	private String email;//�û��ʼ�
	private String msg;//��ע
	private String time;//��������ʱ��
	private String sum;//�����ܶ�
	
	private Orders order;//����
	private List<Orders> orders;//��������
	private List<OrderDetails> details;//������ϸ��Ϣ����
	private OrderService orderService = new OrderServiceImpl();
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * �洢������������ϸ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public String confirmOrder() throws Exception {
		//��session��ȡ���ѵ�¼�û�
		Customer customer = (Customer) session.get("customer");
		CartService cart = (CartService) session.get("cart");
		List<CartItem> items = cart.list().get("list1");
		//��������
		order = new Orders();
		order.setAddress(address);
		order.setEmail(email);
		order.setItemid(Integer.parseInt(id));
		order.setPayment(payment);
		order.setSum(Double.parseDouble(sum));
		order.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(time));
		order.setUser(customer.getName());
		//����������ϸ��Ϣ
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
		//���涩��
		orderService.saveOrder(order);
		//��չ��ﳵ
		cart.empty();
		return "success";
	}
	
	/**
	 * ��ѯ�����б�
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
	 * ��ѯ������ϸ��Ϣ
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
