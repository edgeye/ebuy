package net.gupt.ebuy.pojo;
/**
 * ֧����ʽʵ����
 * @author glf
 *
 */
public class Payment {
	
	private int id;//֧����ʽID
	private String way;//֧����ʽ����
	private String msg;//֧����ʽ��ע
	
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
