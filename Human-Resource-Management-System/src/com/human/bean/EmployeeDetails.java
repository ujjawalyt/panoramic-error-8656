package com.human.bean;

public class EmployeeDetails {
 
	private int employee_Id;
	private String employee_name;
	private String employee_Address;
	private String employee_mobile;
	private int employee_salary;
	private String Department_name;
	private int Leave_No;
	private int Available_Leave;
	private String Leave_Status;
	
	public EmployeeDetails() {
		
	}
	
	public EmployeeDetails(int employee_Id, String employee_name, String employee_Address, String employee_mobile,
			int employee_salary, String department_name, int leave_No, int available_Leave, String leave_Status) {
		super();
		this.employee_Id = employee_Id;
		this.employee_name = employee_name;
		this.employee_Address = employee_Address;
		this.employee_mobile = employee_mobile;
		this.employee_salary = employee_salary;
		Department_name = department_name;
		Leave_No = leave_No;
		Available_Leave = available_Leave;
		Leave_Status = leave_Status;
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

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getDepartment_name() {
		return Department_name;
	}

	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}

	public int getLeave_No() {
		return Leave_No;
	}

	public void setLeave_No(int leave_No) {
		Leave_No = leave_No;
	}

	public int getAvailable_Leave() {
		return Available_Leave;
	}

	public void setAvailable_Leave(int available_Leave) {
		Available_Leave = available_Leave;
	}

	public String getLeave_Status() {
		return Leave_Status;
	}

	public void setLeave_Status(String leave_Status) {
		Leave_Status = leave_Status;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employee_Id=" + employee_Id + ", employee_name=" + employee_name
				+ ", employee_Address=" + employee_Address + ", employee_mobile=" + employee_mobile
				+ ", employee_salary=" + employee_salary + ", Department_name=" + Department_name + ", Leave_No="
				+ Leave_No + ", Available_Leave=" + Available_Leave + ", Leave_Status=" + Leave_Status + "]";
	}
	
	
	
	
	
	
}
