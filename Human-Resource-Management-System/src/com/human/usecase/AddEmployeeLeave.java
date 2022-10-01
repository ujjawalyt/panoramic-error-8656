package com.human.usecase;

import java.util.Scanner;

import com.human.bean.EmployeeLeave;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;

public class AddEmployeeLeave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
      
		String result = ed.AddEmployeeLeave(employeeLeave);
		System.out.println(result);
		

	}

}
