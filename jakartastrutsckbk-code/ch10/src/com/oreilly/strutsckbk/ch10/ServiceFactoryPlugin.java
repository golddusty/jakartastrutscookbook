package com.oreilly.strutsckbk.ch10;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class ServiceFactoryPlugin implements PlugIn {

    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        ServiceFactory factory = new ServiceFactory();
        factory.setSecurityServiceImpl(securityService);
        servlet.getServletContext().setAttribute("APP_SERVICE_FACTORY", factory);
    }

    public void destroy() {
    }

    public void setSecurityService(String securityService) {
        this.securityService = securityService;
    }
    private String securityService;
}
