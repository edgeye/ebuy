package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.admin.dao.PaymentDao;
import net.gupt.ebuy.admin.dao.PaymentDaoImpl;
import net.gupt.ebuy.pojo.Payment;
/**
 * 支付方式后台管理业务接口实现类
 * @author glf
 *
 */
public class PaymentServiceImpl implements PaymentService{
	private PaymentDao paymentDao = new PaymentDaoImpl();

	public List<Payment> queryPayments(int currentPage, int pageSize) {
		List<Payment> payments = paymentDao.query(currentPage, pageSize);
		return payments;
	}

	public Payment findPayment(String id) {
		Payment payment = paymentDao.findById(id);
		return payment;
	}

	public void updatePayment(Payment payment) {
		paymentDao.update(payment);
	}

	public void deletePayment(Payment payment) {
		paymentDao.delete(payment);
	}

	public void addPayment(Payment payment) {
		paymentDao.save(payment);
	}

}
