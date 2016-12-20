package com.hr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.hr.pojo.Staff;
//spirng ×¢½â£º½Ó¿Ú
@Repository("staffMapper")
public interface StaffMapper {
	
	@Insert("insert into Staff(ID,NAME,JOB,PHONE,EMAIL)  values(#{id},#{name},#{job},#{phone},#{email})")
	@SelectKey(statement="select SEQ_Staff.nextval from DUAL",keyProperty="id",resultType=int.class,before=true)
	int add(Staff staff);
	
	@Update("	update Staff set NAME=#{name,jdbcType=VARCHAR},JOB=#{job,jdbcType=VARCHAR},PHONE=#{phone,jdbcType=VARCHAR},EMAIL=#{email,jdbcType=VARCHAR}  where ID=#{id}")
	int modify(Staff staff);
	
	@Delete("delete from Staff where ID=#{id}")
	int remove(Integer id);
	
	@Select("select  ID,NAME,JOB,PHONE,EMAIL   from Staff where ID=#{id}")
	Staff findById(Integer id);
	
	@Select ("select ID,NAME,JOB,PHONE,EMAIL   from Staff")
	List<Staff> find();
	
	
}
