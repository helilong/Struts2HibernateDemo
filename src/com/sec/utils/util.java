package com.sec.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class util {
	public void load()
	{
		//����configuration���󣬼�����Դ
		Configuration config=new Configuration().configure("hibernate.cfg.xml");	
		//����SessionFactory�������󣬼���ִ��
		SessionFactory factory=factory=config.buildSessionFactory();
		//����session��������
		Session session=factory.openSession();
		//��������
		Transaction ts=session.beginTransaction();
	}

}
