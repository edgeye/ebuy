package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
/**
 * 主页信息业务接口
 * @author glf
 *
 */
public interface MainService {
	
	/**
	 * 查询最新上架商品
	 * @return
	 * @throws Exception
	 */
	public List<Product> queryLatestPro() throws Exception;
	
	/**
	 * 查询普通商品展示
	 * @return
	 */
	public List<Product> queryRandomPro();
	
	/**
	 * 查询促销商品
	 * @return
	 */
	public List<Product> queryPromotPro();
	
	/**
	 * 查询当前页码公告信息列表
	 * @param currentPage 当前页数
	 * @param pageSize 每面记录数
	 * @return
	 */
	public List<Notice> queryNotice(int currentPage, int pageSize);
	
	/**
	 * 查询所有公告信息
	 * @return
	 */
	public List<Notice> queryNotice();
	
	/**
	 * 查询商品类型列表
	 * @return
	 */
	public List<MainType> queryType();
	
	/**
	 * 根据商品类型和商品名称进行商品搜索
	 * @param type 商品类型
	 * @param name 商品名称
	 * @return
	 */
	public List<Product> searchPro(String type, String name);
	
	/**
	 * 根据ID查询商品信息
	 * @param id 商品ID
	 * @return
	 */
	public Product findProduct(String id);

}
