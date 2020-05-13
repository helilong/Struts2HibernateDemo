package com.sec.dao;
import java.io.Serializable;
import java.util.List;

public interface DeptDao {
	/**
	 * 方法接口
	 * */
	//添加方法
	public void deptAdd(Object obj);
	//删除
	public void deptDel(Object obj);
	//修改
	public void deptUpdate(Object obj);
	//查询单个
	public Object commonQueryById(Class cla,Serializable param);
	//查全部
	public List commonQuery();
	

	

}
