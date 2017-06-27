package com.oreilly.strutsckbk.ch06;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class MyDispatchAction extends DispatchAction {	
	public ActionForward create( ActionMapping mapping, 
			                          ActionForm form,
			                          HttpServletRequest request, 
																HttpServletResponse response) throws Exception {
		request.setAttribute("dispatchedTo","create");
		return mapping.findForward("success");
  }		
	public ActionForward update( ActionMapping mapping, 
      ActionForm form,
      HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		request.setAttribute("dispatchedTo","update");
		return mapping.findForward("success");
	}		
	public ActionForward delete( ActionMapping mapping, 
      ActionForm form,
      HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		request.setAttribute("dispatchedTo","delete");
		return mapping.findForward("success");
	}		
	public ActionForward touch( ActionMapping mapping, 
      ActionForm form,
      HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		request.setAttribute("dispatchedTo","touch");
		return mapping.findForward("success");
	}
}
