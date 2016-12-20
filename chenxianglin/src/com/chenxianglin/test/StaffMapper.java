package com.chenxianglin.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chenxianglin.pojo.Staff;
import com.chenxianglin.service.StaffService;
import com.chenxianglin.util.Pager;


public class StaffMapper {
	private StaffService staffService;
	@Test
	public void findPager() {
		// easyui 必需参数
	    Integer page = 2;
	    Integer rows = 5;
	    String sort = "sal";
	    String order = "desc";
	

	    // 处理起始页和结束页
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;

	    Pager<Staff> pager = staffService.findPager(pageno, pagesize, sort, order);
	    System.out.println("分页总数: " + pager.getTotal());
	    for (Staff staff : pager.getRows()) {
	      System.out.println(staff.getEname() + " " + staff.getDname() + " " + staff.getJob() + " " +staff.getLoc()+" "+staff.getSal());
	    }
	}

	
	
	@Before
	public void init(){
		@SuppressWarnings("resource")
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");
		staffService=ctx.getBean("staffService",StaffService.class);
	}
}
