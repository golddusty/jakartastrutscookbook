package com.oreilly.strutsckbk.ch13;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.struts.action.*;

public class MyTestAction extends Action {

    /**
     * Commons Logging instance.
     */
    private Log log = LogFactory.getFactory().getInstance(MyTestAction.class);

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
    throws Exception {

        log.debug("Beginning of execute");
 
        try {
            // call some service
            // BusinessService.process();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    
        log.info("Forwarding to success");
        return mapping.findForward("success");
    }
}
