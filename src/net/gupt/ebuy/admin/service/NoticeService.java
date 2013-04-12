package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
/**
 * ������Ϣ��̨����ҵ��ӿ�
 * @author glf
 *
 */
public interface NoticeService {
	
	/**
	 * ����ID���ҹ���
	 * @param id ����ID
	 * @return
	 */
	public Notice findNotice(String id);
	
	/**
	 * ���¹���
	 * @param notice
	 */
	public void updateNotice(Notice notice);
	
	/**
	 * ɾ������
	 * @param notice
	 */
	public void deleteNotice(Notice notice);
	
	/**
	 * ��������
	 * @param notice
	 */
	public void sendNotice(Notice notice);
	
	/**
	 * ��ѯ��ǰҳ�µļ�¼�б�
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Idea> queryIdeas(int currentPage, int pageSize);
	
	/**
	 * �ظ����
	 * @param idea
	 */
	public void replyIdeas(Idea idea);
	
	/**
	 * ����ID�������
	 * @param id
	 * @return
	 */
	public Idea findIdea(String id);
	
	/**
	 * ɾ�����
	 * @param idea
	 */
	public void deleteIdea(Idea idea);

}
