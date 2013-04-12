package net.gupt.ebuy.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 * hibernate工具类
 * @author glf
 *
 */
public class HibernateUtils {
	private static Configuration conf;
	private static ServiceRegistry reg;
	private static SessionFactory factory;
	
	//conf 对象只要加载一次就可以了
	static {
		conf = new Configuration();
		conf.configure();
		reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();           
		factory = conf.buildSessionFactory(reg);
	}
	
	/**
	 * 开启会话
	 * @return
	 */
	public static Session openSession() {
		return factory.openSession();
	}
	
	/**
	 * 获取总记录数
	 * @param className 对应实体类名
	 * @return
	 */
	public static Integer getTotalRecord(String className) {
		Session session = HibernateUtils.openSession();
		Query query = session.createQuery("from " + className + " as x");
		Integer totalRecord = query.list().size();
		session.close();
		return totalRecord;
	}
	
}
