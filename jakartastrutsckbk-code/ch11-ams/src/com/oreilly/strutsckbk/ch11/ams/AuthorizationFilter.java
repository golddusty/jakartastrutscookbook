package com.oreilly.strutsckbk.ch11.ams;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;

public class AuthorizationFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        String roles = filterConfig.getInitParameter("roles");
        if (roles == null || "".equals(roles)) {
            roleNames = new String[0];
        } else {
            roles.trim();
            roleNames = roles.split("\\s*,\\s*");
        }
        onFailure = filterConfig.getInitParameter("onFailure");
        if (onFailure == null || "".equals(onFailure)) {
            onFailure = "/index.jsp";
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        ActionErrors errors = new ActionErrors();
        if (user != null) {
            boolean hasRole = false;
            for (int i = 0; i < roleNames.length; i++) {
                if (user.hasRole(roleNames[i])) {
                    hasRole = true;
                    break;
                }
            }
            if (!hasRole) {
                errors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage(
                        "error.authorization.required"));
            }
        }
        if (errors.isEmpty()) {
            chain.doFilter(request, response);
        } else {
            req.setAttribute(Globals.ERROR_KEY, errors);
            req.getRequestDispatcher(onFailure).forward(req, res);
        }
    }

    public void destroy() {
    }

    private String[] roleNames;

    private String onFailure;
}