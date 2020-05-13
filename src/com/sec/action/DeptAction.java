package com.sec.action;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;

import com.opensymphony.xwork2.ActionSupport;
import com.sec.dao.DeptDaoImpl;
import com.sec.entity.DeptInfo;

public class DeptAction extends ActionSupport{
	private DeptDaoImpl d=new DeptDaoImpl();
	private DeptInfo deptinfo;
	private List<DeptInfo> deptList;
	
	
	public DeptInfo getDeptinfo() {
		return deptinfo;
	}
	public void setDeptinfo(DeptInfo deptinfo) {
		this.deptinfo = deptinfo;
	}
	public List<DeptInfo> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<DeptInfo> deptList) {
		this.deptList = deptList;
	}
	/**
	 * 查询全部的方法
	 * */
	public String FindAll() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行全部的方法");
		
		
		  deptList= d.commonQuery();
		//System.out.println(deptList.get(0));
		
		return "findAll";
	}
	
	
	
	

}
