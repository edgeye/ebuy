package net.gupt.ebuy.action;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.service.MainService;
import net.gupt.ebuy.service.MainServiceImpl;
/**
 * 首页Action
 * @author glf
 *
 */
public class MainAction extends BaseAction{
	private List<Product> products1;//最新上架商品集合
	private List<Product> products2;//展览商品集合
	private List<Product> products3;//促销商品集合
	private List<Notice> notices;//公告集合
	private List<MainType> mainTypes;//商品类型集合
	
	private String id;//商品ID
	private String name;//商品名称
	private String type;//商品类型
	private Product product;//商品
	private List<Product> results;//商品搜索结果集
	
	private MainService mainService = new MainServiceImpl();

	/**
	 * 首页载入时执行方法
	 */
	public String execute() throws Exception {
		//查询最新上架商品
		products1 = mainService.queryLatestPro();
		//查询展览商品
		products2 = mainService.queryRandomPro();
		//查询促销商品
		products3 = mainService.queryPromotPro();
		//查询公告
		notices = mainService.queryNotice();
		//加载商品类型
		mainTypes = mainService.queryType();
		return "success";
	}
	
	/**
	 * 根据类型和名称搜索商品
	 * @return 匹配商品
	 * @throws Exception
	 */
	public String search() throws Exception {
		results = mainService.searchPro(type, name);
		return "success";
	}
	
	public String productDetail() throws Exception {
		product = mainService.findProduct(id);
		return "success";
	}
	
	public List<Product> getProducts1() {
		return products1;
	}

	public void setProducts1(List<Product> products1) {
		this.products1 = products1;
	}

	public List<Product> getProducts2() {
		return products2;
	}

	public void setProducts2(List<Product> products2) {
		this.products2 = products2;
	}

	public List<Product> getProducts3() {
		return products3;
	}

	public void setProducts3(List<Product> products3) {
		this.products3 = products3;
	}

	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	public List<MainType> getMainTypes() {
		return mainTypes;
	}

	public void setMainTypes(List<MainType> mainTypes) {
		this.mainTypes = mainTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Product> getResults() {
		return results;
	}

	public void setResults(List<Product> results) {
		this.results = results;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
