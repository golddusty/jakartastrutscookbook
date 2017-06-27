/*
 * Created on Aug 31, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.oreilly.strutsckbk.ch11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.RequestProcessor;

/**
 * @author Bill Siggelkow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CustomRequestProcessor extends RequestProcessor {

    protected boolean processRoles(HttpServletRequest request,
            HttpServletResponse response, ActionMapping mapping)
            throws IOException, ServletException {
        // Is this action protected by role requirements?
        String roles[] = mapping.getRoleNames();
        if ((roles == null) || (roles.length < 1)) {
            return (true);
        }

        // Check the current user against the list of required roles
        for (int i = 0; i < roles.length; i++) {
            if (request.isUserInRole(roles[i])) {
                if (log.isDebugEnabled()) {
                    log.debug(" User '" + request.getRemoteUser() +
                        "' has role '" + roles[i] + "', granting access");
                }
                return (true);
            }
        }

        // The current user is not authorized for this action
        if (log.isDebugEnabled()) {
            log.debug(" User '" + request.getRemoteUser() +
                      "' does not have any required role, denying access");
        }
        
        response.sendError(
            HttpServletResponse.SC_FORBIDDEN,
            getInternal().getMessage("notAuthorized", mapping.getPath()));
                                                    
        return (false);
    }
}
