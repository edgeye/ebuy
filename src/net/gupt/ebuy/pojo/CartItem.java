package net.gupt.ebuy.pojo;
/**
 * 购物车商品类：包括普通商品，以及商品数量
 * @author glf
 *
 */
public class CartItem {
	private Product product;//商品
	private int qty;//对应数量
	
	public CartItem() {
		
	}
	
	public CartItem(Product p, int qty) {
		this.setProduct(p);
		this.setQty(qty);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
