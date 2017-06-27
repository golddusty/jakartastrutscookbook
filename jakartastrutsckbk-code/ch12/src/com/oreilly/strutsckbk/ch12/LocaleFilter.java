package com.oreilly.strutsckbk.ch12;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import org.apache.struts.Globals;

public class LocaleFilter implements Filter {
    
    // the locale code used to create the locale (e.g. en_US)
    private String localeCode;
    
    // indicates if the locale should always be set;
    // even if there is currently one in the session
    private boolean ignore = false;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        localeCode = filterConfig.getInitParameter("locale");
        ignore = Boolean.valueOf(filterConfig.getInitParameter("ignore")).booleanValue();
    }
   
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                 throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        // create the session if needed
        HttpSession session = req.getSession();

        Locale currentLocale = (Locale) session.getAttribute(Globals.LOCALE_KEY);
        if (currentLocale == null || ignore) {
            // create the new locale
            Locale locale = new Locale(localeCode);

            // reset the Struts locale
            session.setAttribute(Globals.LOCALE_KEY, locale);
                
            // reset the JSTL locale
            Config.set(session, Config.FMT_LOCALE, locale);
        }
        chain.doFilter(request, response);
    }
    
    public void destroy() {
        // Nothing necessary
    }

    private FilterConfig filterConfig;
}
