package net.gupt.ebuy.action;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.service.RegistService;
import net.gupt.ebuy.service.RegistServiceImpl;
/**
 * 注册页面前端控制器
 * @author glf
 *
 */
public class RegistAction extends BaseAction{
	private static final long serialVersionUID = 1L;

	private RegistService registServiceImpl = new RegistServiceImpl();
	
	private String name;//用户名
	private String pass;//密码
	private String header;//头像
	private String question;//提示问题
	private String answer;//答案
	private String phone;//电话
	private String address;//地址
	private String email;//邮箱
	private boolean flag;//是否注册成功标志
	
	/**
	 * 初始化注册页面
	 */
	public String execute() throws Exception{
		return "success";
	}
	
	/**
	 * 注册提交方法
	 * @return
	 * @throws Exception
	 */
	public String submitReg() throws Exception{
		Customer customer = new Customer();
		
		customer.setName(name);
		customer.setPass(pass);
		customer.setHeader(header);
		customer.setQuestion(question);
		customer.setAddress(address);
		customer.setAnswer(answer);
		customer.setPhone(phone);
		customer.setEmail(email);
		
		flag = registServiceImpl.submitReg(customer);
		return "success";
	}
	
	/**
	 * 验证用户名是否已被注册过
	 * @throws Exception
	 */
	public void validName() throws Exception{
		Customer customer = registServiceImpl.validName(name);
		if(customer!=null) {
			response.getWriter().write("yes");
		}
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public RegistService getRegistServiceImpl() {
		return registServiceImpl;
	}

	public void setRegistServiceImpl(RegistService registServiceImpl) {
		this.registServiceImpl = registServiceImpl;
	}

}
