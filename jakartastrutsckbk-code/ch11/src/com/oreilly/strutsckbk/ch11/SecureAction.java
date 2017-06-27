package com.oreilly.strutsckbk.ch11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.webapp.example.Constants;
import org.apache.struts.webapp.example.User;

public abstract class SecureAction extends Action {
    
    public ActionForward execute(ActionMapping mapping, 
                                 ActionForm form,
                                 HttpServletRequest request, 
                                 HttpServletResponse response) 
            throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(Constants.USER_KEY);
        if (user == null) return (mapping.findForward("logon"));
        return doExecute(mapping, form, request, response, user);
    }

    public abstract ActionForward doExecute(ActionMapping mapping, 
                                            ActionForm form,
                                            HttpServletRequest request, 
                                            HttpServletResponse response, 
                                            User user) throws Exception;
}
