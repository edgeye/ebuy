package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.admin.dao.CustomerDao;
import net.gupt.ebuy.admin.dao.CustomerDaoImpl;
import net.gupt.ebuy.pojo.Customer;
/**
 * �ͻ���Ϣ��̨����ҵ��ӿ�
 * @author glf
 *
 */
public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao = new CustomerDaoImpl();

	public List<Customer> listAllCustomer(int currentPage, int pageSize) {
		List<Customer> customers = customerDao.findAll(currentPage, pageSize);
		return customers;
	}

	public Customer viewDetail(int id) {
		Customer customer = customerDao.findById(id);
		return customer;
	}

	public Customer queryCust(String name) {
		Customer customer = customerDao.findByName(name);
		return customer;
	}

}
