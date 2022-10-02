package com.human.Main;

import java.util.List;
import java.util.Scanner;

import com.human.bean.Department;
import com.human.bean.Employee;
import com.human.bean.EmployeeDetails;
import com.human.bean.EmployeeLeave;
import com.human.dao.AdminDao;
import com.human.dao.AdminDaoImpl;
import com.human.dao.DepartmentDao;
import com.human.dao.DepartmentDaoImpl;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;
import com.human.exception.DepartmentException;
import com.human.exception.EmployeeExecption;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Human-Resource-Management-System");
		
		while(true) {
			System.out.println("Enter 1 for Admin");
			System.out.println("Enter 2 for Employee");
			System.out.println("Enter 3 for Exist");
			 int choice = sc.nextInt();
			 
			 if(choice ==1) {
				 System.out.println("Enter login username and password");
				 System.out.println("Enter username");
				 String username = sc.next();
				 System.out.println("Enter user password");
				 String password = sc.next();
				 
				 AdminDao dao = new AdminDaoImpl();
		String result=	 dao.AdminLogin(username, password);
		System.out.println(result);
		if(result.equals("Login Sucessfull")) {
			System.out.println("Welcome To Admin Portal ..");
			while(true) {
			System.out.println("Enter 1 for Add new Department ");
			System.out.println("Enter 2 for See the Department Data ");
			System.out.println("Enter 3 for update the Department Data ");
			System.out.println("Enter 4 for Register new Employee ");
			System.out.println("Enter 5 for Generate UserName And Password for Employee");
			System.out.println("Enter 6 for Transfer the Employee to other Department");
			System.out.println("Enter 7 for Grant or Deny Leave Request of Employee");
			System.out.println("Enter 8 for Exist from Admin Portal");
			 int choice1 = sc.nextInt();
			 
//			================================= 
			 if(choice1 ==1) {
				 
				 System.out.println("Enter Department Name");
					String dname = sc.next();
					System.out.println("Enter Department code");
					String dcode = sc.next();
					System.out.println("Enter Department Location");
					String location = sc.next();
					DepartmentDao dao1 = new DepartmentDaoImpl();
					
					Department department = new Department();
					department.setDepartment_name(dname);
					department.setDepartment_code(dcode);
					department.setDepartment_location(location);
					
					String result1 = dao1.addNewDepartment1(department);
					System.out.println(result1);
			 }
			 
//		================================= 	 
			 else if(choice1 ==2) {
				
				 DepartmentDao dao2 = new DepartmentDaoImpl();
					
				 try {
					List<Department>    department=   dao2.showAllDepartmentDetail();
					department.forEach(d -> System.out.println(d));
					
				} catch (DepartmentException e) {
				 System.out.println(e.getMessage());
			
				}
			 }
//				================================= 
			 else if(choice1 ==3) {
				 
				 System.out.println("Enter the Department Name ");
					String dn = sc.next();
					System.out.println("Enter the Department code");
					String dc = sc.next();
					
					DepartmentDao dao3 = new DepartmentDaoImpl();
					
				String result2 = 	dao3.updateDepartment(dn, dc);
				System.out.println(result2);
				 
				 
			 }
//				================================= 	 
			 else if(choice1 ==4) {
				 
				 System.out.println("Enter Employee Detail");

					System.out.println("Enter Employee Name");
					String n = sc.next();
					System.out.println("Enter Employee UserName");
					String un = sc.next();
					System.out.println("Enter Employee Password");
					String p = sc.next();
					System.out.println("Enter Employee Address");
					String a = sc.next();
					System.out.println("Enter Employee Mobile");
					String m = sc.next();
					System.out.println("Enter Employee Email");
					String e = sc.next();
					System.out.println("Enter Employee Department_Id");
					int di = sc.nextInt();
					System.out.println("Enter Employee Salary");
					int sal = sc.nextInt();
					
				 EmployeeDao dao3 = new EmployeeDaoImpl();
				 Employee employee = new Employee();
				  employee.setEmployee_name(n);
				  employee.setEmployee_username(un);
				  employee.setEmployee_password(p);
				  employee.setEmployee_Address(a);
				  employee.setEmployee_mobile(m);
				  employee.setEmployee_email(e);
				  employee.setEmployee_Department_Id(di);
				  employee.setEmployee_salary(sal);
				  
				String result3 =   dao3.AddEmployeeData(employee);
				System.out.println(result3);	 
			 }
//				================================= 		 
			 else if(choice1 ==5) {
				 System.out.println("Enter name And Email to Generate Username And Password");
			        System.out.println("Enter name");
					String n = sc.next();
					System.out.println("Enter email Address Which you submit In the form");
					String e = sc.next();
					
					AdminDao doa = new AdminDaoImpl();
					
				try {
					Employee employee = doa.GetUserNamePassword(n, e);
				 System.out.println("Welcome to Our Company " + employee.getEmployee_name());
				 System.out.println("Welcome to Our Company your username is :" + employee.getEmployee_username());
				 System.out.println("Welcome to Our Company  your password is : " + employee.getEmployee_password());
				} catch (EmployeeExecption ee) {
					System.out.println(ee.getMessage());
				}
			 }
//				================================= 	
			 else if(choice1 ==6) {
				 
				 System.out.println("Enter your Employee Id ");
					int eid = sc.nextInt();
					System.out.println("Enter Your Department Id");
					int dip = sc.nextInt();
					
					EmployeeDao dao7 = new EmployeeDaoImpl();
					
					try {
						String result9 = dao7.transferEmployee(eid, dip);
						System.out.println(result9);
					} catch (EmployeeExecption e) {
						System.out.println(e.getMessage());
//						e.printStackTrace();
					}
			 }
//				================================= 	
			 else if(choice1 ==7) {
				 System.out.println("Enter employee_Id");
					int ei = sc.nextInt();
			         System.out.println("Enter Leave_No");
			         int lv = sc.nextInt();
					System.out.println("Enter Available leave No");
					int ln = sc.nextInt();
					System.out.println("Enter Leave_Status");
					String sts = sc.next();
					
					EmployeeDao ed = new EmployeeDaoImpl();
					
					EmployeeLeave employeeLeave = new EmployeeLeave();
					employeeLeave.setEmployee_Id(ei);
					employeeLeave.setLeave_No(lv);
					employeeLeave.setAvailable_Leave(ln);
					employeeLeave.setLeave_Status(sts);
			      
					String res1 = ed.AddEmployeeLeave(employeeLeave);
					System.out.println(res1);
			 }
			 
			 
			 
//				================================= 
			 
			 else {
				 System.out.println("your are Exist from Admin portal");
				 System.out.println("Thanku...........");
				 break;
			 }
			
		}
				 
				 
				 
		}	 
			 }
			 
			 
//				================================= 
			 else if(choice ==2) {
				 System.out.println("Welcome to employee portal");
				 
				 System.out.println("Enter login username and password");
				 System.out.println("Enter username");
				 String username = sc.next();
				 System.out.println("Enter user password");
				 String password = sc.next();
				 EmployeeDao dao = new EmployeeDaoImpl();
		         String result=	 dao.EmployeeLogin(username, password);
		         System.out.println(result);
		         if(result.equals("Login Sucessfull")) {
		 			while(true) {
		 			System.out.println("Enter 1 for See Employee Detail ");
		 			System.out.println("Enter 2 for Update Employee Data ");
		 			System.out.println("Enter 3 for Change his Password ");
		 			System.out.println("Enter 4 for Apply for Leave");
		 			System.out.println("Enter 5 for Exist from Employee  ");
		 			
		 			 int choice1 = sc.nextInt();
		 			 
		 			 if(choice1==1) {
		 				EmployeeDao dao4 = new EmployeeDaoImpl();
//		 				 try {
//		 					List<Employee> employees = dao4.SeeEmployeeDetail();
//		 					employees.forEach(s -> System.out.println(s));
//		 				} catch (EmployeeExecption e) {
//		 					
//		 					System.out.println(e.getMessage());
//		 				}
		 				try {
							List<EmployeeDetails> employees = 	dao4.SeeEmployeeDetails();
							employees.forEach(s -> System.out.println(s));
						} catch (EmployeeExecption | DepartmentException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
		 				 
		 			 }
//						================================= 	
		 			 else if(choice1==2) {
		 				while(true) {
		 					System.out.println("Enter 1 for update Employee Name");
		 					System.out.println("Enter 2 for update Employee Password");
		 					System.out.println("Enter 3 for update Employee Address");
		 					System.out.println("Enter 4 for update Email Address");
		 					System.out.println("Enter 5 for update New UserName");
		 					System.out.println("Enter 6 if you not want to update Employee Details");
		 					
		 		    	EmployeeDao dao5 = new EmployeeDaoImpl();
		 					
		 					int choice3 = sc.nextInt();
//		 					Employee name update method
		 					if(choice3 ==1) {
		 				System.out.println("Enter the Employee Name ");
		 				String en = sc.next();
		 				System.out.println("Enter the Employee Id");
		 				int id = sc.nextInt();
		 			   
		 				try {
		 					String result3 = dao5.updateEmployeeName(en, id);
		 					System.out.println(result3);
		 				} catch (EmployeeExecption e) {
		 					 System.out.println(e.getMessage());
		 					
		 				}
		 				
		 		}
//		 					***********************************
//		 					Employee password update  method
		 					else if(choice3 ==2) {
		 						System.out.println("Enter the Employee New Password ");
		 						String ep = sc.next();
		 						System.out.println("Enter the Employee Id");
		 						int id = sc.nextInt();
		 					    
		 						try {
		 							 String result4 = dao5.updateEmployeePassword(ep, id);
		 							System.out.println(result4);
		 						} catch (EmployeeExecption e) {
		 							 System.out.println(e.getMessage());
		 							
		 						}
		 						
		 				}
		 					
//		 					***********************************
//		 					Employee Address updated method;
		 					
		 					else if(choice3 ==3) {
		 						System.out.println("Enter the Employee New Address");
		 						String ea = sc.next();
		 						System.out.println("Enter the Employee Id");
		 						int id = sc.nextInt();
		 					    
		 						try {
		 							 String result5 = dao5.updateEmployeeAddress(ea, id);
		 							System.out.println(result5);
		 						} catch (EmployeeExecption e) {
		 							 System.out.println(e.getMessage());
		 							
		 						}
		 						
		 				}	
//		 					***********************************
//		 					Employee email update method
		 					
		 					else if(choice3 ==4) {
		 						System.out.println("Enter the Employee New Email Address");
		 						String ea = sc.next();
		 						System.out.println("Enter the Employee Id");
		 						int id = sc.nextInt();
		 					    
		 						try {
		 							 String result6 = dao5.updateEmployeeEmail(ea, id);
		 							System.out.println(result6);
		 						} catch (EmployeeExecption e) {
		 							 System.out.println(e.getMessage());
		 							
		 						}
		 						
		 				}	
		 					
//		 					***********************************	
//		 					 Employee update username method;
		 					
		 					else if(choice3 ==5) {
		 						System.out.println("Enter the Employee New UserName");
		 						String un = sc.next();
		 						System.out.println("Enter the Employee Id");
		 						int id = sc.nextInt();
		 					    
		 						try {
		 							 String result7 = dao5.updateEmployeeUserName(un, id);
		 							System.out.println(result7);
		 						} catch (EmployeeExecption e) {
		 							 System.out.println(e.getMessage());
		 							
		 						}
		 						
		 				}	
//		 					***********************************			
//		 				Employee loop break 
		 					else {
		 						System.out.println("Thanku from Coming in Employee Portal");
		 						break;
		 					}

		 				}
		 			 }
		 			 
//						================================= 
	 			 else if(choice1==3) {
	 				System.out.println("Enter the Employee New Password ");
						String ep = sc.next();
						System.out.println("Enter the Employee Id");
						int id = sc.nextInt();
					    
						try {
							 String result4 = dao.updateEmployeePassword(ep, id);
							System.out.println(result4);
						} catch (EmployeeExecption e) {
							 System.out.println(e.getMessage());
							
						}
		 			 }
		 			 
		 //						================================= 		 
		 			 
		 			 
	 			 else if(choice1==4) {
	 				 
	 				System.out.println("Enter your Employee_id");
	 				int id = sc.nextInt();
	 				
	 				EmployeeDao ed =new  EmployeeDaoImpl();
	 				try {
	 					String res = ed.ApplyForLeave(id);
	 					System.out.println(res);
	 				} catch (EmployeeExecption e) {
	 					System.out.println(e.getMessage());
	 				}
	 				
	 			 }
//						================================= 	
	 			 else {
	 				System.out.println("Thanku....."); 
	 				break;
	 			 }
//						================================= 		 			 
		 			 
		 			 
		 			}
		         } 
		         
			 }
			 
			 
//				================================= 
			 else if(choice ==3) {
				 System.out.println("Thank you.........");
				 break;
			 }
			
			
		}
		
		
		
//		==========================		

	}

}
