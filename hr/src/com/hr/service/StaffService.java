package com.hr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.dao.StaffMapper;
import com.hr.pojo.Staff;

//注解此界面为业务逻辑层
@Service("staffService")
public class StaffService {
	@Resource(name="staffMapper")
	private StaffMapper staffMapper;
	
	public int add(Staff staff){
		return staffMapper.add(staff);
	}
	  
	public int remove(Integer id){
		
		return staffMapper.remove(id);
	}
	public int modify(Staff staff){
		return staffMapper.modify(staff);
	}
	public Staff findById(Integer id){
		return staffMapper.findById(id);
	}
	public List<Staff> find(){
		return staffMapper.find();
	}
}