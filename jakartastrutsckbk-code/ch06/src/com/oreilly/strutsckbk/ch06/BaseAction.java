package com.oreilly.strutsckbk.ch06;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class BaseAction extends Action {
	
	public ActionForward execute( ActionMapping mapping, 
			                          ActionForm form,
			                          HttpServletRequest request, 
																HttpServletResponse response) throws Exception {
		executeBefore();

		// call the abstract method
		ActionForward forward = executeAction( mapping, form, request, response );

		executeAfter();

		return forward;
  }		

	protected abstract ActionForward executeAction( ActionMapping mapping, 
                                                     ActionForm form,
                                             HttpServletRequest request, 
			                                      HttpServletResponse response) throws Exception;
	private void executeBefore() {
	}

	private void executeAfter() {
	}
}
