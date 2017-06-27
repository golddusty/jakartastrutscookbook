package com.oreilly.strutsckbk.ch11.ams;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class BaseAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = getUser(request);
            if (user != null) session.setAttribute("user", user);
        }
        return doExecute(mapping, form, request, response);
    }
    
    public abstract ActionForward doExecute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception;

    protected User getUser(HttpServletRequest request) {
        return request.getUserPrincipal() == null ? 
               null : 
               new User(request.getUserPrincipal().getName());
    }
}
