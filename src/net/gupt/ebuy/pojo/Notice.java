package net.gupt.ebuy.pojo;

import java.util.Date;
/**
 * 公告信息实体类
 * @author glf
 *
 */
public class Notice {
	
	private int id;//公告ID
	private String message;//公告内容
	private String admin;//管理员名称
	private String header;//管理员头像
	private Date time;//发布公告时间
	
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
