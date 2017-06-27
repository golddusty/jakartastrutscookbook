package com.oreilly.strutsckbk.ch09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class LoginAction extends Action {

    public ActionForward execute(ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response)
             throws Exception {
        
        ActionMessages messages = new ActionMessages();
        
        String username = (String) PropertyUtils.getSimpleProperty(form, "username");
        String password = (String) PropertyUtils.getSimpleProperty(form, "password");
                
        SecurityService service = new SecurityService();
        service.authenticate( username, password);

        User user = new User();
        user.setUsername(username);
        request.getSession().setAttribute("user", user);
        
        ActionMessage message = new ActionMessage("message.login.success", username);

        messages.add(ActionMessages.GLOBAL_MESSAGE, message);

        if (!messages.isEmpty()) {
            saveMessages( request.getSession(true), messages );
        }

        return mapping.findForward("success");
	}
}
