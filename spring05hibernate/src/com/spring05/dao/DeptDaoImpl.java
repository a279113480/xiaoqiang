package com.spring05.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring05.pojo.Dept;

/**
 * dao-持久层，由hibernate管理
 * */

public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao {
	/**
	 * 因为继承与父类HibernateDaoSupport 所以必须注入sessionFactory
	 * setSessionFactory() 初始化hibernateTemplate对象 
	 * 通过调用getHibernateTemplate()返回对数据库的操作
	 */
	@Override
	public void add(Dept dept) {
		this.getHibernateTemplate().save(dept);//保存zhi
	}

	@Override
	public Dept find(Integer deptno) {	
		return getHibernateTemplate().get(Dept.class, deptno);
	}
}
