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
 * �����̨���������
 * @author glf
 *
 */
public class NoticeManageAction extends BaseAction{
	private String id;//����ID
	private String message;//����/��� ����
	
	private Notice notice;//����
	private List<Notice> notices;//���漯��
	
	private Idea idea;//���
	private List<Idea> ideas;//�������
	
	private MainService mainService = new MainServiceImpl();
	private NoticeService noticeService = new NoticeServiceImpl();
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * ��ѯ�����б�
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
	 * ���¹�����Ϣ
	 * @return
	 * @throws Exception
	 */
	public String updateNotice() throws Exception {
		notice = noticeService.findNotice(id);
		return "success";
	}
	
	/**
	 * �ύ������Ϣ����
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
	 * ɾ������
	 * @return
	 * @throws Exception
	 */
	public String deleteNotice() throws Exception {
		notice = noticeService.findNotice(id);
		noticeService.deleteNotice(notice);
		return "success";
	}
	
	/**
	 * ���ع��淢��ҳ��
	 * @return
	 * @throws Exception
	 */
	public String sendNotice() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ������������
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
	 * ��ѯ����б�
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
	 * ��������ظ�ҳ��
	 * @return
	 * @throws Exception
	 */
	public String replyMessage() throws Exception {
		idea = noticeService.findIdea(id);
		return "success";
	}
	
	/**
	 * �ύ����ظ���Ϣ
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
	 * ɾ�����
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
