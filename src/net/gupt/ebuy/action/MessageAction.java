package net.gupt.ebuy.action;

import java.util.Date;
import java.util.List;

import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.service.MessageService;
import net.gupt.ebuy.service.MessageServiceImpl;
/**
 * 意见反馈前端控制器
 * @author glf
 *
 */
public class MessageAction extends BaseAction{
	private String message;//意见
	private List<Idea> ideas;//存储意见集合
	
	private MessageService messageService = new MessageServiceImpl();
	
	/**
	 * 初始化意见反馈页面
	 * @return
	 * @throws Exception
	 */
	public String initMessage() throws Exception {
		return "success";
	}
	
	/**
	 * 提交用户的意见反馈
	 * @return
	 * @throws Exception
	 */
	public String submitMessage() throws Exception {
		Customer customer = (Customer)session.get("customer");
		Idea idea = new Idea();
		
		idea.setName(customer.getName());
		idea.setNewMess(message);
		Date date = new Date();
		idea.setNewTime(date);
		idea.setHeader(customer.getHeader());
		
		messageService.submitMessage(idea);
		ideas = messageService.queryMessage();
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Idea> getIdeas() {
		return ideas;
	}

	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}
}
