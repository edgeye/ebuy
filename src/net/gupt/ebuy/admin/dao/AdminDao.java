package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.Admin;
/**
 * 商城后台管理数据访问接口
 * @author glf
 *
 */
public interface AdminDao {
	
	/**
	 * 保存用户信息
	 * @param admin
	 * @return
	 */
	public boolean save(Admin admin);
	
	/**
	 * 根据名称查找
	 * @param name 名称
	 * @return
	 */
	public Admin findByName(String name);
	
	/**
	 * 查询当前页码下的记录列表
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Admin> query(int currentPage, int pageSize);
	
	/**
	 * 根据ID查找管理员
	 * @param id 管理员ID
	 * @return
	 */
	public Admin findById(String id);
	
	/**
	 * 更新
	 * @param admin
	 */
	public void update(Admin admin);
	
	/**
	 * 删除
	 * @param admin
	 */
	public void delete(Admin admin);

}
