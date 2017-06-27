package com.oreilly.strutsckbk.ch11;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.RequestProcessor;
import org.apache.struts.webapp.example.Constants;
import org.apache.struts.webapp.example.User;

public class CustomRequestProcessor1 extends RequestProcessor {

    protected boolean processPreprocess(HttpServletRequest request,
            HttpServletResponse response) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(Constants.USER_KEY);
        if (user == null) {
            try {
                response.sendError(403, "User not logged in");
            } catch (IOException e) {
                log.error("Unable to send response");
            }
            return false;
        }
        
        return true;
    }
}
