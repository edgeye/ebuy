package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
/**
 * 公告信息后台管理业务接口
 * @author glf
 *
 */
public interface NoticeService {
	
	/**
	 * 根据ID查找公告
	 * @param id 公告ID
	 * @return
	 */
	public Notice findNotice(String id);
	
	/**
	 * 更新公告
	 * @param notice
	 */
	public void updateNotice(Notice notice);
	
	/**
	 * 删除公告
	 * @param notice
	 */
	public void deleteNotice(Notice notice);
	
	/**
	 * 新增公告
	 * @param notice
	 */
	public void sendNotice(Notice notice);
	
	/**
	 * 查询当前页下的记录列表
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Idea> queryIdeas(int currentPage, int pageSize);
	
	/**
	 * 回复意见
	 * @param idea
	 */
	public void replyIdeas(Idea idea);
	
	/**
	 * 根据ID查找意见
	 * @param id
	 * @return
	 */
	public Idea findIdea(String id);
	
	/**
	 * 删除意见
	 * @param idea
	 */
	public void deleteIdea(Idea idea);

}
