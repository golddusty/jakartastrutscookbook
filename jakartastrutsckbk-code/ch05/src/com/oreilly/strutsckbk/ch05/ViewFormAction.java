package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class ViewFormAction extends Action {

	public ActionForward execute(ActionMapping mapping,
      ActionForm form,
      HttpServletRequest request,
      HttpServletResponse response) throws Exception {
		
		DynaActionForm myForm = (DynaActionForm) form;

		PropertyUtils.setSimpleProperty(myForm, "firstName", "Bill");

		myForm.set("lastName", "Siggelkow");
				
    return mapping.findForward("success");
	}
}
