package com.oreilly.strutsckbk.ch07;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounter implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent event) {
        ServletContext ctx = event.getSession().getServletContext();
        Integer numSessions = (Integer) ctx.getAttribute("numSessions");
        if (numSessions == null) {
            numSessions = new Integer(1);
        }
        else {
            int count = numSessions.intValue();
            numSessions = new Integer(count + 1);
        }
        ctx.setAttribute("numSessions", numSessions);
    }
    public void sessionDestroyed(HttpSessionEvent event) {
        ServletContext ctx = event.getSession().getServletContext();
        Integer numSessions = (Integer) ctx.getAttribute("numSessions");
        if (numSessions == null) {
            numSessions = new Integer(0);
        }
        else {
            int count = numSessions.intValue();
            numSessions = new Integer(count - 1);
        }
        ctx.setAttribute("numSessions", numSessions);
    }
}
