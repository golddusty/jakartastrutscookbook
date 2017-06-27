package com.oreilly.strutsckbk;

import org.apache.struts.action.ActionMapping;

public class DisablingActionMapping extends ActionMapping {

	private String disabled;
	private boolean actionDisabled = false;
	
	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
		actionDisabled = new Boolean(disabled).booleanValue();
	}
	
	public boolean isActionDisabled() {
		return actionDisabled;
	}
}
