package com.oreilly.strutsckbk.ch11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.webapp.example.User;

public class TestSecureAction extends SecureAction {

    public ActionForward doExecute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response, User user)
            throws Exception {
        // do real work here
        
        return mapping.findForward("success");
    }

}
