package com.oreilly.strutsckbk.ch10;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ServiceFactory {

    private static Log log = LogFactory.getLog(ServiceFactory.class);
    
    public SecurityService createSecurityService() {
        SecurityService service = null;
        try {
            service = (SecurityService) Class.forName(securityServiceImpl).newInstance();
        } catch (Exception e) {
            log.error("Unable to create SecurityService for impl:"+securityServiceImpl);
        }
        return service;
    }

    protected void setSecurityServiceImpl(String securityServiceImpl) {
        this.securityServiceImpl = securityServiceImpl;
    }
    private String securityServiceImpl;
}
