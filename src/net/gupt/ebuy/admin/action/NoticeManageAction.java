package net.gupt.ebuy.admin.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.NoticeService;
import net.gupt.ebuy.admin.service.NoticeServiceImpl;
import net.gupt.ebuy.pojo.Admin;
import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.service.MainService;
import net.gupt.ebuy.service.MainServiceImpl;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 公告后台管理控制器
 * @author glf
 *
 */
public class NoticeManageAction extends BaseAction{
	private String id;//公告ID
	private String message;//公告/意见 内容
	
	private Notice notice;//公告
	private List<Notice> notices;//公告集合
	
	private Idea idea;//意见
	private List<Idea> ideas;//意见集合
	
	private MainService mainService = new MainServiceImpl();
	private NoticeService noticeService = new NoticeServiceImpl();
	
	private Integer currentPage;//当前页数；默认从0开始
	private Integer maxPage;//最大页数
	private Integer totalRecord;//数据总记录数
	private Integer pageSize;//每页显示记录数
	
	/**
	 * 查询公告列表
	 * @return
	 * @throws Exception
	 */
	public String viewNotice() throws Exception {
		notices = mainService.queryNotice(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Notice");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 更新公告信息
	 * @return
	 * @throws Exception
	 */
	public String updateNotice() throws Exception {
		notice = noticeService.findNotice(id);
		return "success";
	}
	
	/**
	 * 提交公告信息更新
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdateNotice() throws Exception {
		notice = noticeService.findNotice(id);
		
		notice.setMessage(message);
		notice.setTime(new Date());
		
		noticeService.updateNotice(notice);
		return "success";
	}
	
	/**
	 * 删除公告
	 * @return
	 * @throws Exception
	 */
	public String deleteNotice() throws Exception {
		notice = noticeService.findNotice(id);
		noticeService.deleteNotice(notice);
		return "success";
	}
	
	/**
	 * 加载公告发布页面
	 * @return
	 * @throws Exception
	 */
	public String sendNotice() throws Exception {
		return "success";
	}
	
	/**
	 * 提交新增公告内容
	 * @return
	 * @throws Exception
	 */
	public String confirmSendNotice() throws Exception {
		Notice notice = new Notice();
		
		notice.setMessage(message);
		Admin admin = (Admin) session.get("admin");
		notice.setAdmin(admin.getName());
		notice.setHeader(admin.getHeader());
		notice.setTime(new Date());
		
		noticeService.sendNotice(notice);
		return "success";
	}
	
	/**
	 * 查询意见列表
	 * @return
	 * @throws Exception
	 */
	public String viewMessage() throws Exception {
		ideas = noticeService.queryIdeas(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Idea");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 加载意见回复页面
	 * @return
	 * @throws Exception
	 */
	public String replyMessage() throws Exception {
		idea = noticeService.findIdea(id);
		return "success";
	}
	
	/**
	 * 提交意见回复信息
	 * @return
	 * @throws Exception
	 */
	public String confirmReplyMessage() throws Exception {
		idea = noticeService.findIdea(id);
		
		idea.setReMess(message);
		idea.setReTime(new SimpleDateFormat().format(new Date()));
		
		noticeService.replyIdeas(idea);
		return "success";
	}
	
	/**
	 * 删除意见
	 * @return
	 * @throws Exception
	 */
	public String deleteMessage() throws Exception {
		idea = noticeService.findIdea(id);
		noticeService.deleteIdea(idea);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	public List<Idea> getIdeas() {
		return ideas;
	}

	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}

	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
