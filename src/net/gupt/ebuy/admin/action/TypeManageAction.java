package net.gupt.ebuy.admin.action;

import java.util.List;

import net.gupt.ebuy.action.BaseAction;
import net.gupt.ebuy.admin.service.TypeService;
import net.gupt.ebuy.admin.service.TypeServiceImpl;
import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * ��Ʒ���ͺ�̨���������
 * @author glf
 *
 */
public class TypeManageAction extends BaseAction{
	private TypeService typeService = new TypeServiceImpl();
	
	private MainType mainType;//��Ʒ����
	private List<MainType> mainTypes;//���ͼ���
	
	private String id;//����ID
	private String type;//��������
	
	private Integer currentPage;//��ǰҳ����Ĭ�ϴ�0��ʼ
	private Integer maxPage;//���ҳ��
	private Integer totalRecord;//�����ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	
	/**
	 * ��ѯ��Ʒ�����б�
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
	 * �������͸���ҳ�� 
	 * @return
	 * @throws Exception
	 */
	public String updateType() throws Exception {
		mainType = typeService.findType(id);
		return "success";
	}
	
	/**
	 * �ύ���͸�����Ϣ
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
	 * ɾ����Ʒ����
	 * @return
	 * @throws Exception
	 */
	public String deleteType() throws Exception {
		mainType = typeService.findType(id);
		typeService.deleteType(mainType);
		return "success";
	}
	
	/**
	 * ����������Ʒ����ҳ�� 
	 * @return
	 * @throws Exception
	 */
	public String addType() throws Exception {
		return "success";
	}
	
	/**
	 * �ύ����������Ϣ
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
