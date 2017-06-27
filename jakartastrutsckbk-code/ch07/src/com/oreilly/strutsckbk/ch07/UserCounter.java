package com.oreilly.strutsckbk.ch07;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class UserCounter implements HttpSessionAttributeListener {

    public void attributeAdded(HttpSessionBindingEvent event) {
        if (attributeIsUser(event)) 
            adjustUserCounter(event.getSession().getServletContext(), true);
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {
        if (attributeIsUser(event)) 
            adjustUserCounter(event.getSession().getServletContext(), false);        
    }

    public void attributeReplaced(HttpSessionBindingEvent event) {
    }

    private boolean attributeIsUser(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();
        return "user".equals(name) && 
               value instanceof com.oreilly.strutsckbk.ch07.User;
    }

    private void adjustUserCounter(ServletContext ctx, boolean userAdded) {
        Integer counterObj = (Integer) ctx.getAttribute("numUsers");
        int counter = (counterObj == null ? 0 : counterObj.intValue());
        if (userAdded) {
          counter++;
        }
        else {
            if (counter > 0) counter--;
        }
        ctx.setAttribute("numUsers", new Integer(counter));
    }
}
