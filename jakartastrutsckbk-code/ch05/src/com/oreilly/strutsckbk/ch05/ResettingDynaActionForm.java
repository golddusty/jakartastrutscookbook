package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class ResettingDynaActionForm extends DynaActionForm {

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		initialize(mapping);
	}

}
