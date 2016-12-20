package com.spring05.dao;

import com.spring05.pojo.Dept;

public interface DeptDao {
	void add(Dept dept);
	Dept find(Integer deptno);
}
