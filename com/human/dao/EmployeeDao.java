package com.human.dao;

import java.util.List;

import com.human.bean.Employee;
import com.human.exception.EmployeeExecption;

public interface EmployeeDao {

	
	
	
	public String AddEmployeeData(Employee employee);
	public String EmployeeLogin(String username,String password );
	public List <Employee> SeeEmployeeDetail() throws EmployeeExecption;
	public String updateEmployeePassword(String employeepassword, int employee_Id )throws EmployeeExecption; 
	public String updateEmployeeAddress(String employeeAddress, int employee_Id )throws EmployeeExecption; 
	public String updateEmployeeName(String employeename, int employee_Id )throws EmployeeExecption; 
	public String updateEmployeeUserName(String employeeusername, int employee_Id )throws EmployeeExecption;
	public String updateEmployeeEmail(String employeeemail, int employee_Id )throws EmployeeExecption; 
	
	
	
}
