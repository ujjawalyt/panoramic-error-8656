package com.human.usecase;

import java.util.Scanner;

import com.human.dao.DepartmentDao;
import com.human.dao.DepartmentDaoImpl;

public class DepartmentUpdateData {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Department Name ");
		String dn = sc.next();
		System.out.println("Enter the Department code");
		String dc = sc.next();
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
	String result = 	dao.updateDepartment(dn, dc);
	System.out.println(result);

	}

}
