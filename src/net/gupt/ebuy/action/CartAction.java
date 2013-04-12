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
 * 购物车控制器
 * @author glf
 *
 */
public class CartAction extends BaseAction {
	private String id;//商品id
	private String qty;//商品数量
	private List<CartItem> list1;//存储购物车内商品的集合
	private double totalPrice;//购物车内商品总价
	
	private List<Payment> payments;
	
	private ProductService productService = new ProductServiceImpl();
	private PaymentService paymentService = new PaymentServiceImpl();
	
	/**
	 * 添加商品到购物车
	 * @throws Exception
	 */
	public void buyProduct() throws Exception {
		//从会话中取出购物车
		CartService cart = (CartService) session.get("cart");
		//session中取出的购物车如果为null,则实例化一个购物车对象
		if(cart==null) {
			cart = new CartServiceImpl();
		}
		//根据ID查询需要添加到购物车的商品
		Product product = productService.queryById(id);
		
		//实例化新的购物车商品
		CartItem item = new CartItem();
		//赋值
		item.setProduct(product);
		item.setQty(1);
		
		//添加到购物车
		boolean flag = cart.add(item);
		//将购物车重新添加回session中
		session.put("cart", cart);
		//反馈结果：添加成功则返回YES
		if(flag) {
			response.getWriter().write("yes");
		}else {
			response.getWriter().write("no");
		}
	}
	
	/**
	 * 查看购物车列表
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
	 * 修改购物车内指定商品数量
	 * @throws Exception
	 */
	public void updateQty() throws Exception {
		CartService cart = (CartService)session.get("cart");
		if(cart!=null) {
			int p = Integer.parseInt(id);
			int q = Integer.parseInt(qty);
			//修改数量
			cart.change(q, p);
			totalPrice = cart.count();
			response.getWriter().write("yes");
		}
		response.getWriter().write("no");
	}
	
	/**
	 * 清空购物车
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
	 * 删除购物车内某件商品
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
	 * 将购物车内的商品提交结算
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
