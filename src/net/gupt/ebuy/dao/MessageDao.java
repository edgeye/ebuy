package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
/**
 * 意见反馈模块数据访问接口
 * @author glf
 *
 */
public interface MessageDao {
	
	/**
	 * 保存意见
	 * @param idea 意见
	 * @return
	 */
	public boolean saveMess(Idea idea);
	
	/**
	 * 查询所有反馈意见
	 * @return
	 */
	public List<Idea> findAll();

}
