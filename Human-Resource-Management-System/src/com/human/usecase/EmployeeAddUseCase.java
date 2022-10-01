package com.human.usecase;

import java.util.Scanner;

import com.human.bean.Employee;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;

public class EmployeeAddUseCase {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
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
		
	 EmployeeDao dao = new EmployeeDaoImpl();
	 Employee employee = new Employee();
	  employee.setEmployee_name(n);
	  employee.setEmployee_username(un);
	  employee.setEmployee_password(p);
	  employee.setEmployee_Address(a);
	  employee.setEmployee_mobile(m);
	  employee.setEmployee_email(e);
	  employee.setEmployee_Department_Id(di);
	  employee.setEmployee_salary(sal);
	  
	String result =   dao.AddEmployeeData(employee);
	System.out.println(result);
	  
	 
	      
	 
		
	}

}
