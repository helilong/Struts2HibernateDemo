package com.sec.entity;
/**
 * Ա��ʵ����
 * @author lenovo
 *
 */

public class EmpInfo {
	private Integer empId;//Ա�����
	private String name;//Ա������
	private DeptInfo dept;//���һ�ˣ������������ֶ� ----��������
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
