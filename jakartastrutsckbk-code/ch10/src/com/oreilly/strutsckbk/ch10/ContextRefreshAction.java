/*
 * Created on Aug 23, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.oreilly.strutsckbk.ch10;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author Bill Siggelkow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ContextRefreshAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String name = request.getParameter("name");
        ServletContext ctx = servlet.getServletContext();
        if (name != null && !"".equals(name)) {
            refreshObject(name, ctx);
        }
        else {
            Enumeration names = ctx.getAttributeNames();
            while (names.hasMoreElements()) {
                name = (String) names.nextElement();
                refreshObject(name, ctx);
            }
        }
        return mapping.findForward("success");
    }
    
    private void refreshObject(String name, ServletContext ctx) 
            throws CacheException {
        Object obj = ctx.getAttribute(name);
        if (obj != null && obj instanceof Refreshable) {
            ((Refreshable) obj).refresh();            
        }
    }
}
