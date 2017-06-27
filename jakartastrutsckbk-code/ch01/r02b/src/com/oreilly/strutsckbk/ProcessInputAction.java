package com.oreilly.strutsckbk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public final class ProcessInputAction extends Action {
   public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
	      throws Exception {
      ValueHolder bean = new ValueHolder();
      bean.setValue1( Integer.parseInt(request.getParameter("value1")) );
      bean.setValue2( Integer.parseInt(request.getParameter("value2")) );
      request.setAttribute( "valueHolder", bean );
   	return (mapping.findForward("success"));
   }
}
