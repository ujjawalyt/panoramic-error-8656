package com.human.dao;

import com.human.bean.Employee;
import com.human.exception.EmployeeExecption;

public interface AdminDao {

	
	 public String AdminLogin(String username,String password );
	 
	 public Employee GetUserNamePassword(String name, String email) throws EmployeeExecption;
	 
	 
	 
	 
}
