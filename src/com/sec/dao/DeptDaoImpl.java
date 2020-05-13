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
		//����configuration���󣬼�����Դ
		Configuration config=new Configuration().configure("hibernate.cfg.xml");	
		//����SessionFactory�������󣬼���ִ��
		factory=config.buildSessionFactory();
		//����session��������

	}
	@Override
	public void deptAdd(Object obj) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		//��������
		Transaction ts=session.beginTransaction();
		session.save(obj);
		//�ύ����
		ts.commit();
		//�ر���Դ
		session.close();
		
	}

	@Override
	public void deptDel(Object obj) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		//��������
		Transaction ts=session.beginTransaction();
		session.delete(obj);
		//�ύ����
		ts.commit();
		//�ر���Դ
		session.close();
		
	}

	@Override
	public void deptUpdate(Object obj) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		//��������
		Transaction ts=session.beginTransaction();
		session.update(obj);
		//�ύ����
		ts.commit();
		//�ر���Դ
		session.close();
		
	}

	@Override
	public Object commonQueryById(Class cla, Serializable param) {
		// TODO Auto-generated method stub
		//����session ���ݲ�������
		Session session =factory.openSession();
		//����get��������������ѯ
		Object obj=session.get(cla, param);
		//�ر���Դ
		session.close();
		return obj;
	}

	@Override
	public List commonQuery() {
		// TODO Auto-generated method stub
		//����session ���ݲ�������
		Session session =factory.openSession();
		//ִ�в�ѯ����
		Query query=session.createQuery("from DeptInfo");

		List list=query.list();
		
		//�ر���Դ
		session.close();
		return list;
	}

}
