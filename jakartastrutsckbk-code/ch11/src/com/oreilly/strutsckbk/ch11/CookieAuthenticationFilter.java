package com.oreilly.strutsckbk.ch11;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.webapp.example.Constants;
import org.apache.struts.webapp.example.User;
import org.apache.struts.webapp.example.UserDatabase;

/**
 * Filter which handles application authentication.  The filter implements
 * the following policy:
 * <ol>
 * <li>If the user is in the session the filter exits;
 * <li>If not, the authentication cookies are looked for;
 * <li>If found, the authentication is attempted
 * <li>If authentication is successful, the user is object is stored in the session
 * <li>Otherwise, the cookies are invalid and subsequently removed from the response
 * </ol>
 * 
 * @author Bill Siggelkow
 */
public class CookieAuthenticationFilter implements Filter {

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
        User user = (User) session.getAttribute(Constants.USER_KEY);
        if (log.isDebugEnabled()) log.debug("User in session:"+user);

        // if user is null get credentials from cookie; otherwise continue
        if (user == null) {
            boolean authentic = false;
            Credentials credentials = SecurityUtils.findCredentials(req);
            if (credentials != null) {
                SecurityService security = getSecurityService();
                try {
                    if (log.isDebugEnabled()) log.debug("Checking authentication");
                    user = security.authenticate(credentials);
                    session.setAttribute(Constants.USER_KEY, user);
                    authentic = true;
                }
                catch (Exception e) {
                    log.error("Unexpected authentication failure.", e);
                    SecurityUtils.removeCredentials(res);
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
  
    protected SecurityService getSecurityService() {
        ServletContext ctx = filterConfig.getServletContext();
        return new SecurityServiceImpl((UserDatabase)ctx.getAttribute(Constants.DATABASE_KEY));
    }
  
    public void destroy() {
        // Nothing necessary
    }

    private FilterConfig filterConfig;
    private static final Log log = LogFactory.getLog(CookieAuthenticationFilter.class);
}
