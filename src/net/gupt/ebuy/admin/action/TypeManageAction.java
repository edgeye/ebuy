package net.gupt.ebuy.admin.action;

import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.TypeService;
import net.gupt.ebuy.admin.service.TypeServiceImpl;
import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 商品类型后台管理控制器
 * @author glf
 *
 */
public class TypeManageAction extends BaseAction{
	private TypeService typeService = new TypeServiceImpl();
	
	private MainType mainType;//商品类型
	private List<MainType> mainTypes;//类型集合
	
	private String id;//类型ID
	private String type;//类型名称
	
	private Integer currentPage;//当前页数；默认从0开始
	private Integer maxPage;//最大页数
	private Integer totalRecord;//数据总记录数
	private Integer pageSize;//每页显示记录数
	
	/**
	 * 查询商品类型列表
	 * @return
	 * @throws Exception
	 */
	public String viewType() throws Exception {
		mainTypes = typeService.queryTypes(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("MainType");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 加载类型更新页面 
	 * @return
	 * @throws Exception
	 */
	public String updateType() throws Exception {
		mainType = typeService.findType(id);
		return "success";
	}
	
	/**
	 * 提交类型更新信息
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdateType() throws Exception {
		mainType = typeService.findType(id);
		
		mainType.setType(type);
		
		typeService.updateType(mainType);
		return "success";
	}
	
	/**
	 * 删除商品类型
	 * @return
	 * @throws Exception
	 */
	public String deleteType() throws Exception {
		mainType = typeService.findType(id);
		typeService.deleteType(mainType);
		return "success";
	}
	
	/**
	 * 加载新增商品类型页面 
	 * @return
	 * @throws Exception
	 */
	public String addType() throws Exception {
		return "success";
	}
	
	/**
	 * 提交新增类型信息
	 * @return
	 * @throws Exception
	 */
	public String confirmAddType() throws Exception {
		MainType mainType = new MainType();
		
		mainType.setType(type);
		
		typeService.addType(mainType);
		return "success";
	}

	public MainType getMainType() {
		return mainType;
	}

	public void setMainType(MainType mainType) {
		this.mainType = mainType;
	}

	public List<MainType> getMainTypes() {
		return mainTypes;
	}

	public void setMainTypes(List<MainType> mainTypes) {
		this.mainTypes = mainTypes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
