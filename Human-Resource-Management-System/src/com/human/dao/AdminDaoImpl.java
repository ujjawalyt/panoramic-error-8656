package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.human.bean.Employee;
import com.human.exception.EmployeeExecption;
import com.human.utility.DbUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public String AdminLogin(String username, String password) {
		
		String message = "Username And User password Not Found";
		
		
		try (Connection con = DbUtil.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Admin Where Admin_username =?AND  Admin_password =?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				message = "Login Sucessfull";
			}
			
			
			
		} catch (SQLException se) {
		
			se.getMessage();
		}
		
		
		
		return message;
		
		
	}

	@Override
	public Employee GetUserNamePassword(String name, String email) throws EmployeeExecption {
  Employee employee = null;
		
		try (Connection con = DbUtil.provideConnection()){
			PreparedStatement ps = con.prepareStatement("select employee_name,employee_username,employee_password from employee where employee_name = ? And employee_email =?");
			ps.setString(1, name);
			ps.setString(2,email);
			
			
			ResultSet rs =ps.executeQuery();
			
			if(rs.next()) {
				String n=	rs.getString("employee_name");		
				String e =	rs.getString("employee_username");
				String password =	rs.getString("employee_password");
				
				employee = new Employee(n, e, password);
				
			}
			else {
				throw new EmployeeExecption("Invalid name or email");
			}
			
			
			
		} catch (SQLException e) {
			throw new EmployeeExecption(e.getMessage());
		}
		
		
		
		
		
		return employee;
	}

}





