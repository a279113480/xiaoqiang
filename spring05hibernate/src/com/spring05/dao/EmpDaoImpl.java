package com.spring05.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring05.pojo.Emp;

public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {

	@Override
	public void add(Emp emp) {
		this.getHibernateTemplate().save(emp);
	}

	@Override
	public void modify(Emp emp) {
		this.getHibernateTemplate().update(emp);
		
	}

	@Override
	public void remove(Emp emp) {
		this.getHibernateTemplate().delete(emp);
		
	}

	@Override
	public Emp find(Integer empno) {
		
		return this.getHibernateTemplate().get(Emp.class, empno);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> find() {
		String hql="from Emp";
		return (List<Emp>)this.getHibernateTemplate().find(hql,new Object[]{});
		//若参数固定则使用以下代码
		///String ename="%S%";
		//Double sal=800d;
		//String hql="from Emp where ename like ? and sal = ? ";
		//return (List<Emp>)this.getHibernateTemplate().find(hql,new Object[]{ename,sal});
	}

	@Override
	public List<Emp> find(final String ename, final Date beginDate, final Date endDate) {
		String tmphql=" from Emp where 1=1 ";
		if(!StringUtils.isEmpty(ename)){
			tmphql +=" ename like:ename ";
		}
		if(beginDate!=null&&endDate!=null){
			tmphql+= " and hiredate between :beginDate and :endDate  ";
		}
		final String hql=tmphql;
		//通过执行hibernate回调方类在内部累中执行hql语句，解决spring封装hibernate不足
		return this.getHibernateTemplate().execute(new HibernateCallback<List<Emp>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<Emp> doInHibernate(Session session)
					throws HibernateException, SQLException {
					Query query=session.createQuery(hql);
					if(!StringUtils.isEmpty(ename)){
						query.setString("ename", ename);
					}
					if(beginDate!=null&&endDate!=null){
						query.setDate("beginDate", beginDate);
						query.setDate("endDate", endDate);
					}
				return query.list();
			}
			
		});
	}

}
