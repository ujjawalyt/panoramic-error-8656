package com.human.usecase;

import java.util.Scanner;

import com.human.dao.DepartmentDao;
import com.human.dao.DepartmentDaoImpl;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;

public class EmployeeUpdateUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Name ");
		String en = sc.next();
		System.out.println("Enter the Employee Id");
		int id = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
	String result = 	dao.updateEmployee(en, id);
	System.out.println(result);

	}

}
