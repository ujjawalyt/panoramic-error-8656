package com.human.usecase;

import java.util.Scanner;

import com.human.bean.Employee;
import com.human.dao.AdminDao;
import com.human.dao.AdminDaoImpl;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;
import com.human.exception.EmployeeExecption;



public class GetUserNameAndPassword {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
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

}
