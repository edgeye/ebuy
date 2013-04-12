package net.gupt.ebuy.admin.action;

import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.AdminService;
import net.gupt.ebuy.admin.service.AdminServiceImpl;
import net.gupt.ebuy.admin.service.CustomerService;
import net.gupt.ebuy.admin.service.CustomerServiceImpl;
import net.gupt.ebuy.pojo.Admin;
import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.service.MainService;
import net.gupt.ebuy.service.MainServiceImpl;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 商城后台管理控制器
 * @author glf
 *
 */
public class AdminAction extends BaseAction{
	private CustomerService customerService = new CustomerServiceImpl();
	private AdminService adminService = new AdminServiceImpl();
	private MainService mainService = new MainServiceImpl();
	
	private List<Notice> notices;//公告集合
	private List<Customer> customers;//客户集合
	private List<Admin> admins;//管理员集合
	private Admin admin;//管理员
	
	private String id;//管理员ID
	private String name;//管理员名称
	private String pass;//密码
	private String header;//头像
	private String phone;//电话
	private String email;//邮箱
	
	private Integer currentPage;//当前页数；默认从0开始
	private Integer maxPage;//最大页数
	private Integer totalRecord;//数据总记录数
	private Integer pageSize;//每页显示记录数
	
	/**
	 * 加载管理员注册页面
	 * @return
	 * @throws Exception
	 */
	public String adminRegist() throws Exception {
		return "success";
	}
	
	/**
	 * 提交管理员注册信息
	 * @return
	 * @throws Exception
	 */
	public String submitAdminRegist() throws Exception {
		Admin admin = new Admin();
		
		admin.setName(name);
		admin.setPass(pass);
		admin.setHeader(header);
		admin.setPhone(phone);
		admin.setEmail(email);
		
		adminService.regist(admin);
		return "success";
	}
	
	/**
	 * 加载管理员登录页面 
	 * @return
	 * @throws Exception
	 */
	public String adminLogin() throws Exception {
		return "success";
	}
	
	/**
	 * 提交登录信息
	 * @return
	 * @throws Exception
	 */
	public String checkAdminLogin() throws Exception {
		Admin admin = adminService.login(name, pass);
		if(admin!=null) {
			//将登录成功的管理员保存在session中
			session.put("admin", admin);
			return "success";
		}
		return "fail";
	}
	
	/**
	 * 管理员登出
	 * @return
	 * @throws Exception
	 */
	public String adminLogout() throws Exception {
		session.remove("admin");
		return "success";
	}
	
	/**
	 * 查询管理员列表
	 * @return
	 * @throws Exception
	 */
	public String viewAdmin() throws Exception {
		admins = adminService.queryAdmins(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Admin");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 加载管理员查询页面
	 * @return
	 * @throws Exception
	 */
	public String queryAdmin() throws Exception {
		return "success";
	}
	
	/**
	 * 提交查询条件
	 * @return
	 * @throws Exception
	 */
	public String confirmQueryAdmin() throws Exception {
		admin = adminService.findAdmin(name);
		return "success";
	}
	
	/**
	 * 更新管理员信息
	 * @return
	 * @throws Exception
	 */
	public String updateAdmin() throws Exception {
		admin = adminService.queryAdmin(id);
		return "success";
	}
	
	/**
	 * 提交信息更新
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdateAdmin() throws Exception {
		admin = adminService.queryAdmin(id);
		
		admin.setName(name);
		admin.setHeader(header);
		admin.setPass(pass);
		admin.setPhone(phone);
		admin.setEmail(email);
		
		adminService.updateAdmin(admin);
		return "success";
	}
	
	/**
	 * 删除管理员
	 * @return
	 * @throws Exception
	 */
	public String deleteAdmin() throws Exception {
		admin = adminService.queryAdmin(id);
		adminService.deleteAdmin(admin);
		return "success";
	}
	
	/**
	 * 初始化加载后台管理页面
	 * @return
	 * @throws Exception
	 */
	public String initAdmin() throws Exception {
		//查询公告
		notices = mainService.queryNotice();
		return "success";
	}
	
	/**
	 * 加载jsp文件frame
	 * @return
	 * @throws Exception
	 */
	public String loadCenter() throws Exception {
		return "success";
	}
	
	/**
	 * 加载jsp文件frame
	 * @return
	 * @throws Exception
	 */
	public String loadLeft() throws Exception {
		return "success";
	}
	
	/**
	 * 加载jsp文件frame
	 * @return
	 * @throws Exception
	 */
	public String loadRight() throws Exception {
		customers = customerService.listAllCustomer(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Customer");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}

	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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
