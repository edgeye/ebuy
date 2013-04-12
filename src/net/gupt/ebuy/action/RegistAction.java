package net.gupt.ebuy.action;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.service.RegistService;
import net.gupt.ebuy.service.RegistServiceImpl;
/**
 * ע��ҳ��ǰ�˿�����
 * @author glf
 *
 */
public class RegistAction extends BaseAction{
	private static final long serialVersionUID = 1L;

	private RegistService registServiceImpl = new RegistServiceImpl();
	
	private String name;//�û���
	private String pass;//����
	private String header;//ͷ��
	private String question;//��ʾ����
	private String answer;//��
	private String phone;//�绰
	private String address;//��ַ
	private String email;//����
	private boolean flag;//�Ƿ�ע��ɹ���־
	
	/**
	 * ��ʼ��ע��ҳ��
	 */
	public String execute() throws Exception{
		return "success";
	}
	
	/**
	 * ע���ύ����
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
	 * ��֤�û����Ƿ��ѱ�ע���
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
