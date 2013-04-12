package net.gupt.ebuy.action;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
import net.gupt.ebuy.service.MainService;
import net.gupt.ebuy.service.MainServiceImpl;
/**
 * ��ҳAction
 * @author glf
 *
 */
public class MainAction extends BaseAction{
	private List<Product> products1;//�����ϼ���Ʒ����
	private List<Product> products2;//չ����Ʒ����
	private List<Product> products3;//������Ʒ����
	private List<Notice> notices;//���漯��
	private List<MainType> mainTypes;//��Ʒ���ͼ���
	
	private String id;//��ƷID
	private String name;//��Ʒ����
	private String type;//��Ʒ����
	private Product product;//��Ʒ
	private List<Product> results;//��Ʒ���������
	
	private MainService mainService = new MainServiceImpl();

	/**
	 * ��ҳ����ʱִ�з���
	 */
	public String execute() throws Exception {
		//��ѯ�����ϼ���Ʒ
		products1 = mainService.queryLatestPro();
		//��ѯչ����Ʒ
		products2 = mainService.queryRandomPro();
		//��ѯ������Ʒ
		products3 = mainService.queryPromotPro();
		//��ѯ����
		notices = mainService.queryNotice();
		//������Ʒ����
		mainTypes = mainService.queryType();
		return "success";
	}
	
	/**
	 * �������ͺ�����������Ʒ
	 * @return ƥ����Ʒ
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
