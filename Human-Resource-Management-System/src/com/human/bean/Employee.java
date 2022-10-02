package com.human.bean;

public class Employee {
  
	private int employee_Id;
	private String employee_name;
	private String employee_username;
	private String employee_password;
	private String employee_Address;
	private String employee_mobile;
	private String  employee_email;
	private int employee_Department_Id;
	private int employee_salary;
	
	public Employee() {
		
	}
	
	public Employee(int employee_Id, String employee_name, String employee_username, String employee_password,
			String employee_Address, String employee_mobile, String employee_email, int employee_Department_Id,
			int employee_salary) {
		super();
		this.employee_Id = employee_Id;
		this.employee_name = employee_name;
		this.employee_username = employee_username;
		this.employee_password = employee_password;
		this.employee_Address = employee_Address;
		this.employee_mobile = employee_mobile;
		this.employee_email = employee_email;
		this.employee_Department_Id = employee_Department_Id;
		this.employee_salary = employee_salary;
	}

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_username() {
		return employee_username;
	}

	public void setEmployee_username(String employee_username) {
		this.employee_username = employee_username;
	}

	public String getEmployee_password() {
		return employee_password;
	}

	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}

	public String getEmployee_Address() {
		return employee_Address;
	}

	public void setEmployee_Address(String employee_Address) {
		this.employee_Address = employee_Address;
	}

	public String getEmployee_mobile() {
		return employee_mobile;
	}

	public void setEmployee_mobile(String employee_mobile) {
		this.employee_mobile = employee_mobile;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public int getEmployee_Department_Id() {
		return employee_Department_Id;
	}

	public void setEmployee_Department_Id(int employee_Department_Id) {
		this.employee_Department_Id = employee_Department_Id;
	}

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", employee_name=" + employee_name + ", employee_username="
				+ employee_username + ", employee_password=" + employee_password + ", employee_Address="
				+ employee_Address + ", employee_mobile=" + employee_mobile + ", employee_email=" + employee_email
				+ ", employee_Department_Id=" + employee_Department_Id + ", employee_salary=" + employee_salary + "]";
	}

	public Employee( String employee_username, String employee_password) {
		super();
	
		this.employee_username = employee_username;
		this.employee_password = employee_password;
	}

	public Employee(String employee_name, String employee_username, String employee_password) {
		super();
		this.employee_name = employee_name;
		this.employee_username = employee_username;
		this.employee_password = employee_password;
	}
	

	
	
	
}
