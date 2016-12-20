package com.spring05.service;

import java.util.Date;
import java.util.List;

import com.spring05.pojo.Emp;

public interface EmpService {
	void add(Emp emp);
	void modify(Emp emp);
	void remove(Emp emp);
	Emp find(Integer emp);
	List<Emp> find();
	List<Emp> find(String ename,Date beginDate,Date endDate);
}
