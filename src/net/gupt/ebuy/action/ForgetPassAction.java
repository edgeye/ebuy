package net.gupt.ebuy.action;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.service.ForgetPassService;
import net.gupt.ebuy.service.ForgetPassServiceImpl;
/**
 *��ѯ����ǰ�˿�����
 * @author glf
 *
 */
public class ForgetPassAction extends BaseAction{
	private String name;//�û���
	private String answer;//��ʾ�����
	private int flag;//������Ƿ���ȷ�ı�ʶ
	private Customer customer;//�û�
	private ForgetPassService forgetPassService = new ForgetPassServiceImpl();
	
	public String forgetPass() throws Exception{
		return "success";
	}
	
	/**
	 * �����û�����ѯ�û���Ϣ
	 * @return
	 * @throws Exception
	 */
	public String initPass() throws Exception{
		customer = forgetPassService.initPass(name);
		return "success";
	}
	
	/**
	 * ����û���д����ȷ��
	 * @return
	 * @throws Exception
	 */
	public String searchPass() throws Exception{
		customer = forgetPassService.initPass(name);
		if(customer.getAnswer().equals(answer)) {
			flag = 1;
		}else {
			flag = 0;
		}
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}


}
