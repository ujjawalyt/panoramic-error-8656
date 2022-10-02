package com.human.usecase;

import java.util.Scanner;

import com.human.dao.DepartmentDao;
import com.human.dao.DepartmentDaoImpl;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;
import com.human.exception.EmployeeExecption;

public class EmployeeUpdateUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter 1 for update Employee Name");
			System.out.println("Enter 2 for update Employee Password");
			System.out.println("Enter 3 for update Employee Address");
			System.out.println("Enter 4 for update Email Address");
			System.out.println("Enter 5 for update New UserName");
			System.out.println("Enter 6 if you not want to update Employee Details");
			
    	EmployeeDao dao = new EmployeeDaoImpl();
			
			int choice = sc.nextInt();
//			Employee name update method
			if(choice ==1) {
		System.out.println("Enter the Employee Name ");
		String en = sc.next();
		System.out.println("Enter the Employee Id");
		int id = sc.nextInt();
	   
		try {
			String result = dao.updateEmployeeName(en, id);
			System.out.println(result);
		} catch (EmployeeExecption e) {
			 System.out.println(e.getMessage());
			
		}
		
}
//			***********************************
//			Employee password update  method
			else if(choice ==2) {
				System.out.println("Enter the Employee New Password ");
				String ep = sc.next();
				System.out.println("Enter the Employee Id");
				int id = sc.nextInt();
			    
				try {
					 String result = dao.updateEmployeePassword(ep, id);
					System.out.println(result);
				} catch (EmployeeExecption e) {
					 System.out.println(e.getMessage());
					
				}
				
		}
			
//			***********************************
//			Employee Address updated method;
			
			else if(choice ==3) {
				System.out.println("Enter the Employee New Address");
				String ea = sc.next();
				System.out.println("Enter the Employee Id");
				int id = sc.nextInt();
			    
				try {
					 String result = dao.updateEmployeeAddress(ea, id);
					System.out.println(result);
				} catch (EmployeeExecption e) {
					 System.out.println(e.getMessage());
					
				}
				
		}	
//			***********************************
//			Employee email update method
			
			else if(choice ==4) {
				System.out.println("Enter the Employee New Email Address");
				String ea = sc.next();
				System.out.println("Enter the Employee Id");
				int id = sc.nextInt();
			    
				try {
					 String result = dao.updateEmployeeEmail(ea, id);
					System.out.println(result);
				} catch (EmployeeExecption e) {
					 System.out.println(e.getMessage());
					
				}
				
		}	
			
//			***********************************	
//			 Employee update username method;
			
			else if(choice ==5) {
				System.out.println("Enter the Employee New UserName");
				String un = sc.next();
				System.out.println("Enter the Employee Id");
				int id = sc.nextInt();
			    
				try {
					 String result = dao.updateEmployeeUserName(un, id);
					System.out.println(result);
				} catch (EmployeeExecption e) {
					 System.out.println(e.getMessage());
					
				}
				
		}	
//			***********************************			
//		Employee loop break 
			else {
				System.out.println("Thanku from Coming in Employee Portal");
				break;
			}

		}
//	while loop End	***********************************	
		
	}

}
