package com.sec.entity;
/**
 * 员工实体类
 * @author lenovo
 *
 */

public class EmpInfo {
	private Integer empId;//员工编号
	private String name;//员工姓名
	private DeptInfo dept;//多的一端：定义对象，外键字段 ----对象类型
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DeptInfo getDept() {
		return dept;
	}
	public void setDept(DeptInfo dept) {
		this.dept = dept;
	}
	public EmpInfo() {
		super();
	}
	public EmpInfo(Integer empId, String name, DeptInfo dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
	}
	

}
