package net.gupt.ebuy.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.gupt.ebuy.dao.MainDao;
import net.gupt.ebuy.dao.MainDaoImpl;
import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
/**
 * 主页信息业务接口实现类
 * @author glf
 *
 */
public class MainServiceImpl implements MainService{
	private MainDao mainDao = new MainDaoImpl();

	public List<Product> queryLatestPro() throws Exception {
		List<Product> products = mainDao.findLatestPro();
		//最新上架商品；默认前台展示6件
		if(products.size()>6) {
			for(int i=products.size()-1; i>5; i--) {
				products.remove(i);
			}
		}
		return products;
	}

	public List<Product> queryRandomPro() {
		List<Product> products = mainDao.findLatestPro();
		Collections.shuffle(products);
		if(products.size()>6) {
			for(int i=products.size()-1; i>5; i--) {
				products.remove(i);
			}
		}
		return products;
	}

	public List<Product> queryPromotPro() {
		List<Product> products = mainDao.findPromotPro();
		if(products.size()>2) {
			for(int i=products.size()-1; i>1; i--) {
				products.remove(i);
			}
		}
		return products;
	}

	public List<Notice> queryNotice(int currentPage, int pageSize) {
		List<Notice> notices = mainDao.findNotice(currentPage, pageSize);
		return notices;
	}

	public List<MainType> queryType() {
		List<MainType> list = mainDao.listType();
		return list;
	}

	public List<Product> searchPro(String type, String name) {
		List<Product> products = mainDao.searchPro(type, name);
		return products;
	}

	public List<Notice> queryNotice() {
		List<Notice> notices = mainDao.findNotice();
		return notices;
	}

	public Product findProduct(String id) {
		Product product = mainDao.findById(id);
		return product;
	}

}
