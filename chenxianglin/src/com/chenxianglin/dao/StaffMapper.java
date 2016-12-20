package com.chenxianglin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.chenxianglin.pojo.Staff;


//注解此类为接口
@Repository("staffMapper")
public interface StaffMapper {

	/**
	 * 
	 * @param pageno  第几页
	 * @param pagesize 每页显示记录
	 * @param sort 	排序字段
	 * @param order	排序方式
	 * @return
	 */
	List<Staff> findPager(
			@Param("pageno")Integer  pageno,
			@Param("pagesize")Integer  pagesize,
			@Param("sort")String  sort,
			@Param("order")String  order
		);
	
	/**
	 * 查询总记录数
	 * @return
	 */
	int findTotal(	);
	
}
