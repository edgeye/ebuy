package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
/**
 * �������ģ��ҵ��ӿ�
 * @author glf
 *
 */
public interface MessageService {
	
	/**
	 * �ύ�������
	 * @param idea ���
	 * @return
	 */
	public boolean submitMessage(Idea idea);
	
	/**
	 * ��ѯ��������б�
	 * @return
	 */
	public List<Idea> queryMessage();

}
