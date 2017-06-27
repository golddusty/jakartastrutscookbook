package com.oreilly.strutsckbk.ch04;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class ConstantsPlugin implements PlugIn {
	public void destroy() {
	}
	public void init(ActionServlet servlet, ModuleConfig module)
			throws ServletException {
		Constants constants = new Constants();
		servlet.getServletContext().setAttribute("Constants", constants);
	}
}
