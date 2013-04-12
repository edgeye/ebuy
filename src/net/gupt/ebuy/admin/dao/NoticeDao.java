package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
/**
 * 公告信息后台管理数据访问接口
 * @author glf
 *
 */
public interface NoticeDao {
	
	/**
	 * 根据ID查找公告
	 * @param id 公告ID
	 * @return
	 */
	public Notice findById(String id);
	
	/**
	 * 更新公告信息
	 * @param notice
	 */
	public void update(Notice notice);
	
	/**
	 * 删除公告
	 * @param notice
	 */
	public void delete(Notice notice);
	
	/**
	 * 保存公告
	 * @param notice
	 */
	public void save(Notice notice);
	
	/**
	 * 查询当前页码下的意见列表
	 * @param currentPage 当前页码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Idea> query(int currentPage, int pageSize);
	
	/**
	 * 更新意见信息
	 * @param idea
	 */
	public void updateIdea(Idea idea);
	
	/**
	 * 根据ID查找意见
	 * @param id 意见ID
	 * @return
	 */
	public Idea findIdeaById(String id);
	
	/**
	 * 删除意见
	 * @param idea
	 */
	public void deleteIdea(Idea idea);

}
