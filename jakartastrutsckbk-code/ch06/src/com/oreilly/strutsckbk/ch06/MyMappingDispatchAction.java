package com.oreilly.strutsckbk.ch06;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

public class MyMappingDispatchAction extends MappingDispatchAction {	

	public ActionForward create( ActionMapping mapping, 
			                          ActionForm form,
			                          HttpServletRequest request, 
																HttpServletResponse response) throws Exception {
		PropertyUtils.setSimpleProperty(form, "dispatchedTo", "create");
		return mapping.findForward("success");
  }		
	public ActionForward update( ActionMapping mapping, 
      ActionForm form,
      HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		PropertyUtils.setSimpleProperty(form, "dispatchedTo", "update");
		return mapping.findForward("success");
	}		
	public ActionForward delete( ActionMapping mapping, 
      ActionForm form,
      HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		PropertyUtils.setSimpleProperty(form, "dispatchedTo", "delete");
		return mapping.findForward("success");
	}
}
