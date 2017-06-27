package com.oreilly.strutsckbk;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;

public final class GetIdeOptionsAction extends Action {

    public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
	throws Exception {
    	MyForm myForm = (MyForm) form;
    	String language = myForm.getLanguage();
    	ArrayList ides = new ArrayList();
    	if (language.equals("Java")) {
    		ides.add(new LabelValueBean("Net Beans","Net Beans"));
    		ides.add(new LabelValueBean("Eclipse", "Eclipse"));
    		ides.add(new LabelValueBean("jEdit", "jEdit"));    		
    	}
    	else if (language.equals("C-Sharp")) {
    		ides.add(new LabelValueBean("Sharp Develop", "Sharp Develop"));
    		ides.add(new LabelValueBean("Visual Studio", "Visual Studio"));
    	}
      myForm.setIdes( ides );

    	// Forward control to the specified success URI
    	return (mapping.findForward("success"));
    }
}
