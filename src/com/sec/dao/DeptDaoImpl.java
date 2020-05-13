package com.sec.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeptDaoImpl implements DeptDao{

	private static SessionFactory factory=null;
	static {
		//创建configuration对象，加载资源
		Configuration config=new Configuration().configure("hibernate.cfg.xml");	
		//创建SessionFactory工厂对象，加载执行
		factory=config.buildSessionFactory();
		//创建session操作对象

	}
	@Override
	public void deptAdd(Object obj) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		//开启事务
		Transaction ts=session.beginTransaction();
		session.save(obj);
		//提交事务
		ts.commit();
		//关闭资源
		session.close();
		
	}

	@Override
	public void deptDel(Object obj) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		//开启事务
		Transaction ts=session.beginTransaction();
		session.delete(obj);
		//提交事务
		ts.commit();
		//关闭资源
		session.close();
		
	}

	@Override
	public void deptUpdate(Object obj) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		//开启事务
		Transaction ts=session.beginTransaction();
		session.update(obj);
		//提交事务
		ts.commit();
		//关闭资源
		session.close();
		
	}

	@Override
	public Object commonQueryById(Class cla, Serializable param) {
		// TODO Auto-generated method stub
		//创建session 数据操作对象
		Session session =factory.openSession();
		//调用get方法根据主键查询
		Object obj=session.get(cla, param);
		//关闭资源
		session.close();
		return obj;
	}

	@Override
	public List commonQuery() {
		// TODO Auto-generated method stub
		//创建session 数据操作对象
		Session session =factory.openSession();
		//执行查询操作
		Query query=session.createQuery("from DeptInfo");

		List list=query.list();
		
		//关闭资源
		session.close();
		return list;
	}

}
