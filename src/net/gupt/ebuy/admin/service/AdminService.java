package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.Admin;
/**
 * 商品后台管理业务接口
 * @author glf
 *
 */
public interface AdminService {
	
	/**
	 * 管理员注册方法
	 * @param admin
	 * @return
	 */
	public boolean regist(Admin admin);
	
	/**
	 * 管理员登录方法
	 * @param name
	 * @param pass
	 * @return
	 */
	public Admin login(String name, String pass);
	
	/**
	 * 查询管理员列表
	 * @return
	 */
	public List<Admin> queryAdmins(int currentPage, int pageSize);
	
	/**
	 * 根据名称查找管理员
	 * @param str 名称
	 * @return
	 */
	public Admin findAdmin(String str);
	
	/**
	 * 根据ID查找管理员
	 * @param id 管理员ID
	 * @return
	 */
	public Admin queryAdmin(String id);
	
	/**
	 * 更新
	 * @param admin
	 */
	public void updateAdmin(Admin admin);
	
	/**
	 * 删除
	 * @param admin
	 */
	public void deleteAdmin(Admin admin);

}
