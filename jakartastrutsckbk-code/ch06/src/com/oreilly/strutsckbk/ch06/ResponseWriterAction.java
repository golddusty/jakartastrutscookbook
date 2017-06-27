package com.oreilly.strutsckbk.ch06;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ResponseWriterAction extends Action {
	
	public ActionForward execute( ActionMapping mapping, 
			                          ActionForm form,
			                          HttpServletRequest request, 
																HttpServletResponse response) throws Exception {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><head></head><body>Hello World!</body></html>");				
		return null;
  }		

}
