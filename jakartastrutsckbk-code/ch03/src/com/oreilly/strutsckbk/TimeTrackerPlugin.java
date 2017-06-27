package com.oreilly.strutsckbk;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class TimeTrackerPlugin implements PlugIn {

	private String contextKey;
   
   public void setContextKey(String key) {
   	this.contextKey = key;
   }
   
   public void init(ActionServlet servlet, ModuleConfig conf)
         throws ServletException {
      servlet.getServletContext().setAttribute(contextKey, new TimeTracker());
   }

   public void destroy() {
	}
}
