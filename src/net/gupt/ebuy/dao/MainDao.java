package net.gupt.ebuy.dao;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
import net.gupt.ebuy.pojo.Notice;
import net.gupt.ebuy.pojo.Product;
/**
 * ��ҳ��Ϣ���ݷ��ʽӿ�
 * @author glf
 *
 */
public interface MainDao {
	
	/**
	 * ��ѯ�����ϼ���Ʒ
	 * @return
	 */
	public List<Product> findLatestPro();
	
	/**
	 * ��ѯ������Ʒ
	 * @return
	 */
	public List<Product> findPromotPro();
	
	/**
	 * ��ѯ��ǰҳ���µļ�¼�б�
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<Notice> findNotice(int currentPage, int pageSize);
	
	/**
	 * ��ѯ���й�����Ϣ
	 * @return
	 */
	public List<Notice> findNotice();
	
	/**
	 * ��ѯ��Ʒ�����б� 
	 * @return
	 */
	public List<MainType> listType();
	
	/**
	 * �������ͺ�����������Ʒ
	 * @param type ����
	 * @param name ����
	 * @return
	 */
	public List<Product> searchPro(String type, String name);
	
	/**
	 * ����ID������Ʒ��Ϣ
	 * @param id
	 * @return
	 */
	public Product findById(String id);

}
