package net.gupt.ebuy.admin.dao;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
/**
 * ��Ʒ���ͺ�̨�������ݷ��ʽӿ�
 * @author glf
 *
 */
public interface TypeDao {
	
	/**
	 * ��ѯ��ǰҳ���µĽ����
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿ���¼��
	 * @return
	 */
	public List<MainType> query(int currentPage, int pageSize);
	
	/**
	 * ����ID������Ʒ����
	 * @param id ����ID
	 * @return
	 */
	public MainType findById(String id);
	
	/**
	 * ����
	 * @param mainType
	 */
	public void update(MainType mainType);
	
	/**
	 * ɾ��
	 * @param mainType
	 */
	public void delete(MainType mainType);
	
	/**
	 * ����
	 * @param mainType
	 */
	public void save(MainType mainType);

}
