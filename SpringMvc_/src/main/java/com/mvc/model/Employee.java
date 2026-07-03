package com.mvc.model;



public class Employee {
	private String empId;
	 private String empName;
	 private String dept;
	 public Employee() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public Employee(String empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
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
	 public void setEmpName(String empName) {
		 this.empName = empName;
	 }
	 public String getDept() {
		 return dept;
	 }
	 public void setDept(String dept) {
		 this.dept = dept;
	 }
	 @Override
	 public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	 }
	
	 
	 

	 
}
