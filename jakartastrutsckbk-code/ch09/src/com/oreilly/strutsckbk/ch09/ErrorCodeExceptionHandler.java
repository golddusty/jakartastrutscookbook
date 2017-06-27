package com.oreilly.strutsckbk.ch09;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

public class ErrorCodeExceptionHandler extends ExceptionHandler {

    public ActionForward execute(
            Exception ex,
            ExceptionConfig ae,
            ActionMapping mapping,
            ActionForm formInstance,
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException {
        
        if (!(ex instanceof ErrorCodeException)) {
            return super.execute(ex, ae, mapping, formInstance, request, response);
        }
        
        ErrorCodeException errCodeEx =(ErrorCodeException) ex;
        ActionForward forward = null;
        ActionMessage error = null;
        String property = null;

        // Build the forward from the exception mapping if it exists
        // or from the form input
        if (ae.getPath() != null) {
            forward = new ActionForward(ae.getPath());
        } else {
            forward = mapping.getInputForward();
        }

        ErrorCodeException ece =(ErrorCodeException) ex;
        String code = Integer.toString(ece.getCode());
        error = new ActionMessage(code, ece.getArgs());
        property = error.getKey();

        logException(ex);

        // Store the exception
        request.setAttribute(Globals.EXCEPTION_KEY, ex);
        storeException(request, property, error, forward, ae.getScope());

        return forward;
    }
}
