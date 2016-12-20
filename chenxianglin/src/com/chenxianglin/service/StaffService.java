package com.chenxianglin.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chenxianglin.dao.StaffMapper;
import com.chenxianglin.pojo.Staff;
import com.chenxianglin.util.Pager;


//注解此界面为业务逻辑层
@Service("staffService")
public class StaffService {
		@Resource(name="staffMapper")
		private StaffMapper staffMapper;
		
		
		//封装pager
		public	Pager<Staff>  findPager(Integer pageno,Integer pagesize,String sort,String order){
			Pager<Staff> pager=new Pager<Staff>();
				pager.setRows(staffMapper.findPager(pageno, pagesize, sort, order));
				pager.setTotal(staffMapper.findTotal());
		return pager ;
	};
		
}
