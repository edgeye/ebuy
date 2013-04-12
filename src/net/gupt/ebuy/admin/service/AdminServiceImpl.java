package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.admin.dao.AdminDao;
import net.gupt.ebuy.admin.dao.AdminDaoImpl;
import net.gupt.ebuy.pojo.Admin;
/**
 * 商城后台管理业务接口实现类
 * @author glf
 *
 */
public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao = new AdminDaoImpl();

	public boolean regist(Admin admin) {
		adminDao.save(admin);
		return true;
	}

	public Admin login(String name, String pass) {
		Admin admin = adminDao.findByName(name);
		//密码正确则返回登录成功的管理员用户
		if(admin!=null && admin.getPass().equals(pass)) {
			return admin;
		}
		return null;
	}

	public List<Admin> queryAdmins(int currentPage, int pageSize) {
		List<Admin> admins = adminDao.query(currentPage, pageSize);
		return admins;
	}

	public Admin findAdmin(String str) {
		Admin admin = adminDao.findByName(str);
		return admin;
	}

	public Admin queryAdmin(String id) {
		Admin admin = adminDao.findById(id);
		return admin;
	}

	public void updateAdmin(Admin admin) {
		adminDao.update(admin);
	}

	public void deleteAdmin(Admin admin) {
		adminDao.delete(admin);
	}

}
