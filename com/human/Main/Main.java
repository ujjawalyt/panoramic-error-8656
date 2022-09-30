package com.human.Main;

import java.util.List;
import java.util.Scanner;

import com.human.bean.Department;
import com.human.bean.Employee;
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
				 
			 }
			 
			 
			 
			 
//				================================= 
			 
			 else {
				 System.out.println("Thanku...........");
				 break;
			 }
			
		}
				 
				 
				 
		}	 
			 }
			 
			 
//				================================= 
			 else if(choice ==2) {
				 System.out.println("hrhyry");
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
