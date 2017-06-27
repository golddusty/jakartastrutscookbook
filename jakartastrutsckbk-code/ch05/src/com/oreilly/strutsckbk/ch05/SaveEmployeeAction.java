package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SaveEmployeeAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Employee emp = new Employee();
		
		// Copy to business object from ActionForm
		BeanUtils.copyProperties( emp, form );

		request.setAttribute("employee", emp);		
		return mapping.findForward("success");
		
	}
}
