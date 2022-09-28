package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.human.bean.Department;
import com.human.exception.DepartmentException;
import com.human.utility.DbUtil;

public class DepartmentDaoImpl implements DepartmentDao {

		@Override
		public String addNewDepartment1(Department department) {
			
			String message ="Not Inserted....";
		    
		    try(Connection con = DbUtil.provideConnection()){
		    	
		    	PreparedStatement ps = con.prepareStatement("insert into department (dname,location)values(?,?)");
		    	ps.setString(1, department.getDname());
		    	ps.setString(2,department.getLocation());
		    	
		    int x=	ps.executeUpdate();
		    if(x>0) {
		    	message = "Department Added Succesfully";
		    }
		    	
		    	
		    	
		    	
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    return message;
		}

		@Override
		public List<Department> showAllDepartmentDetail() throws DepartmentException {
			
			List<Department> departments = new ArrayList<>();
			
			try (Connection con = DbUtil.provideConnection()){
				 
			PreparedStatement pr = 	con.prepareStatement("Select * from department");
			ResultSet rs = pr.executeQuery();
			
			while(rs.next()) {
				 int id = rs.getInt("did");
				 String name = rs.getString("dname");
				 String location = rs.getString("location");
				 
				 Department department = new Department(id, name, location);
				 departments.add(department);
				 
			}
				
				
			} catch (Exception e) {
				throw new DepartmentException(e.getMessage());
			}
			
			if(departments.size()==0) {
				throw new DepartmentException("no Department found...");
			}
			
			
			
			
			return departments;
		}
		
	    
	    
	    
	    
	    
	  


	

}
