package net.gupt.ebuy.action;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.service.LoginService;
import net.gupt.ebuy.service.LoginServiceImpl;
/**
 * �û���¼ǰ�˿�����
 * @author glf
 *
 */
public class LoginAction extends BaseAction {
	private String name;//�û���
	private String pass;//����
	private String header;//ͷ��
	private String phone;//�绰
	private String question;//����
	private String answer;//��
	private String address;//��ַ
	private String email;//�ʼ�
	
	private LoginService loginService = new LoginServiceImpl();
	
	/**
	 * �û���¼��������¼���û���Ϣ�洢��Session��
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
	 * �û��ǳ����� 
	 * @return
	 * @throws Exception
	 */
	public String logout() throws Exception{
		//��session�б������Ϣ���
		session.clear();
//		response.getWriter().write("out");
		return "success";
	}
	
	/**
	 * ��ʼ���û������޸�ҳ��
	 * @return
	 * @throws Exception
	 */
	public String updateInfo() throws Exception{
		return "success";
	}
	
	/**
	 * �û���Ϣ�޸ĺ�ȷ���ύ
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
