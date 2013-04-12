package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Admin;
/**
 * �̳Ǻ�̨�������ݷ��ʽӿ�
 * @author glf
 *
 */
public interface AdminDao {
	
	/**
	 * �����û���Ϣ
	 * @param admin
	 * @return
	 */
	public boolean save(Admin admin);
	
	/**
	 * �������Ʋ���
	 * @param name ����
	 * @return
	 */
	public Admin findByName(String name);
	
	/**
	 * ��ѯ��ǰҳ���µļ�¼�б�
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Admin> query(int currentPage, int pageSize);
	
	/**
	 * ����ID���ҹ���Ա
	 * @param id ����ԱID
	 * @return
	 */
	public Admin findById(String id);
	
	/**
	 * ����
	 * @param admin
	 */
	public void update(Admin admin);
	
	/**
	 * ɾ��
	 * @param admin
	 */
	public void delete(Admin admin);

}
