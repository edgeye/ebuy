package net.gupt.ebuy.pojo;
/**
 * 支付方式实体类
 * @author glf
 *
 */
public class Payment {
	
	private int id;//支付方式ID
	private String way;//支付方式名称
	private String msg;//支付方式备注
	
	public Payment() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
