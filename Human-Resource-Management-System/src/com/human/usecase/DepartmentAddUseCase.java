package com.human.usecase;

import java.util.Scanner;

import com.human.bean.Department;
import com.human.dao.DepartmentDao;
import com.human.dao.DepartmentDaoImpl;

public class DepartmentAddUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
		System.out.println("Enter Department Name");
		String dname = sc.next();
		System.out.println("Enter Department Location");
		String location = sc.next();
		
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
		Department department = new Department();
		department.setDname(dname);
		department.setLocation(location);
		
		String result = dao.addNewDepartment1(department);
		System.out.println(result);
		
	}

}
