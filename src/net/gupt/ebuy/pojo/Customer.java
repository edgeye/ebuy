package net.gupt.ebuy.pojo;

import java.io.Serializable;
/**
 * 顾客实体类
 * @author glf
 *
 */
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;//顾客ID
	private String name;//名称
	private String pass;//密码
	private String header;//头像
	private String phone;//电话
	private String question;//验证问题
	private String answer;//问题答案
	private String address;//地址
	private String email;//邮箱
	
	public Customer() {
		
	}

	public Customer(String name, String pass, String header, String phone,
			String question, String answer, String address, String email) {
		super();
		this.name = name;
		this.pass = pass;
		this.header = header;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
		this.address = address;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
