package net.gupt.ebuy.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.gupt.ebuy.pojo.Idea;
import net.gupt.ebuy.util.HibernateUtils;
/**
 * 意见反馈模块数据访问接口实现类
 * @author glf
 *
 */
public class MessageDaoImpl implements MessageDao{

	public boolean saveMess(Idea idea) {
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		session.save(idea);
		tx.commit();
		session.close();
		return true;
	}

	public List<Idea> findAll() {
		//开启会话
		Session session = HibernateUtils.openSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//反馈意见查询结果按发布时间倒序输出 
		Query query = session.createQuery("from Idea as i order by new_time desc");
		//获取结果集
		List<Idea> ideas = query.list();
		//提交事务
		tx.commit();
		//关闭会话
		session.close();
		return ideas;
	}

}
