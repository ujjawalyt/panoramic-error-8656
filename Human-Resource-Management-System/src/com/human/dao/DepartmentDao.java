package com.human.dao;

import java.util.List;

import com.human.bean.Department;
import com.human.exception.DepartmentException;

public interface DepartmentDao {

//	public String addNewDepartment(int did,String dname, String location );
	public String addNewDepartment1(Department department );
	
	public List<Department> showAllDepartmentDetail() throws DepartmentException;
	
	public String updateDepartment(String departmentName, String depatmentCode);
		
	
	
}
