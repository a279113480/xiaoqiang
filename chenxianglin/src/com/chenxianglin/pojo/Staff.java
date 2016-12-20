package com.chenxianglin.pojo;

import java.io.Serializable;

public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ename;   //员工名字
	private String job;		//员工工作
	private String dname;	//部门编号
	private String loc;		//部门位置
	private double sal;		//员工工资
	
	
	
	public Staff() {
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
