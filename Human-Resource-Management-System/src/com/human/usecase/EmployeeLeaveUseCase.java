package com.human.usecase;

import java.util.Scanner;

import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;
import com.human.exception.EmployeeExecption;

public class EmployeeLeaveUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Employee_id");
		int id = sc.nextInt();
		
		EmployeeDao ed =new  EmployeeDaoImpl();
		try {
			String result = ed.ApplyForLeave(id);
			System.out.println(result);
		} catch (EmployeeExecption e) {
			e.printStackTrace();
		}
		

	}

}
