package com.human.usecase;

import java.util.Scanner;

import com.human.dao.AdminDao;
import com.human.dao.AdminDaoImpl;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;

public class EmployeePassword {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter login username and password");
		 System.out.println("Enter username");
		 String username = sc.next();
		 System.out.println("Enter user password");
		 String password = sc.next();
		 
		 EmployeeDao dao = new EmployeeDaoImpl();
String result=	 dao.EmployeeLogin(username, password);
System.out.println(result);
	}

}
