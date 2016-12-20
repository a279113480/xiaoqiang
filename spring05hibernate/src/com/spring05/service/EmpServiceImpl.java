package com.spring05.service;

import java.util.Date;
import java.util.List;

import com.spring05.dao.EmpDao;
import com.spring05.pojo.Emp;

public class EmpServiceImpl implements EmpService {
	private EmpDao empDao;
	@Override
	public void add(Emp emp) {
		empDao.add(emp);
	}

	@Override
	public void modify(Emp emp) {
		empDao.modify(emp);

	}

	@Override
	public void remove(Emp emp) {
		empDao.remove(emp);
	}

	@Override
	public Emp find(Integer emp) {
		
		return empDao.find(emp);
	}

	@Override
	public List<Emp> find() {
		
		return empDao.find();
	}

	@Override
	public List<Emp> find(String ename, Date beginDate, Date endDate) {	
		return empDao.find(ename, beginDate, endDate);
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}



	
	

}
