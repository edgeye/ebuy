package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.pojo.MainType;
/**
 * ��Ʒ���ͺ�̨����ҵ��ӿ�
 * @author glf
 *
 */
public interface TypeService {
	
	/**
	 * ��ѯָ��ҳ���µļ�¼
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public List<MainType> queryTypes(int currentPage, int pageSize);
	
	/**
	 * ����ID����ָ������
	 * @param id ����ID
	 * @return
	 */
	public MainType findType(String id);
	
	/**
	 * ��������
	 * @param mainType
	 */
	public void updateType(MainType mainType);
	
	/**
	 * ɾ������
	 * @param mainType
	 */
	public void deleteType(MainType mainType);
	
	/**
	 * ��������
	 * @param mainType
	 */
	public void addType(MainType mainType);

}
