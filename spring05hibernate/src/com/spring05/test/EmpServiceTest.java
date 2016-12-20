package com.spring05.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring05.pojo.Emp;
import com.spring05.service.DeptService;
import com.spring05.service.EmpService;

public class EmpServiceTest {
  private DeptService deptService;
  private EmpService empService;

  @Test
  public void add() {
    Emp emp = new Emp();
    emp.setEmpno(9999);
    emp.setEname("Jack");
    emp.setHiredate(new Date());
    emp.setSal(999d);

    emp.setDept(deptService.find(10));
    empService.add(emp);
  }

  @Test
  public void modify() {
    Emp emp = new Emp();
    emp.setEmpno(9999);
    emp.setEname("Rose");
    emp.setHiredate(new Date());
    emp.setSal(1d);

    emp.setDept(deptService.find(30));
    empService.modify(emp);
  }

  @Test
  public void remove() {
    Emp emp = new Emp();
    emp.setEmpno(9999);

    empService.remove(emp);
  }

  @Test
  public void findById() {
    Emp emp = empService.find(7788);
    System.out.println(emp.getEname() + " " + emp.getHiredate());
  }

  @Test
  public void find() {
    for (Emp emp : empService.find()) {
      System.out.println(emp.getEname() + " " + emp.getHiredate());
    }
  }

  @Test
  public void findParam() {
    String ename = null;
    Date beginDate = null;
    Date endDate = null;

    ename = "S";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
      beginDate = sdf.parse("1981-04-01");
      endDate = sdf.parse("1981-12-31");
    } catch (ParseException e) {
      e.printStackTrace();
    }

    for (Emp emp : empService.find(ename, beginDate, endDate)) {
      System.out.println(emp.getEname() + " " + emp.getHiredate());
    }
  }
  @SuppressWarnings("resource")
  @Before
  public void init() {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    deptService = ctx.getBean("deptService", DeptService.class);
    empService = ctx.getBean("empService", EmpService.class);
  }
}
