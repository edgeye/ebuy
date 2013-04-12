package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
/**
 * 主页信息数据访问接口
 * @author glf
 *
 */
public interface MainDao {
	
	/**
	 * 查询最新上架商品
	 * @return
	 */
	public List<Product> findLatestPro();
	
	/**
	 * 查询促销商品
	 * @return
	 */
	public List<Product> findPromotPro();
	
	/**
	 * 查询当前页码下的记录列表
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<Notice> findNotice(int currentPage, int pageSize);
	
	/**
	 * 查询所有公告信息
	 * @return
	 */
	public List<Notice> findNotice();
	
	/**
	 * 查询商品类型列表 
	 * @return
	 */
	public List<MainType> listType();
	
	/**
	 * 根据类型和名称搜索商品
	 * @param type 类型
	 * @param name 名称
	 * @return
	 */
	public List<Product> searchPro(String type, String name);
	
	/**
	 * 根据ID查找商品信息
	 * @param id
	 * @return
	 */
	public Product findById(String id);

}
