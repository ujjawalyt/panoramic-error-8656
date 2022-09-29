package com.human.usecase;

import java.util.List;

import com.human.bean.Employee;
import com.human.dao.EmployeeDao;
import com.human.dao.EmployeeDaoImpl;
import com.human.exception.EmployeeExecption;

public class EmployeeShowAllUseCase {

	public static void main(String[] args) {
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		 try {
			List<Employee> employees = dao.SeeEmployeeDetail();
			employees.forEach(s -> System.out.println(s));
		} catch (EmployeeExecption e) {
			
			System.out.println(e.getMessage());
		}
		 
	

	}

}
