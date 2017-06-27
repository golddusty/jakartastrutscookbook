package com.oreilly.strutsckbk.ch12;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/**
 * Implementation of <strong>Action</strong> that changes the user's
 * @link(java.util.Locale and forwards to a page, based on request level
 * parameters that are set  (language, country, variant, &amp; page).
 * Also changes the JSTL locale.
 */
public final class ChangeLocaleAction extends Action {

    private static final String SUCCESS = "success";
    
    /**
     * Commons Logging instance.
     */
    private Log log = LogFactory.getFactory().getInstance(this.getClass().getName());

    /**
     * <p>
     * Change the user's @link(java.util.Locale) based on @link(ActionForm)
     * properties.
     * </p>
     * <p>
     * This <code>Action</code> looks for <code>language</code> and
     * <code>country</code> and <code>variant</code> properties on the given
     * form, constructs an appropriate Locale object, and sets it as the Struts
     * Locale for this user's session as well as the JSTL locale.
     * Any <code>ActionForm, including a @link(DynaActionForm), may be used.
     * </p>
     * <p>
     * If a <code>page</code> property is also provided, then after
     * setting the Locale, control is forwarded to that URI path.
     * Otherwise, control is forwarded to "success".
     * </p>
     *
     * @param mapping The ActionMapping used to select this instance
     * @param form The optional ActionForm bean for this request (if any)
     * @param request The HTTP request we are processing
     * @param response The HTTP response we are creating
     *
     * @return Action to forward to
     * @exception java.lang.Exception if an input/output error or servlet exception occurs
     */
    public ActionForward execute(ActionMapping mapping,
                 ActionForm form,
                 HttpServletRequest request,
                 HttpServletResponse response)
    throws Exception {

        // Extract attributes we will need
        HttpSession session = request.getSession();
        Locale locale = getLocale(request);
    
        String language = null;
        String country = null;
        String variant = null;
        String page = null;
    
        try {
            language = (String) PropertyUtils.getSimpleProperty(form, "language");
            country = (String) PropertyUtils.getSimpleProperty(form, "country");
            variant = (String) PropertyUtils.getSimpleProperty(form, "variant");
            page = (String) PropertyUtils.getSimpleProperty(form, "page");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        boolean isLanguage = language != null && language.length() > 0;
        boolean isCountry  = country != null && country.length() > 0;
        boolean isVariant  = variant != null && variant.length() > 0;
        
        if ( isLanguage && isCountry && isVariant ) {
           locale = new java.util.Locale(language, country, variant);
        } else if ( isLanguage && isCountry ) {
            locale = new java.util.Locale(language, country);
        } else if ( isLanguage ) {
            locale = new java.util.Locale(language, "");
        }
    
        // reset the Struts locale
        session.setAttribute(Globals.LOCALE_KEY, locale);
            
        // reset the JSTL locale
        Config.set(session, Config.FMT_LOCALE, locale);
            
        if (null==page || "".equals(page))
            return mapping.findForward(SUCCESS);
        else
            return new ActionForward(page);
    }
}
