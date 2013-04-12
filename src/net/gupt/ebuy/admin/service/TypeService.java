package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
/**
 * 商品类型后台管理业务接口
 * @author glf
 *
 */
public interface TypeService {
	
	/**
	 * 查询指定页码下的记录
	 * @param currentPage 当前页数
	 * @param pageSize 每页记录数
	 * @return
	 */
	public List<MainType> queryTypes(int currentPage, int pageSize);
	
	/**
	 * 根据ID查找指定类型
	 * @param id 类型ID
	 * @return
	 */
	public MainType findType(String id);
	
	/**
	 * 更新类型
	 * @param mainType
	 */
	public void updateType(MainType mainType);
	
	/**
	 * 删除类型
	 * @param mainType
	 */
	public void deleteType(MainType mainType);
	
	/**
	 * 新增类型
	 * @param mainType
	 */
	public void addType(MainType mainType);

}
