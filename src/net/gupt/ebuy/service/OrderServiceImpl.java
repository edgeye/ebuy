package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.dao.OrderDao;
import net.gupt.ebuy.dao.OrderDaoImpl;
import net.gupt.ebuy.pojo.Orders;
/**
 * 订单管理业务接口实现类
 * @author glf
 *
 */
public class OrderServiceImpl implements OrderService{
	private OrderDao orderDao = new OrderDaoImpl();

	public boolean saveOrder(Orders order) {
		orderDao.save(order);
		return true;
	}

	public List<Orders> queryOrders(String name, int currentPage, int pageSize) {
		List<Orders> orders = orderDao.query(name, currentPage, pageSize);
		return orders;
	}

	public Orders findOrder(String id) {
		Orders order = orderDao.findById(id);
		return order;
	}

	public void deleteOrder(String id) {
		Orders order = orderDao.findById(id);
		orderDao.delete(order);
	}

	public Orders searchOrder(String itemid) {
		Orders order = orderDao.searchOrder(itemid);
		return order;
	}
	
	public int countOrders(String name) {
		int count = orderDao.countOrders(name);
		return count;
	}

}
