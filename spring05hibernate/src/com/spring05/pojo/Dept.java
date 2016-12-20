package com.spring05.pojo;

import java.util.HashSet;
import java.util.Set;

public class Dept implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer deptno;
	private String dname;
	private String loc;
	//1:N 一个部门有多个雇员
	private Set<Emp> emps=new HashSet<Emp>(0);
	public Dept() {
	}
	
	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}