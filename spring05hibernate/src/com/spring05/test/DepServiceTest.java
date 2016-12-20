package com.spring05.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring05.pojo.Dept;
import com.spring05.service.DeptService;

public class DepServiceTest {
	private DeptService deptService;
	
	@Before
	public void init(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		deptService=ctx.getBean("deptService",DeptService.class);
	}
	
	
	@Test
	public void add() {
	Dept dept=new Dept();
	dept.setDeptno(50);
	dept.setDname("开发部");
	dept.setLoc("长沙");
	deptService.add(dept);
	}
}
