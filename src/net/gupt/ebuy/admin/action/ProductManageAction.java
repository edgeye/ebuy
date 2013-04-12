package net.gupt.ebuy.admin.action;

import java.util.Date;
import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.service.MainService;
import net.gupt.ebuy.service.MainServiceImpl;
import net.gupt.ebuy.service.ProductService;
import net.gupt.ebuy.service.ProductServiceImpl;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 商品后台管理控制器
 * @author glf
 *
 */
public class ProductManageAction extends BaseAction{
	private ProductService productService = new ProductServiceImpl();
	private MainService mainService = new MainServiceImpl();
	
	private List<Product> products;//商品集合
	private List<MainType> mainTypes;//类型集合
	private Product product;//商品
	
	private String id;//商品ID
	private String name;//商品名称
	private String price;//商品价格
	private String type;//商品类型
	private String quantity;//商品数量
	private String image;//商品图片
	private String description;//商品描述
	
	private Integer currentPage;//当前页数；默认从0开始
	private Integer maxPage;//最大页数
	private Integer totalRecord;//数据总记录数
	private Integer pageSize;//每页显示记录数
	
	/**
	 * 查询商品列表
	 * @return
	 * @throws Exception
	 */
	public String viewProduct() throws Exception {
		products = productService.queryProducts(currentPage, pageSize);
		totalRecord = HibernateUtils.getTotalRecord("Product");
		maxPage = totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		return "success";
	}
	
	/**
	 * 更新商品信息
	 * @return
	 * @throws Exception
	 */
	public String updateProduct() throws Exception {
		//加载商品类型
		mainTypes = mainService.queryType();
		//根据ID查找指定商品信息
		product = productService.queryById(id);
		return "success";
	}
	
	/**
	 * 提交商品信息更新
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdate() throws Exception {
		//根据ID查找指定商品信息
		product = productService.queryById(id);
		//更新商品信息
		product.setName(name);
		product.setImage(image);
		product.setPrice(Double.parseDouble(price));
		product.setQuantity(Integer.parseInt(quantity));
		product.setTime(new Date());
		product.setType(type);
		product.setDescription(description);
		//提交更新
		productService.updateProduct(product);
		return "success";
	}
	
	/**
	 * 删除商品
	 * @return
	 * @throws Exception
	 */
	public String deleteProduct() throws Exception {
		productService.deleteProduct(id);
		return "success";
	}
	
	/**
	 * 加载商品搜索页面
	 * @return 
	 * @throws Exception
	 */
	public String searchProduct() throws Exception {
		//加载所有商品类型信息
		mainTypes = mainService.queryType();
		return "success";
	}
	
	/**
	 * 提交搜索条件
	 * @return 
	 * @throws Exception
	 */
	public String confirmSearch() throws Exception {
		//根据类型和名称进行模糊搜索
		products = mainService.searchPro(type, name);
		return "success";
	}
	
	/**
	 * 加载商品添加页面
	 * @return
	 * @throws Exception
	 */
	public String addProduct() throws Exception {
		//加载所有商品类型信息
		mainTypes = mainService.queryType();
		return "success";
	}
	
	/**
	 * 提交新增商品信息
	 * @return
	 * @throws Exception
	 */
	public String confirmAdd() throws Exception {
		product = new Product();
		
		product.setName(name);
		product.setPrice(Double.parseDouble(price));
		product.setQuantity(Integer.parseInt(quantity));
		product.setImage(image);
		product.setDescription(description);
		product.setType(type);
		product.setTime(new Date());
		
		productService.addProduct(product);
		return "success";
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<MainType> getMainTypes() {
		return mainTypes;
	}

	public void setMainTypes(List<MainType> mainTypes) {
		this.mainTypes = mainTypes;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
