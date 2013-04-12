package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
/**
 * 意见反馈模块业务接口
 * @author glf
 *
 */
public interface MessageService {
	
	/**
	 * 提交意见反馈
	 * @param idea 意见
	 * @return
	 */
	public boolean submitMessage(Idea idea);
	
	/**
	 * 查询反馈意见列表
	 * @return
	 */
	public List<Idea> queryMessage();

}
