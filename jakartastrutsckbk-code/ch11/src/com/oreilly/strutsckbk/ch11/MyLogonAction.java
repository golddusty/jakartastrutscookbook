package com.oreilly.strutsckbk.ch11;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.oreilly.servlet.Base64Encoder;

public final class MyLogonAction extends Action {

    public ActionForward execute( ActionMapping mapping, 
                                  ActionForm form,
                                  HttpServletRequest request, 
                                  HttpServletResponse response) 
            throws Exception {

        HttpSession session = request.getSession();

        ActionErrors errors = new ActionErrors();

        String username = (String) PropertyUtils.getSimpleProperty(form, "username");
        String password = (String) PropertyUtils.getSimpleProperty(form, "password");
        boolean rememberMe = ((Boolean) PropertyUtils.getSimpleProperty(form, "rememberMe")).booleanValue();

        // Call your security service here
        //SecurityService.authenticate(username, password);

        if (rememberMe) {
            saveCookies(response, username, password);
        } else {
            removeCookies(response);
        }
        
        session.setAttribute("username", username);

        return mapping.findForward("success");
    }
    
    private void saveCookies(HttpServletResponse response, String username, String password) {
        Cookie usernameCookie = new Cookie("StrutsCookbookUsername", Base64Encoder.encode(username));
        usernameCookie.setMaxAge(60 * 60 * 24 * 30); // 30 day expiration
        response.addCookie(usernameCookie);
        Cookie passwordCookie = new Cookie("StrutsCookbookPassword", Base64Encoder.encode(password));
        passwordCookie.setMaxAge(60 * 60 * 24 * 30); // 30 day expiration
        response.addCookie(passwordCookie);
    }
    private void removeCookies(HttpServletResponse response) {
        // expire the username cookie by setting maxAge to zero
        // (actual cookie value is irrelevant)
        Cookie unameCookie = new Cookie("StrutsCookbookUsername", "expired");
        unameCookie.setMaxAge(0);
        response.addCookie(unameCookie);

        // expire the password cookie by setting maxAge to zero
        // (actual cookie value is irrelevant)
        Cookie pwdCookie = new Cookie("StrutsCookbookPassword", "expired");
        pwdCookie.setMaxAge(0);
        response.addCookie(pwdCookie);
    }
}
