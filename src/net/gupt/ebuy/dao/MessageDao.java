package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Idea;
/**
 * �������ģ�����ݷ��ʽӿ�
 * @author glf
 *
 */
public interface MessageDao {
	
	/**
	 * �������
	 * @param idea ���
	 * @return
	 */
	public boolean saveMess(Idea idea);
	
	/**
	 * ��ѯ���з������
	 * @return
	 */
	public List<Idea> findAll();

}
