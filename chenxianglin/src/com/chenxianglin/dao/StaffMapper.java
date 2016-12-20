package com.chenxianglin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.chenxianglin.pojo.Staff;


//ע�����Ϊ�ӿ�
@Repository("staffMapper")
public interface StaffMapper {

	/**
	 * 
	 * @param pageno  �ڼ�ҳ
	 * @param pagesize ÿҳ��ʾ��¼
	 * @param sort 	�����ֶ�
	 * @param order	����ʽ
	 * @return
	 */
	List<Staff> findPager(
			@Param("pageno")Integer  pageno,
			@Param("pagesize")Integer  pagesize,
			@Param("sort")String  sort,
			@Param("order")String  order
		);
	
	/**
	 * ��ѯ�ܼ�¼��
	 * @return
	 */
	int findTotal(	);
	
}
