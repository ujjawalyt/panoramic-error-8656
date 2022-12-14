package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.human.bean.Employee;
import com.human.bean.EmployeeDetails;
import com.human.bean.EmployeeLeave;
import com.human.exception.DepartmentException;
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
	public String updateEmployeeName(String employeename, int employee_Id)throws EmployeeExecption {
		String message ="Not Update Employee....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_name =? where employee_Id  =?;");
	        ps.setString(1, employeename);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee data update Sucessfully";
	    	   
	    	   }else {
	    		   throw new EmployeeExecption("Employee Id Did Not Match...");
	    	   }
	       
	       
	       
		} catch (Exception e) {
			  throw new EmployeeExecption(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String updateEmployeePassword(String employeepassword, int employee_Id) throws EmployeeExecption {
String message ="Not Update Employee Password....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_password =? where employee_Id  =?;");
	        ps.setString(1, employeepassword);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee password update Sucessfully";
	    	   
	    	   }else {
	    		   throw new EmployeeExecption("Employee Id Did Not Match...");
	    	   }
	       
	       
	       
		} catch (Exception e) {
			  throw new EmployeeExecption(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String updateEmployeeAddress(String employeeAddress, int employee_Id) throws EmployeeExecption {
String message ="Not Update Employee Address....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_Address =? where employee_Id  =?;");
	        ps.setString(1, employeeAddress);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee Address update Sucessfully";
	    	   
	    	   }else {
	    		   throw new EmployeeExecption("Employee Id Did Not Match...");
	    	   }
	       
	       
	       
		} catch (Exception e) {
			  throw new EmployeeExecption(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String updateEmployeeUserName(String employeeusername, int employee_Id) throws EmployeeExecption {
     String message ="Not Update Employee UserName....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_username =? where employee_Id  =?;");
	        ps.setString(1, employeeusername);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee UserName update Sucessfully";
	    	   
	    	   }else {
	    		   throw new EmployeeExecption("Employee Id Did Not Match...");
	    	   }
	       
	       
	       
		} catch (Exception e) {
			  throw new EmployeeExecption(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String updateEmployeeEmail(String employeeemail, int employee_Id) throws EmployeeExecption {
		
    String message ="Not Update Employee Email....";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_email =? where employee_Id  =?;");
	        ps.setString(1, employeeemail);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee Email update Sucessfully";
	    	   
	    	   }else {
	    		   throw new EmployeeExecption("Employee Id Did Not Match...");
	    	   }
	       
	       
	       
		} catch (Exception e) {
			  throw new EmployeeExecption(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String EmployeeLogin(String username, String password) {
		
		
      String message = "Username And User password Not Found";
		
		
		try (Connection con = DbUtil.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Employee Where employee_username  =?AND  employee_password  =?");
			
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
	public String transferEmployee(int employee_Id, int Department_Id) throws EmployeeExecption {
		
		
		
      String message ="Employee Is Not Transferd To Department";
		
		try(Connection con = DbUtil.provideConnection()) {
			
			PreparedStatement ps = con.prepareStatement("update employee set employee_Id =? where employee_Id  =?;");
	        ps.setInt(1, Department_Id);
	        ps.setInt(2,employee_Id);
	        
	       int x = ps.executeUpdate();
	       if(x>0) {
	    	   message = "Employee Transfer to  Department Sucessfully : " + employee_Id;
	    	   
	    	   }else {
	    		   throw new EmployeeExecption("Employee Id Did Not Match...");
	    	   }
	       
	       
	       
		} catch (Exception e) {
			  throw new EmployeeExecption(e.getMessage());
		}
		
		return message;
		

	
	}

	@Override
	public String AddEmployeeLeave(EmployeeLeave employeeleave) {
		
		String message ="Not Inserted....";
	    
	    try(Connection con = DbUtil.provideConnection()){
	    	
	    	PreparedStatement ps = con.prepareStatement("insert into EmployeeLeave values(?,?,?,?)");
	    	ps.setInt(1, employeeleave.getEmployee_Id());
	    	ps.setInt(2,employeeleave.getLeave_No());
	    	ps.setInt(3,employeeleave.getAvailable_Leave());
	    	ps.setString(4,employeeleave.getLeave_Status());
	    int x=	ps.executeUpdate();
	    if(x>0) {
	    	message = "EmployeeLeave Data Added Succesfully";
	    }
	    	
	    	
	    	
	    	
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return message;
		
	}

	@Override
	public String ApplyForLeave(int employee_Id) throws EmployeeExecption {
		
		String message = "Employee Id Does't Exists ";
		
	 try (Connection conn = DbUtil.provideConnection()){
		 
		 PreparedStatement ps = conn.prepareStatement("select Leave_No from employeeleave where employee_id =? ");
		  ps.setInt(1, employee_Id);
		 ResultSet rs = ps.executeQuery();
		  
		  if(rs.next()) {
			  int leaveNo = rs.getInt(1);
			
			  PreparedStatement ps1 = conn.prepareStatement(" select Available_Leave from employeeleave where employee_id =?");
			  ps1.setInt(1, employee_Id);
			  ResultSet rs1 = ps1.executeQuery();
			  
			  if(rs1.next()) {
				  int AvailableLeave = rs1.getInt(1);
				  
				  if(leaveNo<=AvailableLeave) {
					  message = "Employee Leave Request is Accepted ";
				  }else {
					  throw new EmployeeExecption("Employee Does't have Enough leave for apply");
				  }
				  
			  }
		  }
		  
		
	} catch (Exception e) {
		 throw new EmployeeExecption(e.getMessage());
	
		
		
		
		
		
	}

	 return message;
}

	@Override
	public List<EmployeeDetails> SeeEmployeeDetails() throws EmployeeExecption, DepartmentException {
		
		List<EmployeeDetails> employees = new ArrayList<>();
		
		 
		try (Connection con = DbUtil.provideConnection()){
			PreparedStatement ps = con.prepareStatement("select employee.employee_Id, employee.employee_name,employee.employee_Address,employee.employee_mobile,employee.employee_salary,Department.Department_name,employeeleave.Leave_No,\r\n"
					+ "employeeleave.Available_Leave,employeeleave.Leave_Status from ((employee INNER JOIN Department On employee.employee_Department_Id = Department.Department_Id ) INNER JOIN employeeleave\r\n"
					+ "On employee.employee_Id = employeeleave.employee_Id)");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				 
			    int id=	rs.getInt("employee_Id");
				String name = rs.getString("employee_name");
				String address= rs.getString("employee_Address");
			     String mobile=	rs.getString("employee_mobile");
			     int salary =  rs.getInt("employee_salary");
			     String dep = rs.getString("Department_name");
			     int ln = rs.getInt("Leave_No");
			     int Al = rs.getInt("Available_Leave");
			     String ls = rs.getString("Leave_Status");
			    		 
				EmployeeDetails employee = new EmployeeDetails(id, name, address, mobile, salary,dep,ln,Al,ls);
				
				employees.add(employee) ;
				
		      
			}
			
			
		}
		
		catch (Exception e) {
			 throw new EmployeeExecption(e.getMessage());
		}
		
		if(employees.size()==0) {
			throw new EmployeeExecption("No Employee Found in List.........");
		}
		
		
		return employees;
	}

}


