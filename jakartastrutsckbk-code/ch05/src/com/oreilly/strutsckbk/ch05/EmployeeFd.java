package com.oreilly.strutsckbk.ch05;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeFd {
	
	private String employeeId;
	private String firstName;
	private String lastName;	
	private boolean married;
	private Float salary;

	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
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
    public boolean getMarried() {
        return married;
    }
	public void setMarried(boolean married) {
		this.married = married;
	}
}
