package com.hr.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hr.pojo.Staff;
import com.hr.service.StaffService;


@Controller
public class StaffController {
	@Resource(name="staffService")
	private StaffService staffService;
	
	
	@RequestMapping("staffController_list")
	public String list(ModelMap modelMap){
		//����ģ��(ҵ���߼��㣬����ģ������)
				List<Staff> staffs=staffService.find();
				
				//modelMal �൱��map  �൱��request����yu
				modelMap.put("staffs", staffs);
				//�߼���ͼ��
				return "index";
	}
	@RequestMapping("staffController_findById") 
	public String findById(ModelMap modelMap,@RequestParam(value = "id", required = true) Integer id){
		 Staff staff = staffService.findById(id);
		 //����request staff
		    modelMap.put("staff", staff);
		return "edit";
	}
	@RequestMapping("staffController_save") 
	public String  save(Staff staff){
		if (staff != null && staff.getId() != null) {
			staffService.modify(staff);
		    } else {
		    	staffService.add(staff);
		    }
		    return "redirect:staffController_list";
		
	}
	
	@RequestMapping("staffController_remove") 
	public String remove(@RequestParam(value = "id", required = true) Integer id) {	  
		staffService.remove(id);
	    return "redirect:staffController_list";
	  }

}
