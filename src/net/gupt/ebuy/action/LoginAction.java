package net.gupt.ebuy.action;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.service.LoginService;
import net.gupt.ebuy.service.LoginServiceImpl;
/**
 * 用户登录前端控制器
 * @author glf
 *
 */
public class LoginAction extends BaseAction {
	private String name;//用户名
	private String pass;//密码
	private String header;//头像
	private String phone;//电话
	private String question;//问题
	private String answer;//答案
	private String address;//地址
	private String email;//邮件
	
	private LoginService loginService = new LoginServiceImpl();
	
	/**
	 * 用户登录方法；登录后将用户信息存储于Session中
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {
		Customer customer = loginService.login(name, pass);
		if(customer!=null) {
			session.put("customer", customer);
			return "success";
//			response.getWriter().write("yes");
		}else {
//			response.getWriter().write("no");
		}
		return "fail";
	}
	
	/**
	 * 用户登出方法 
	 * @return
	 * @throws Exception
	 */
	public String logout() throws Exception{
		//将session中保存的信息清空
		session.clear();
//		response.getWriter().write("out");
		return "success";
	}
	
	/**
	 * 初始化用户资料修改页面
	 * @return
	 * @throws Exception
	 */
	public String updateInfo() throws Exception{
		return "success";
	}
	
	/**
	 * 用户信息修改后确认提交
	 * @return
	 * @throws Exception
	 */
	public String updateConfirm() throws Exception{
		Customer customer = (Customer)session.get("customer");
		
		customer.setPass(pass);
		customer.setPhone(phone);
		customer.setHeader(header);
		customer.setQuestion(question);
		customer.setAnswer(answer);
		customer.setAddress(address);
		customer.setEmail(email);
		
		loginService.update(customer);
		return "success";
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
