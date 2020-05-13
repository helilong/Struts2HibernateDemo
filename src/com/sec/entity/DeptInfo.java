package com.sec.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门实体类
 * @author lenovo
 *
 */

public class DeptInfo {
	private Integer deptId;//部门编号
	private String deptName;//部门名称
	private String remark;//备注
	private Set empinfos=new HashSet();//一的一端，定义集合存放多个员工
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set getEmpinfos() {
		return empinfos;
	}
	public void setEmpinfos(Set empinfos) {
		this.empinfos = empinfos;
	}
	public DeptInfo(Integer deptId, String deptName, String remark, Set empinfos) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.remark = remark;
		this.empinfos = empinfos;
	}
	public DeptInfo( String deptName, String remark) {
		super();
		this.deptName = deptName;
		this.remark = remark;

	}
	public DeptInfo() {
		super();
	}

	
}
