package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import formdef.plugin.util.FormUtils;

public class SaveEmployeeFdAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		Employee emp = new Employee();
        BeanUtils.copyProperties( emp, form );
		
        // Get business object from ActionForm
        //EmployeeFd emp = (EmployeeFd) FormUtils.getFormValues(form, this, mapping, request);

		request.setAttribute("employee", emp);		
		return mapping.findForward("success");
		
	}
}
