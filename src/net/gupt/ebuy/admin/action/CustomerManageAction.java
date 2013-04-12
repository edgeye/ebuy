package net.gupt.ebuy.admin.action;

import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.CustomerService;
import net.gupt.ebuy.admin.service.CustomerServiceImpl;
import net.gupt.ebuy.pojo.Customer;
import net.gupt.ebuy.pojo.Orders;
import net.gupt.ebuy.service.OrderService;
import net.gupt.ebuy.service.OrderServiceImpl;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * �ͻ���̨���������
 * @author glf
 *
 */
public class CustomerManageAction extends BaseAction{
	private CustomerService customerService = new CustomerServiceImpl();
	private OrderService orderService = new OrderServiceImpl();
	
	private String id;//�ͻ�ID
	private String name;//�ͻ�����
	private Customer customer;//�ͻ�
	private List<Orders> orders;//�û���Ӧ��������
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * �鿴�ͻ���ϸ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public String viewDetail() throws Exception {
		customer = customerService.viewDetail(Integer.parseInt(id));
		return "success";
	}
	
	/**
	 * ���ؿͻ�����ҳ�� 
	 * @return
	 * @throws Exception
	 */
	public String searchCust() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ����������ѯ��Ӧ�ͻ���Ϣ
	 * @return
	 * @throws Exception
	 */
	public String queryCust() throws Exception {
		customer = customerService.queryCust(name);
		return "success";
	}
	
	public String selectOrders() throws Exception {
		orders = orderService.queryOrders(name, currentPage, pageSize);
		totalRecord = orderService.countOrders(name);
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
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
