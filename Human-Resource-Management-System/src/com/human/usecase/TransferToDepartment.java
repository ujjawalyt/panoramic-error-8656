package com.human.usecase;

import java.util.Scanner;

import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;
import com.human.exception.EmployeeExecption;

public class TransferToDepartment {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner( System.in);
		
		System.out.println("Enter your Employee Id ");
		int eid = sc.nextInt();
		System.out.println("Enter Your Department Id");
		int dip = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			String result = dao.transferEmployee(eid, dip);
			System.out.println(result);
		} catch (EmployeeExecption e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		

	}

}
