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
//		//创建configuration 对象，加载资源
//		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
//		//创建SessionFactory 工厂对象，加载执行
//		SessionFactory factory=conf.buildSessionFactory();
//		Session session=factory.openSession();
//		Transaction ts=session.beginTransaction();//开启事务 
		
		
		DeptDaoImpl dao=new DeptDaoImpl();
//		dao.deptAdd(new DeptInfo("开发部","部门阿斯顿"));
		
		List<DeptInfo> list=dao.commonQuery();
		System.out.println(list.get(0));
		
		}

}
