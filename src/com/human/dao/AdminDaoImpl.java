package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.human.utility.DbUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public String AdminLogin(String username, String password) {
		
		String message = "Username And Userpassword Not Found";
		
		
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

}
