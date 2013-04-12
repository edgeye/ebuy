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
 * ��Ʒ��̨���������
 * @author glf
 *
 */
public class ProductManageAction extends BaseAction{
	private ProductService productService = new ProductServiceImpl();
	private MainService mainService = new MainServiceImpl();
	
	private List<Product> products;//��Ʒ����
	private List<MainType> mainTypes;//���ͼ���
	private Product product;//��Ʒ
	
	private String id;//��ƷID
	private String name;//��Ʒ����
	private String price;//��Ʒ�۸�
	private String type;//��Ʒ����
	private String quantity;//��Ʒ����
	private String image;//��ƷͼƬ
	private String description;//��Ʒ����
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * ��ѯ��Ʒ�б�
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
	 * ������Ʒ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public String updateProduct() throws Exception {
		//������Ʒ����
		mainTypes = mainService.queryType();
		//����ID����ָ����Ʒ��Ϣ
		product = productService.queryById(id);
		return "success";
	}
	
	/**
	 * �ύ��Ʒ��Ϣ����
	 * @return
	 * @throws Exception
	 */
	public String confirmUpdate() throws Exception {
		//����ID����ָ����Ʒ��Ϣ
		product = productService.queryById(id);
		//������Ʒ��Ϣ
		product.setName(name);
		product.setImage(image);
		product.setPrice(Double.parseDouble(price));
		product.setQuantity(Integer.parseInt(quantity));
		product.setTime(new Date());
		product.setType(type);
		product.setDescription(description);
		//�ύ����
		productService.updateProduct(product);
		return "success";
	}
	
	/**
	 * ɾ����Ʒ
	 * @return
	 * @throws Exception
	 */
	public String deleteProduct() throws Exception {
		productService.deleteProduct(id);
		return "success";
	}
	
	/**
	 * ������Ʒ����ҳ��
	 * @return 
	 * @throws Exception
	 */
	public String searchProduct() throws Exception {
		//����������Ʒ������Ϣ
		mainTypes = mainService.queryType();
		return "success";
	}
	
	/**
	 * �ύ��������
	 * @return 
	 * @throws Exception
	 */
	public String confirmSearch() throws Exception {
		//�������ͺ����ƽ���ģ������
		products = mainService.searchPro(type, name);
		return "success";
	}
	
	/**
	 * ������Ʒ���ҳ��
	 * @return
	 * @throws Exception
	 */
	public String addProduct() throws Exception {
		//����������Ʒ������Ϣ
		mainTypes = mainService.queryType();
		return "success";
	}
	
	/**
	 * �ύ������Ʒ��Ϣ
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
