package com.hr.test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hr.pojo.Staff;
import com.hr.service.StaffService;

public class test {
	private StaffService staffService;
	
	@Test
	public void add() {
		Staff staff=new Staff();
		staff.setJob("学生");
		staff.setName("范蠡奉");
		staff.setPhone("14789514124");
		staff.setEmail("154321@qq.com");
		int count=staffService.add(staff);
		if(count>0){
			System.out.println("插入成功");
		}else{
			System.out.println("插入失败");
		}
	}
	@Test
	public void modify(){
		Staff staff=new Staff();
		staff.setId(1001);
		staff.setJob("学生");
		staff.setName("aaaa奉");
		staff.setPhone("14789514124");
		staff.setEmail("154321@qq.com");
		staffService.modify(staff);
	}
	@Test
	public void remove(){
		staffService.remove(1001);
	}
	@Test 
	public void find(){
		List<Staff> staffs=staffService.find();
		for(Staff staff:staffs){
			System.out.println(staff.getName()+"   "+staff.getJob()+"   "+staff.getPhone());
		}
		
	}
	
	@Before
	public void init(){
		@SuppressWarnings("resource")
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");
		staffService=ctx.getBean("staffService",StaffService.class);
	}
}
