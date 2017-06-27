package com.oreilly.strutsckbk.ch08;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class MyLoginForm extends ActionForm {

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (username == null || "".equals(username)) {
            errors.add("username", new ActionError("errors.required","The username"));
        }
        if (password == null || "".equals(password)) {
            errors.add("password", new ActionError("errors.required","The password"));
        }
        return errors;
    }
    private String username;
    private String password;
    
}
