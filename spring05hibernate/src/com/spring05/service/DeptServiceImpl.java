package com.spring05.service;

import com.spring05.dao.DeptDao;
import com.spring05.pojo.Dept;

public class DeptServiceImpl implements DeptService {
	private DeptDao deptDao;
	@Override
	public void add(Dept dept) {
		deptDao.add(dept);
	}

	@Override
	public Dept find(Integer deptno) {
		
		return deptDao.find(deptno);
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	

}
