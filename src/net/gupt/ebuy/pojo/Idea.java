package net.gupt.ebuy.pojo;

import java.util.Date;
/**
 * 意见反馈实体类
 * @author glf
 *
 */
public class Idea {
	
	private int id;//意见ID
	private String name;//反馈意见的用户名称
	private String header;//用户头像
	private String newMess;//反馈意见内容
	private String reMess;//管理员意见回复内容
	private Date newTime;//反馈意见时间
	private String reTime;//管理员意见回复时间
	
	public Idea() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getNewMess() {
		return newMess;
	}

	public void setNewMess(String newMess) {
		this.newMess = newMess;
	}

	public String getReMess() {
		return reMess;
	}

	public void setReMess(String reMess) {
		this.reMess = reMess;
	}

	public Date getNewTime() {
		return newTime;
	}

	public void setNewTime(Date newTime) {
		this.newTime = newTime;
	}

	public String getReTime() {
		return reTime;
	}

	public void setReTime(String reTime) {
		this.reTime = reTime;
	}


}
