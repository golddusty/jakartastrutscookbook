package com.oreilly.strutsckbk.ch11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.RequestProcessor;
import org.apache.struts.webapp.example.Constants;
import org.apache.struts.webapp.example.User;

public class CustomRequestProcessor2 extends RequestProcessor {

    protected ActionForward processActionPerform(HttpServletRequest request,
            HttpServletResponse response, Action action, ActionForm form,
            ActionMapping mapping) throws IOException, ServletException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(Constants.USER_KEY);
        if (user == null) {
            return mapping.findForward("logon");
        } else {
            return super.processActionPerform(request, response, action, form,
                    mapping);            
        }
    }
}
