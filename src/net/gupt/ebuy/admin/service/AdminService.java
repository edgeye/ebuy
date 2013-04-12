package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Admin;
/**
 * ��Ʒ��̨����ҵ��ӿ�
 * @author glf
 *
 */
public interface AdminService {
	
	/**
	 * ����Աע�᷽��
	 * @param admin
	 * @return
	 */
	public boolean regist(Admin admin);
	
	/**
	 * ����Ա��¼����
	 * @param name
	 * @param pass
	 * @return
	 */
	public Admin login(String name, String pass);
	
	/**
	 * ��ѯ����Ա�б�
	 * @return
	 */
	public List<Admin> queryAdmins(int currentPage, int pageSize);
	
	/**
	 * �������Ʋ��ҹ���Ա
	 * @param str ����
	 * @return
	 */
	public Admin findAdmin(String str);
	
	/**
	 * ����ID���ҹ���Ա
	 * @param id ����ԱID
	 * @return
	 */
	public Admin queryAdmin(String id);
	
	/**
	 * ����
	 * @param admin
	 */
	public void updateAdmin(Admin admin);
	
	/**
	 * ɾ��
	 * @param admin
	 */
	public void deleteAdmin(Admin admin);

}
