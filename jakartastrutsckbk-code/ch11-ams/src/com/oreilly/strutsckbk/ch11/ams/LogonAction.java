package com.oreilly.strutsckbk.ch11.ams;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class LogonAction extends Action {

    public ActionForward execute( ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response) 
            throws Exception {

        HttpSession session = request.getSession();

        ActionErrors errors = new ActionErrors();

        String username = (String) PropertyUtils.getSimpleProperty(form, "username");
        String password = (String) PropertyUtils.getSimpleProperty(form, "password");

        User user = new User(username);
        
        session.setAttribute("user", user);

        return mapping.findForward("success");
    }
}
