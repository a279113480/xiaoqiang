package com.chenxianglin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chenxianglin.pojo.Staff;
import com.chenxianglin.service.StaffService;
import com.chenxianglin.util.Pager;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
//ע��Controller
@Controller
public class StaffController {
		//ע��staffService
	  @Resource(name = "staffService")
	  private StaffService staffService;
	
	  @RequestMapping("staffui_list")
	  public void list(@RequestParam(value = "page", required = true) Integer page,
	      @RequestParam(value = "rows", required = true) Integer rows,
	      @RequestParam(value = "sort", required = true) String sort,
	      @RequestParam(value = "order", required = true) String order,

	      HttpServletResponse response) {


	    // ������ʼҳ�ͽ���ҳ
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;

	    Pager<Staff> pager = staffService.findPager(pageno, pagesize, sort, order);
	    // ����URL:staffui_list?page=2&rows=5&sort=sal&order=desc

	    JsonConfig jsonConfig = new JsonConfig();
	    JSON json = JSONSerializer.toJSON(pager, jsonConfig);

	    try {
	      PrintWriter out = response.getWriter();
	      // ��ͻ��˻�д����
	      out.println(json.toString());
	      out.flush();
	      out.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	  
}
