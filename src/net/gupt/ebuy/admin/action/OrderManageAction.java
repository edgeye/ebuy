package net.gupt.ebuy.admin.action;

import java.util.ArrayList;
import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.pojo.OrderDetails;
import net.gupt.ebuy.pojo.Orders;
import net.gupt.ebuy.service.OrderService;
import net.gupt.ebuy.service.OrderServiceImpl;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * ������Ϣ��̨���������
 * @author glf
 *
 */
public class OrderManageAction extends BaseAction{
	private OrderService orderService = new OrderServiceImpl();
	
	private Orders order;//����
	private List<Orders> orders;//������Ϣ����
	private List<OrderDetails> details;
	
	private String id;//����ID
	private String itemid;//������
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * ��ѯ���ж�����Ϣ
	 * @return
	 * @throws Exception
	 */
	public String queryOrders() throws Exception{
		orders = orderService.queryOrders(null, currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Orders");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * ��ѯ��������
	 * @return
	 * @throws Exception
	 */
	public String checkOrder() throws Exception {
		order = orderService.findOrder(id);
		return "success";
	}
	
	/**
	 * ɾ������
	 * @return
	 * @throws Exception
	 */
	public String deleteOrder() throws Exception {
		orderService.deleteOrder(id);
		return "success";
	}
	
	/**
	 * ��ѯ�������Ӧ����Ʒ
	 * @return
	 * @throws Exception
	 */
	public String verifyOrder() throws Exception {
		order = orderService.findOrder(id);
		details = new ArrayList<OrderDetails>(order.getDetails());
		return "success";
	}
	
	public String searchOrder() throws Exception {
		return "success";
	}
	
	public String confirmSearchOrder() throws Exception {
		order = orderService.searchOrder(itemid);
		return "success";
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<OrderDetails> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetails> details) {
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
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
