package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.pojo.Notice;
/**
 * ������Ϣ��̨�������ݷ��ʽӿ�
 * @author glf
 *
 */
public interface NoticeDao {
	
	/**
	 * ����ID���ҹ���
	 * @param id ����ID
	 * @return
	 */
	public Notice findById(String id);
	
	/**
	 * ���¹�����Ϣ
	 * @param notice
	 */
	public void update(Notice notice);
	
	/**
	 * ɾ������
	 * @param notice
	 */
	public void delete(Notice notice);
	
	/**
	 * ���湫��
	 * @param notice
	 */
	public void save(Notice notice);
	
	/**
	 * ��ѯ��ǰҳ���µ�����б�
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Idea> query(int currentPage, int pageSize);
	
	/**
	 * ���������Ϣ
	 * @param idea
	 */
	public void updateIdea(Idea idea);
	
	/**
	 * ����ID�������
	 * @param id ���ID
	 * @return
	 */
	public Idea findIdeaById(String id);
	
	/**
	 * ɾ�����
	 * @param idea
	 */
	public void deleteIdea(Idea idea);

}
