package com.human.bean;

public class Department {

	
	 private int Department_Id;
	 private String Department_name;
	 private String Department_code;
	 private String Department_location;
	 public Department() {
		 
	 }
	public Department(int department_Id, String department_name, String department_code, String department_location) {
		super();
		Department_Id = department_Id;
		Department_name = department_name;
		Department_code = department_code;
		Department_location = department_location;
	}
	public int getDepartment_Id() {
		return Department_Id;
	}
	public void setDepartment_Id(int department_Id) {
		Department_Id = department_Id;
	}
	public String getDepartment_name() {
		return Department_name;
	}
	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}
	public String getDepartment_code() {
		return Department_code;
	}
	public void setDepartment_code(String department_code) {
		Department_code = department_code;
	}
	public String getDepartment_location() {
		return Department_location;
	}
	public void setDepartment_location(String department_location) {
		Department_location = department_location;
	}
	@Override
	public String toString() {
		return "Department [Department_Id=" + Department_Id + ", Department_name=" + Department_name
				+ ", Department_code=" + Department_code + ", Department_location=" + Department_location + "]";
	}
	 
	 
	
	 
}
