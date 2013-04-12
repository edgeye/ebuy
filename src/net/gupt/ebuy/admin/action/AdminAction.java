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
 * �̳Ǻ�̨���������
 * @author glf
 *
 */
public class AdminAction extends BaseAction{
	private CustomerService customerService = new CustomerServiceImpl();
	private AdminService adminService = new AdminServiceImpl();
	private MainService mainService = new MainServiceImpl();
	
	private List<Notice> notices;//���漯��
	private List<Customer> customers;//�ͻ�����
	private List<Admin> admins;//����Ա����
	private Admin admin;//����Ա
	
	private String id;//����ԱID
	private String name;//����Ա����
	private String pass;//����
	private String header;//ͷ��
	private String phone;//�绰
	private String email;//����
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * ���ع���Աע��ҳ��
	 * @return
	 * @throws Exception
	 */
	public String adminRegist() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ����Աע����Ϣ
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
	 * ���ع���Ա��¼ҳ�� 
	 * @return
	 * @throws Exception
	 */
	public String adminLogin() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ��¼��Ϣ
	 * @return
	 * @throws Exception
	 */
	public String checkAdminLogin() throws Exception {
		Admin admin = adminService.login(name, pass);
		if(admin!=null) {
			//����¼�ɹ��Ĺ���Ա������session��
			session.put("admin", admin);
			return "success";
		}
		return "fail";
	}
	
	/**
	 * ����Ա�ǳ�
	 * @return
	 * @throws Exception
	 */
	public String adminLogout() throws Exception {
		session.remove("admin");
		return "success";
	}
	
	/**
	 * ��ѯ����Ա�б�
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
	 * ���ع���Ա��ѯҳ��
	 * @return
	 * @throws Exception
	 */
	public String queryAdmin() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ��ѯ����
	 * @return
	 * @throws Exception
	 */
	public String confirmQueryAdmin() throws Exception {
		admin = adminService.findAdmin(name);
		return "success";
	}
	
	/**
	 * ���¹���Ա��Ϣ
	 * @return
	 * @throws Exception
	 */
	public String updateAdmin() throws Exception {
		admin = adminService.queryAdmin(id);
		return "success";
	}
	
	/**
	 * �ύ��Ϣ����
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
	 * ɾ������Ա
	 * @return
	 * @throws Exception
	 */
	public String deleteAdmin() throws Exception {
		admin = adminService.queryAdmin(id);
		adminService.deleteAdmin(admin);
		return "success";
	}
	
	/**
	 * ��ʼ�����غ�̨����ҳ��
	 * @return
	 * @throws Exception
	 */
	public String initAdmin() throws Exception {
		//��ѯ����
		notices = mainService.queryNotice();
		return "success";
	}
	
	/**
	 * ����jsp�ļ�frame
	 * @return
	 * @throws Exception
	 */
	public String loadCenter() throws Exception {
		return "success";
	}
	
	/**
	 * ����jsp�ļ�frame
	 * @return
	 * @throws Exception
	 */
	public String loadLeft() throws Exception {
		return "success";
	}
	
	/**
	 * ����jsp�ļ�frame
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
