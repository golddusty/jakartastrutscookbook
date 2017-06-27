package com.oreilly.strutsckbk.ch06;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CheckTokenAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (isTokenValid(request)) {
			// reset the token
			resetToken(request);

			// save data
			BusinessService.saveData();
		}
		else {
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("Invalid token"));
			saveErrors(request, errors);
			return new ActionForward(mapping.getInput());
		}
		return mapping.findForward("success");
	}
}
