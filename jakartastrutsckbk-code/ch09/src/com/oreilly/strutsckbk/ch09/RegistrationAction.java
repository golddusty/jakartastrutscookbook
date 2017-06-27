package com.oreilly.strutsckbk.ch09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class RegistrationAction extends Action {

    public ActionForward execute(ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response)
             throws Exception {
        
        ActionErrors errors = new ActionErrors();
        
        String username = (String) PropertyUtils.getSimpleProperty(form, "username");
        String password = (String) PropertyUtils.getSimpleProperty(form, "password");
        
        if (username.equals(password)) {
            ActionMessage error = new ActionError("error.register.sameAsPassword", username);
            errors.add("username", error);
        }
        
        if (!errors.isEmpty()) {
            saveErrors(request, errors);
            return mapping.getInputForward();
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        SecurityService service = new SecurityService();
        service.add(user);

        return mapping.findForward("success");
	}
}
