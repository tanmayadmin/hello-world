package com.emp;

public class Employee {

	String empId;
	String empName;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Employee(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
