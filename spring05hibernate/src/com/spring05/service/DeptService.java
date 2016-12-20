package com.spring05.service;

import com.spring05.pojo.Dept;

public interface DeptService {
	void add(Dept dept);
	
	Dept find(Integer deptno);
	
}
