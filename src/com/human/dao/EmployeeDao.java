package com.human.dao;

import java.util.List;

import com.human.bean.Employee;
import com.human.exception.EmployeeExecption;

public interface EmployeeDao {

	
	public String AddEmployeeData(Employee employee);
	
	public List <Employee> SeeEmployeeDetail() throws EmployeeExecption;
	
	public String updateEmployee(String employeename, int id ) ;
}
