package net.gupt.ebuy.pojo;
/**
 * ������ϸ��Ϣʵ����
 * @author glf
 *
 */
public class OrderDetails {
	
	private Integer id;//������ϸID
	//private Integer orderId;
	private String proId;//��ƷID
	private String proName;//��Ʒ����
	private Integer proNumber;//��Ʒ����
	private Double proPrice;//��Ʒ�۸�
	private Double proCost;//��Ʒ�ܼ�
	
	private Orders order;//��Ӧ����
	
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
