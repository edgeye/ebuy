package net.gupt.ebuy.admin.service;

import java.util.List;

import net.gupt.ebuy.admin.dao.TypeDao;
import net.gupt.ebuy.admin.dao.TypeDaoImpl;
import net.gupt.ebuy.pojo.MainType;
/**
 * 商品类型后台管理业务接口实现类
 * @author glf
 *
 */
public class TypeServiceImpl implements TypeService{
	private TypeDao typeDao = new TypeDaoImpl();

	public List<MainType> queryTypes(int currentPage, int pageSize) {
		List<MainType> mainTypes = typeDao.query(currentPage, pageSize);
		return mainTypes;
	}

	public MainType findType(String id) {
		MainType mainType = typeDao.findById(id);
		return mainType;
	}

	public void updateType(MainType mainType) {
		typeDao.update(mainType);
	}

	public void deleteType(MainType mainType) {
		typeDao.delete(mainType);
	}

	public void addType(MainType mainType) {
		typeDao.save(mainType);
	}

}
