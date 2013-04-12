package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
/**
 * 商品类型后台管理数据访问接口
 * @author glf
 *
 */
public interface TypeDao {
	
	/**
	 * 查询当前页码下的结果集
	 * @param currentPage 当前页数
	 * @param pageSize 每面记录数
	 * @return
	 */
	public List<MainType> query(int currentPage, int pageSize);
	
	/**
	 * 根据ID查找商品类型
	 * @param id 类型ID
	 * @return
	 */
	public MainType findById(String id);
	
	/**
	 * 更新
	 * @param mainType
	 */
	public void update(MainType mainType);
	
	/**
	 * 删除
	 * @param mainType
	 */
	public void delete(MainType mainType);
	
	/**
	 * 保存
	 * @param mainType
	 */
	public void save(MainType mainType);

}
