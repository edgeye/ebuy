package net.gupt.ebuy.pojo;
/**
 * ���ﳵ��Ʒ�ࣺ������ͨ��Ʒ���Լ���Ʒ����
 * @author glf
 *
 */
public class CartItem {
	private Product product;//��Ʒ
	private int qty;//��Ӧ����
	
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
