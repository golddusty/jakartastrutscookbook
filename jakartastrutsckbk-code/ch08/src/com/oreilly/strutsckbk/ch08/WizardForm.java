package com.oreilly.strutsckbk.ch08;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

public class WizardForm extends ValidatorForm {

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = super.validate(mapping, request);        
        if (page >= 2) {
            if (username.equals(password)) {
                errors.add( "password", new ActionMessage("password","errors.password.sameAsUsername"));
            }
        }
        return errors;
    }

    private String username;
    private String password;
    private String ssn;
}
