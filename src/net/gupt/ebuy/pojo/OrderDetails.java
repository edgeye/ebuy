package net.gupt.ebuy.pojo;
/**
 * 订单详细信息实体类
 * @author glf
 *
 */
public class OrderDetails {
	
	private Integer id;//订单详细ID
	//private Integer orderId;
	private String proId;//商品ID
	private String proName;//商品名称
	private Integer proNumber;//商品数量
	private Double proPrice;//商品价格
	private Double proCost;//商品总价
	
	private Orders order;//对应订单
	
	public OrderDetails() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Integer getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Integer orderId) {
//		this.orderId = orderId;
//	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Integer getProNumber() {
		return proNumber;
	}

	public void setProNumber(Integer proNumber) {
		this.proNumber = proNumber;
	}

	public Double getProPrice() {
		return proPrice;
	}

	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}

	public Double getProCost() {
		return proCost;
	}

	public void setProCost(Double proCost) {
		this.proCost = proCost;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

}
