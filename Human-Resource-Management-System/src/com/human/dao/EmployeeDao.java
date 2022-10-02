package com.human.dao;

import java.util.List;

import com.human.bean.Employee;
import com.human.bean.EmployeeDetails;
import com.human.bean.EmployeeLeave;
import com.human.exception.DepartmentException;
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
	public String transferEmployee(int employee_Id,int Department_Id )throws EmployeeExecption;
	public String AddEmployeeLeave(EmployeeLeave employeeleave);
	public String ApplyForLeave(int employee_Id ) throws EmployeeExecption;
	public List <EmployeeDetails> SeeEmployeeDetails()throws EmployeeExecption,DepartmentException;

	
	
	
}
