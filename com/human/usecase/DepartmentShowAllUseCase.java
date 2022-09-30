package com.human.usecase;

import java.util.List;

import com.human.bean.Department;
import com.human.dao.DepartmentDao;
import com.human.dao.DepartmentDaoImpl;
import com.human.exception.DepartmentException;

public class DepartmentShowAllUseCase {

	public static void main(String[] args) {
		
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
		 try {
			List<Department>    department=   dao.showAllDepartmentDetail();
			department.forEach(d -> System.out.println(d));
			
		} catch (DepartmentException e) {
		 System.out.println(e.getMessage());
	
		}

	}

}
