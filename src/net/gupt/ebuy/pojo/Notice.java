package net.gupt.ebuy.pojo;

import java.util.Date;
/**
 * ������Ϣʵ����
 * @author glf
 *
 */
public class Notice {
	
	private int id;//����ID
	private String message;//��������
	private String admin;//����Ա����
	private String header;//����Աͷ��
	private Date time;//��������ʱ��
	
	public Notice() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
