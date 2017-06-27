package com.oreilly.strutsckbk.ch10;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.Action;

public class BaseAction extends Action {
    
    public SecurityService getSecurityService(HttpServletRequest request) {
        ServletContext ctx = request.getSession(true).getServletContext();
        ServiceFactory factory = (ServiceFactory) ctx.getAttribute("APP_SERVICE_FACTORY");
        return factory.createSecurityService();
    }
    
}
