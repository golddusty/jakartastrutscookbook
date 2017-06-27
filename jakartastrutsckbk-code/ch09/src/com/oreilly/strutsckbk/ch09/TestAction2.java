package com.oreilly.strutsckbk.ch09;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestAction2 extends Action {

    public ActionForward execute(ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response)
             throws Exception {

        try {
            callService();
        } catch (ErrorCodeException ece) {
            switch (ece.getCode()) {
                case -1:
                    return mapping.findForward("somewhere.jsp");
                case 100:
                    // do something
                case 110:
                    // do something else
            }
            throw ece;
        }
        return mapping.findForward("success");
	}
    private void callService() throws ErrorCodeException {
        
    }
}
