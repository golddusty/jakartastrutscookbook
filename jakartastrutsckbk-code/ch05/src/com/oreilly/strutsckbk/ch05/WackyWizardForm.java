/*
 * Created on Jun 10, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;
import org.apache.struts.config.*;

/**
 * @author Bill Siggelkow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WackyWizardForm extends ActionForm {
	
	private int page;
  private String[] pageFormNames = new String[2];
	private ActionForm[] pageForms = new ActionForm[2];
	
	public WackyWizardForm() {
		pageFormNames[0] = "FirstPageForm";
		pageFormNames[1] = "SecondPageForm";
	}

	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		super.reset(mapping, request);
	  ModuleConfig mconfig = mapping.getModuleConfig();
		for (int i=0; i<pageFormNames.length; i++) {
			pageForms[i] = createActionForm(mconfig, pageFormNames[i]);
		}
	}

	public ActionErrors validate(ActionMapping mapping, 
			                    HttpServletRequest request) {
		ActionErrors errors = super.validate(mapping, request);
		for (int i=0; i<=page; i++) {
			errors.add( pageForms[i].validate(mapping, request) );
		}
		return errors;
	}
	
	private ActionForm createActionForm(ModuleConfig mconfig, String formName) {
	  FormBeanConfig fbconfig = mconfig.findFormBeanConfig(formName);
	  ActionForm form = null;
  	try {
		  if (fbconfig.getDynamic()) {
		  	DynaActionFormClass dafc = DynaActionFormClass.createDynaActionFormClass(fbconfig);
				form = (ActionForm) dafc.newInstance();
		  }
		  else {
		  	form = (ActionForm) Class.forName(fbconfig.getType()).newInstance();
		  }
  	}
  	catch (Exception e) {
  		e.printStackTrace();
  	}
	  return form;
	}
}
