package com.human.bean;

public class EmployeeLeave {

	private int employee_Id;
	private int Leave_No;
	private int Available_Leave;
	private String Leave_Status;
	
	public EmployeeLeave() {
		
	}
	public EmployeeLeave(int employee_Id, int leave_No, int available_Leave, String leave_Status) {
		super();
		this.employee_Id = employee_Id;
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
		return "EmployeeLeave [employee_Id=" + employee_Id + ", Leave_No=" + Leave_No + ", Available_Leave="
				+ Available_Leave + ", Leave_Status=" + Leave_Status + "]";
	}
	
	
	
	
}
