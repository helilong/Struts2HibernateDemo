package com.sec.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class util {
	public void load()
	{
		//创建configuration对象，加载资源
		Configuration config=new Configuration().configure("hibernate.cfg.xml");	
		//创建SessionFactory工厂对象，加载执行
		SessionFactory factory=factory=config.buildSessionFactory();
		//创建session操作对象
		Session session=factory.openSession();
		//开启事务
		Transaction ts=session.beginTransaction();
	}

}
