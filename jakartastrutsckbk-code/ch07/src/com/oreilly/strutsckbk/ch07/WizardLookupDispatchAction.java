package com.oreilly.strutsckbk.ch07;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

public class WizardLookupDispatchAction extends LookupDispatchAction {	

	public WizardLookupDispatchAction() {
		keyMethodMap = new HashMap();
		keyMethodMap.put("button.previous", "doPrevious");
		keyMethodMap.put("button.next", "doNext");
		keyMethodMap.put("button.finish", "doFinish");
	}
	
	public ActionForward doPrevious( ActionMapping mapping, 
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
        processPrevious(mapping, form, request, response);
        return mapping.findForward("previous");
	}		

    protected void processPrevious( ActionMapping mapping, 
            ActionForm form,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
    }       
    
    public ActionForward doNext( ActionMapping mapping, 
            ActionForm form,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
       processNext(mapping, form, request, response);
       return mapping.findForward("next");
	}       

    protected void processNext( ActionMapping mapping, 
            ActionForm form,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
    }       

    public ActionForward doFinish( ActionMapping mapping, 
           ActionForm form,
           HttpServletRequest request, 
           HttpServletResponse response) throws Exception {
      processFinish(mapping, form, request, response);
      return mapping.findForward("finish");
	}        

    protected void processFinish( ActionMapping mapping, 
            ActionForm form,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
    }

    protected Map getKeyMethodMap() {
	    return keyMethodMap;
	}		
}
