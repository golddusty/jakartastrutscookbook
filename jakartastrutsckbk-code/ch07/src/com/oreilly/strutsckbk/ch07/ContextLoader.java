package com.oreilly.strutsckbk.ch07;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoader implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		event.getServletContext().setAttribute( "title",
                                                "Struts Cookbook Chapter 7");
	}
	public void contextDestroyed(ServletContextEvent event) {
		// clean up here
	}
}
