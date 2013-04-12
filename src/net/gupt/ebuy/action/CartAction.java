package net.gupt.ebuy.action;

import java.util.List;
import java.util.Map;

import net.gupt.ebuy.admin.service.PaymentService;
import net.gupt.ebuy.admin.service.PaymentServiceImpl;
import net.gupt.ebuy.pojo.CartItem;
import net.gupt.ebuy.pojo.Payment;
import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.service.CartService;
import net.gupt.ebuy.service.CartServiceImpl;
import net.gupt.ebuy.service.ProductService;
import net.gupt.ebuy.service.ProductServiceImpl;
/**
 * ���ﳵ������
 * @author glf
 *
 */
public class CartAction extends BaseAction {
	private String id;//��Ʒid
	private String qty;//��Ʒ����
	private List<CartItem> list1;//�洢���ﳵ����Ʒ�ļ���
	private double totalPrice;//���ﳵ����Ʒ�ܼ�
	
	private List<Payment> payments;
	
	private ProductService productService = new ProductServiceImpl();
	private PaymentService paymentService = new PaymentServiceImpl();
	
	/**
	 * �����Ʒ�����ﳵ
	 * @throws Exception
	 */
	public void buyProduct() throws Exception {
		//�ӻỰ��ȡ�����ﳵ
		CartService cart = (CartService) session.get("cart");
		//session��ȡ���Ĺ��ﳵ���Ϊnull,��ʵ����һ�����ﳵ����
		if(cart==null) {
			cart = new CartServiceImpl();
		}
		//����ID��ѯ��Ҫ��ӵ����ﳵ����Ʒ
		Product product = productService.queryById(id);
		
		//ʵ�����µĹ��ﳵ��Ʒ
		CartItem item = new CartItem();
		//��ֵ
		item.setProduct(product);
		item.setQty(1);
		
		//��ӵ����ﳵ
		boolean flag = cart.add(item);
		//�����ﳵ������ӻ�session��
		session.put("cart", cart);
		//�����������ӳɹ��򷵻�YES
		if(flag) {
			response.getWriter().write("yes");
		}else {
			response.getWriter().write("no");
		}
	}
	
	/**
	 * �鿴���ﳵ�б�
	 * @return 
	 * @throws Exception
	 */
	public String checkCart() throws Exception {
		CartService cart = (CartService)session.get("cart");
		if(cart!=null) {
			Map<String, List<CartItem>> map = cart.list();
			list1 = map.get("list1");
			totalPrice = cart.count();
		}
		return "success";
	}
	
	/**
	 * �޸Ĺ��ﳵ��ָ����Ʒ����
	 * @throws Exception
	 */
	public void updateQty() throws Exception {
		CartService cart = (CartService)session.get("cart");
		if(cart!=null) {
			int p = Integer.parseInt(id);
			int q = Integer.parseInt(qty);
			//�޸�����
			cart.change(q, p);
			totalPrice = cart.count();
			response.getWriter().write("yes");
		}
		response.getWriter().write("no");
	}
	
	/**
	 * ��չ��ﳵ
	 * @return
	 * @throws Exception
	 */
	public String emptyCart() throws Exception {
		CartService cart = (CartService)session.get("cart");
		if(cart!=null) {
			cart.empty();
		}
		return "success";
	}
	
	/**
	 * ɾ�����ﳵ��ĳ����Ʒ
	 * @return
	 * @throws Exception
	 */
	public String delProduct() throws Exception {
		CartService cart = (CartService)session.get("cart");
		if(cart!=null) {
			int idd = Integer.parseInt(id);
			cart.delete(idd);
		}
		return "success";
	}
	
	/**
	 * �����ﳵ�ڵ���Ʒ�ύ����
	 * @return
	 * @throws Exception
	 */
	public String checkout() throws Exception {
		CartService cart = (CartService)session.get("cart");
		if(cart!=null) {
			Map<String, List<CartItem>> map = cart.list();
			list1 = map.get("list1");
			totalPrice = cart.count();
		}
		payments = paymentService.queryPayments(0, -1);
		if(list1!=null && list1.size()>0) {
			return "success";
		}
		return "fail";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<CartItem> getList1() {
		return list1;
	}

	public void setList1(List<CartItem> list1) {
		this.list1 = list1;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
