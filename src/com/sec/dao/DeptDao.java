package com.sec.dao;
import java.io.Serializable;
import java.util.List;

public interface DeptDao {
	/**
	 * �����ӿ�
	 * */
	//��ӷ���
	public void deptAdd(Object obj);
	//ɾ��
	public void deptDel(Object obj);
	//�޸�
	public void deptUpdate(Object obj);
	//��ѯ����
	public Object commonQueryById(Class cla,Serializable param);
	//��ȫ��
	public List commonQuery();
	

	

}
