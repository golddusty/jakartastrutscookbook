package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;
import org.apache.struts.config.*;

public class WizardForm extends ActionForm {
	
	// current page
	private int page;
	
	// page 1 fields
	private String username;

	// page 2 fields
	private String password;

	public int getPage() {
		return page;
	}	
	public void setPage(int page) {
		this.page = page;
	}	
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
	public ActionErrors validate(ActionMapping mapping, 
			                    HttpServletRequest request) {
		ActionErrors errors = super.validate(mapping, request);
		if (page == 2) {
			if (username.equals(password)) {
				errors.add( "password", new ActionError("password","errors.password.sameAsName"));
			}
		}
		return errors;
	}	
}
