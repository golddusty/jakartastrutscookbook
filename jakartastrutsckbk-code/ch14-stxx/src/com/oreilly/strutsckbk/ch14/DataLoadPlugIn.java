package com.oreilly.strutsckbk.ch14;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

public class DataLoadPlugIn implements PlugIn {

    public void destroy() {
    }

    public void init(ActionServlet servlet, ModuleConfig config)
            throws ServletException {
        List users = new ArrayList();
        users.add(new User("George","Bailey","gbailey@bbl.com"));
        users.add(new User("Clarence","Oddbody","clarence@heaven.org"));
        users.add(new User("Sam","Wainwright","heehaw@bfplastics.com"));
        servlet.getServletContext().setAttribute("users",users);
    }

}
