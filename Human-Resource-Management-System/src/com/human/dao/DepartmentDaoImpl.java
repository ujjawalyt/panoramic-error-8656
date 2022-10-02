package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.human.bean.Department;
import com.human.exception.DepartmentException;
import com.human.exception.EmployeeExecption;
import com.human.utility.DbUtil;

public class DepartmentDaoImpl implements DepartmentDao {

		@Override
		public String addNewDepartment1(Department department) {
			
			String message ="Not Inserted....";
		    
		    try(Connection con = DbUtil.provideConnection()){
		    	
		    	PreparedStatement ps = con.prepareStatement("insert into department (Department_name,Department_code,Department_location)values(?,?,?)");
		    	ps.setString(1, department.getDepartment_name());
		    	ps.setString(2,department.getDepartment_code());
		    	ps.setString(3,department.getDepartment_location());
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
				 int id = rs.getInt("Department_Id");
				 String name = rs.getString("Department_name");
				 String code = rs.getString("Department_code");
				 String location = rs.getString("Department_location");
				 
				 Department department = new Department(id, name, code,location);
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

		@Override
		public String updateDepartment(String departmentName, String depatmentCode)  {
			
			String message ="Not Update Department....";
			
			try (Connection con = DbUtil.provideConnection()){
				
				PreparedStatement ps = con.prepareStatement("update department set department_name =? where department_code =?;");
		        ps.setString(1, departmentName);
		        ps.setString(2,depatmentCode);
		        
		       int x = ps.executeUpdate();
		       if(x>0) {
		    	   message = "Department data update Sucessfully";
		       }
				
			} catch (SQLException e) {
				e.getStackTrace();
			}
			
			return message;
		}
		
	    
	    
	    
	    
	    
	  


	

}
