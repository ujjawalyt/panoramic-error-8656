package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.human.bean.Employee;
import com.human.exception.EmployeeExecption;
import com.human.utility.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String AddEmployeeData(Employee employee) {
		
		String message ="Not Inserted....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("insert into employee (employee_name,employee_username,employee_password,"
					+ "employee_Address,employee_mobile, employee_email,employee_Department_Id,"
					+ "employee_salary)values(?,?,?,?,?,?,?,?)");
			 
			   ps.setString(1, employee.getEmployee_name());
			   ps.setString(2, employee.getEmployee_username());
			   ps.setString(3, employee.getEmployee_password());
			   ps.setString(4, employee.getEmployee_Address());
			   ps.setString(5, employee.getEmployee_mobile());
			   ps.setString(6, employee.getEmployee_email());
			   ps.setInt(7,employee.getEmployee_Department_Id());
			   ps.setInt(8,employee.getEmployee_salary());
			   
			int x =   ps.executeUpdate();
			
			if(x>0) {
				message ="Employee Data Inserted Sucessfully....";
			}
			
			
			
		} catch (SQLException e) {
			  e.printStackTrace();
			
		}

		return message;
	}

	@Override
	public List<Employee> SeeEmployeeDetail() throws EmployeeExecption {
	
		List<Employee> employees = new ArrayList<>();
		
		 
		try (Connection con = DbUtil.provideConnection()){
			PreparedStatement ps = con.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				 
			    int id=	rs.getInt("employee_Id");
				String name = rs.getString("employee_name");
				String username = rs.getString("employee_username");
				String password = rs.getString("employee_password");
				String address= rs.getString("employee_Address");
			      String mobile=	rs.getString("employee_mobile");
			     String email=	rs.getString("employee_email");
				int dpid = rs.getInt("employee_Department_Id");
				int salary =  rs.getInt("employee_salary");
				Employee employee = new Employee(id, name, username, password, address, mobile, email, dpid, salary);
				
				employees.add(employee);
		      
			}
			
			
		} catch (Exception e) {
			 throw new EmployeeExecption(e.getMessage());
		}
		
		if(employees.size()==0) {
			throw new EmployeeExecption("No Employee Found in List.........");
		}
		
		
		return employees;
	}

	@Override
	public String updateEmployee(String employeename, int employee_Id) {
		String message ="Not Update Employee....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_name =? where employee_Id  =?;");
	        ps.setString(1, employeename);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee data update Sucessfully";
	       }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}

}
