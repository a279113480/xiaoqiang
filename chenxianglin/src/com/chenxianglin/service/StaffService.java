package com.chenxianglin.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chenxianglin.dao.StaffMapper;
import com.chenxianglin.pojo.Staff;
import com.chenxianglin.util.Pager;


//ע��˽���Ϊҵ���߼���
@Service("staffService")
public class StaffService {
		@Resource(name="staffMapper")
		private StaffMapper staffMapper;
		
		
		//��װpager
		public	Pager<Staff>  findPager(Integer pageno,Integer pagesize,String sort,String order){
			Pager<Staff> pager=new Pager<Staff>();
				pager.setRows(staffMapper.findPager(pageno, pagesize, sort, order));
				pager.setTotal(staffMapper.findTotal());
		return pager ;
	};
		
}
