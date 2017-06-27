package com.oreilly.strutsckbk.ch14;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogonAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
        String name = (String) PropertyUtils.getSimpleProperty(form, "username");
        User user = new User();
        user.setUsername(name);
        request.getSession().setAttribute("user", user);
		return mapping.findForward("success");
	}
}
