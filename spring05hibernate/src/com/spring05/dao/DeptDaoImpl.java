package com.spring05.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring05.pojo.Dept;

/**
 * dao-�־ò㣬��hibernate����
 * */

public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao {
	/**
	 * ��Ϊ�̳��븸��HibernateDaoSupport ���Ա���ע��sessionFactory
	 * setSessionFactory() ��ʼ��hibernateTemplate���� 
	 * ͨ������getHibernateTemplate()���ض����ݿ�Ĳ���
	 */
	@Override
	public void add(Dept dept) {
		this.getHibernateTemplate().save(dept);//����zhi
	}

	@Override
	public Dept find(Integer deptno) {	
		return getHibernateTemplate().get(Dept.class, deptno);
	}
}
