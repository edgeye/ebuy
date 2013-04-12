package net.gupt.ebuy.action;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.service.ForgetPassService;
import net.gupt.ebuy.service.ForgetPassServiceImpl;
/**
 *查询密码前端控制器
 * @author glf
 *
 */
public class ForgetPassAction extends BaseAction{
	private String name;//用户名
	private String answer;//提示问题答案
	private int flag;//问题答案是否正确的标识
	private Customer customer;//用户
	private ForgetPassService forgetPassService = new ForgetPassServiceImpl();
	
	public String forgetPass() throws Exception{
		return "success";
	}
	
	/**
	 * 根据用户名查询用户信息
	 * @return
	 * @throws Exception
	 */
	public String initPass() throws Exception{
		customer = forgetPassService.initPass(name);
		return "success";
	}
	
	/**
	 * 检查用户填写答案正确性
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
