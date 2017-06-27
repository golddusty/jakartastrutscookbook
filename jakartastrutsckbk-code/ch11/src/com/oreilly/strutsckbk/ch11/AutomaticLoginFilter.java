package com.oreilly.strutsckbk.ch11;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Filter which handles application authentication.  The filter implements
 * the following policy:
 * <ol>
 * <li>If the username is in the session the filter exits;
 * <li>If not, the authentication cookies are looked for;
 * <li>If found, the authentication is attempted
 * <li>If authentication is successful, the username is stored in the session
 * <li>Otherwise, the cookies are invalid and subsequently removed from the response
 * </ol>
 * 
 * @author Bill Siggelkow
 */
public class AutomaticLoginFilter implements Filter {

    private String onFailure = "logon.jsp";

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        onFailure = filterConfig.getInitParameter("onFailure");
    }
   
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                 throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        String contextPath = req.getContextPath();
        // if the requested page is the onFailure page continue
        // down the chain to avoid an infinite redirect loop        
        if (req.getServletPath().equals(onFailure)) {
            chain.doFilter(request, response);
            return;
        }
    
        HttpSession session = req.getSession(); // get the session or create it
        String username = (String) session.getAttribute("username");
        if (log.isDebugEnabled()) log.debug("User in session:"+username);

        // if user is null get credentials from cookie; otherwise continue
        if (username == null) {
            boolean authentic = false;
            username = findCookie(req, "StrutsCookbookUsername");
            String password = findCookie(req, "StrutsCookbookPassword");
            if (username != null && password != null) {
                try {
                    if (log.isDebugEnabled()) log.debug("Checking authentication");
                    // Call your security service here
                    //SecurityService.authenticate(username, password);
                    session.setAttribute("username", username);
                    authentic = true;
                }
                catch (Exception e) {
                    log.error("Unexpected authentication failure.", e);
                    clearCookie(res, "StrutsCookbookUsername");
                    clearCookie(res, "StrutsCookbookPassword");
                }
            }
    
            // if not authentic redirect to the logon page
            if (!authentic) {
                res.sendRedirect(contextPath+onFailure);
                //abort filter instead of chaining
                return;
            }
        }
        if (log.isDebugEnabled()) log.debug("Continuing filter chain ...");
        chain.doFilter(request, response);
    }
    
    public void destroy() {
        // Nothing necessary
    }

    private String findCookie(HttpServletRequest request, String cookieName) {
        Cookie[] cookies = request.getCookies();
        String value = null;
        if (cookies != null) {
            for (int i=0; i<cookies.length; i++) {
                if (cookies[i].getName().equals(cookieName)) {
                    value = cookies[i].getValue();
                }
            }
        }
        return value;
    }

    private void clearCookie(HttpServletResponse response, String cookieName) {
        // the cookie value does not matter
        Cookie cookie = new Cookie(cookieName, "expired");

        // setting maxAge to zero effectively removes the cookie
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    private FilterConfig filterConfig;
    private static final Log log = LogFactory.getLog(AutomaticLoginFilter.class);
}
