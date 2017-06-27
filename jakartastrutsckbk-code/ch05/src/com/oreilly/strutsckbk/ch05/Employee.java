package com.oreilly.strutsckbk.ch05;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private String employeeId;
	private String firstName;
	private String lastName;	
	private Date hireDate;
	private boolean married;
	private BigDecimal salary;

	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
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
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date HireDate) {
		this.hireDate = HireDate;
	}
	public String getHireDateDisplay() {
		if (hireDate == null)
			return "";
		else 
			return dateFormatter.format(hireDate);
	}
	public void setHireDateDisplay(String hireDateDisplay) {
		if (hireDateDisplay == null) 
			hireDate = null;
		else {
			try {
				hireDate = dateFormatter.parse(hireDateDisplay);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

	private DateFormat dateFormatter = new SimpleDateFormat("mm/DD/yy");
}
