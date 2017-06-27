package com.oreilly.strutsckbk.ch09;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;
import org.apache.struts.util.MessageResources;

public class CustomExceptionHandler extends ExceptionHandler {

    public ActionForward execute(Exception ex, ExceptionConfig ae,
            ActionMapping mapping, ActionForm formInstance,
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        // TODO Add custom code here to completely control handling
        return super.execute(ex, ae, mapping, formInstance, request, response);
    }
    protected void logException(Exception e) {
        // TODO Add custom code here for exception logging
        System.out.println("Customized logException for:"+e);
        super.logException(e);
    }
    protected void storeException(HttpServletRequest request, String property,
            ActionMessage error, ActionForward forward, String scope) {
        MessageResources msgRes = MessageResources.getMessageResources("ApplicationResources");
        String msg = msgRes.getMessage(error.getKey());
        saveMessage(msg);
        super.storeException(request, property, error, forward, scope);
    }

    private void saveMessage(String msg) {
        // store error message in database ...
    }
}
