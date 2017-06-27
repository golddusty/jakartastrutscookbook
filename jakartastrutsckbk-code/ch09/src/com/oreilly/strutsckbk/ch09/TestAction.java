package com.oreilly.strutsckbk.ch09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestAction extends Action {

    public ActionForward execute(ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response)
             throws Exception {
        
        String foo = null;
        foo.toString();

        int errorCode = Integer.parseInt(request.getParameter("errorCode"));
        switch (errorCode) {
        case -1:
            throw new ErrorCodeException(errorCode, new Object[] {"6474-8484","wangdoodle"});
        case 100:
            throw new ErrorCodeException(errorCode, new Object[] {"gburdell"});
        case 110:
            throw new ErrorCodeException(errorCode, new Object[] {new Integer(75)});
        default:
            throw new ErrorCodeException(-99, new Object[]{}, "unknown error code");
        }
	}
}
