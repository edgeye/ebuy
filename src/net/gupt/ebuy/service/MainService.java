package net.gupt.ebuy.service;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
/**
 * ��ҳ��Ϣҵ��ӿ�
 * @author glf
 *
 */
public interface MainService {
	
	/**
	 * ��ѯ�����ϼ���Ʒ
	 * @return
	 * @throws Exception
	 */
	public List<Product> queryLatestPro() throws Exception;
	
	/**
	 * ��ѯ��ͨ��Ʒչʾ
	 * @return
	 */
	public List<Product> queryRandomPro();
	
	/**
	 * ��ѯ������Ʒ
	 * @return
	 */
	public List<Product> queryPromotPro();
	
	/**
	 * ��ѯ��ǰҳ�빫����Ϣ�б�
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿ���¼��
	 * @return
	 */
	public List<Notice> queryNotice(int currentPage, int pageSize);
	
	/**
	 * ��ѯ���й�����Ϣ
	 * @return
	 */
	public List<Notice> queryNotice();
	
	/**
	 * ��ѯ��Ʒ�����б�
	 * @return
	 */
	public List<MainType> queryType();
	
	/**
	 * ������Ʒ���ͺ���Ʒ���ƽ�����Ʒ����
	 * @param type ��Ʒ����
	 * @param name ��Ʒ����
	 * @return
	 */
	public List<Product> searchPro(String type, String name);
	
	/**
	 * ����ID��ѯ��Ʒ��Ϣ
	 * @param id ��ƷID
	 * @return
	 */
	public Product findProduct(String id);

}
