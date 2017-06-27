package com.oreilly.strutsckbk.ch09;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction_orig extends Action {
    public ActionForward execute(ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response)
             throws Exception {

        String username = null;
        String password = null;
        
        ActionErrors errors = new ActionErrors();

        try {
            username = (String) PropertyUtils.getSimpleProperty(form, "username");
            password = (String) PropertyUtils.getSimpleProperty(form, "password");
        } catch (Exception e) {
            throw new IOException("Unable to retrieve username and password");
        }
        
        SecurityService service = new SecurityService();
        try {
            service.authenticate( username, password);
        } catch (UnknownUserException e1) {
            errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.unknown.user"));
            saveErrors(request, errors);
            return mapping.findForward("securityError");
        } catch (PasswordMatchException e) {
            errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.password.match"));
        }        

        // Report any errors we have discovered back to the original form
        if (!errors.isEmpty()) {
            saveErrors(request, errors);
            return (mapping.getInputForward());
        }
        
        User user = new User();
        user.setUsername(username);
        request.getSession().setAttribute("user", user);

        return mapping.findForward("success");
	}
}
