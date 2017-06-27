package com.oreilly.strutsckbk.ch05;

import java.math.BigDecimal;

import org.apache.struts.action.ActionForm;

public class EmployeeForm extends ActionForm {
	
	private String employeeId;
	private String firstName;
	private String lastName;	
	private String hireDateDisplay;
	private String salary;
	private boolean married;

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getHireDateDisplay() {
		return hireDateDisplay;
	}
	public void setHireDateDisplay(String hireDate) {
		this.hireDateDisplay = hireDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
