package com.oreilly.strutsckbk.ch07;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class EmployeeForm extends ActionForm {
    
    private String firstName;
    private String lastName;
    private String ssn;
    
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
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
