package com.secTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sec.dao.DeptDaoImpl;
import com.sec.entity.DeptInfo;

public class test {
	public static void main(String[] args) {
//		//����configuration ���󣬼�����Դ
//		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
//		//����SessionFactory �������󣬼���ִ��
//		SessionFactory factory=conf.buildSessionFactory();
//		Session session=factory.openSession();
//		Transaction ts=session.beginTransaction();//�������� 
		
		
		DeptDaoImpl dao=new DeptDaoImpl();
//		dao.deptAdd(new DeptInfo("������","���Ű�˹��"));
		
		List<DeptInfo> list=dao.commonQuery();
		System.out.println(list.get(0));
		
		}

}
