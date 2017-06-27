/*
 * $Header: /home/cvs/jakarta-struts/src/example/org/apache/struts/webapp/example/LinkSubscriptionTag.java,v 1.9 2004/03/14 06:23:44 sraeburn Exp $
 * $Revision: 1.9 $
 * $Date: 2004/03/14 06:23:44 $
 *
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.struts.webapp.example;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.config.ModuleConfig;
import org.apache.struts.taglib.TagUtils;
import org.apache.struts.util.MessageResources;


/**
 * Generate a URL-encoded hyperlink to the specified URI, with
 * associated query parameters selecting a specified Subscription.
 *
 * @version $Revision: 1.9 $ $Date: 2004/03/14 06:23:44 $
 */

public class LinkSubscriptionTag extends TagSupport {


    // ----------------------------------------------------- Instance Variables


    /**
     * The context-relative URI.
     */
    protected String page = null;


    /**
     * The message resources for this package.
     */
    protected static MessageResources messages =
	MessageResources.getMessageResources
	("org.apache.struts.webapp.example.ApplicationResources");


    /**
     * The attribute name.
     */
    private String name = "subscription";


    // ------------------------------------------------------------- Properties


    /**
     * Return the context-relative URI.
     */
    public String getPage() {

	return (this.page);

    }


    /**
     * Set the context-relative URI.
     *
     * @param page Set the context-relative URI
     */
    public void setPage(String page) {

	this.page = page;

    }


    /**
     * Return the attribute name.
     */
    public String getName() {

	return (this.name);

    }


    /**
     * Set the attribute name.
     *
     * @param name The new attribute name
     */
    public void setName(String name) {

	this.name = name;

    }


    // --------------------------------------------------------- Public Methods


    /**
     * Render the beginning of the hyperlink.
     *
     * @exception JspException if a JSP exception has occurred
     */
    public int doStartTag() throws JspException {

	// Generate the URL to be encoded
        ModuleConfig config = (ModuleConfig) pageContext.getRequest()
            .getAttribute(org.apache.struts.Globals.MODULE_KEY);
        HttpServletRequest request =
          (HttpServletRequest) pageContext.getRequest();
        StringBuffer url = new StringBuffer(request.getContextPath());
	url.append(config.getPrefix());
        url.append(page);
	Subscription subscription = null;
	try {
	    subscription = (Subscription) pageContext.findAttribute(name);
        } catch (ClassCastException e) {
	    subscription = null;
	}
	if (subscription == null)
	    throw new JspException
	        (messages.getMessage("linkSubscription.noSubscription", name));
	if (page.indexOf("?") < 0)
	    url.append("?");
	else
	    url.append("&");
	url.append("username=");
	url.append(TagUtils.getInstance().filter(subscription.getUser().getUsername()));
	url.append("&host=");
	url.append(TagUtils.getInstance().filter(subscription.getHost()));

	// Generate the hyperlink start element
	HttpServletResponse response =
	  (HttpServletResponse) pageContext.getResponse();
	StringBuffer results = new StringBuffer("<a href=\"");
	results.append(response.encodeURL(url.toString()));
	results.append("\">");

	// Print this element to our output writer
	JspWriter writer = pageContext.getOut();
	try {
	    writer.print(results.toString());
	} catch (IOException e) {
	    throw new JspException
		(messages.getMessage("linkSubscription.io", e.toString()));
	}

	// Evaluate the body of this tag
	return (EVAL_BODY_INCLUDE);

    }



    /**
     * Render the end of the hyperlink.
     *
     * @exception JspException if a JSP exception has occurred
     */
    public int doEndTag() throws JspException {


	// Print the ending element to our output writer
	JspWriter writer = pageContext.getOut();
	try {
	    writer.print("</a>");
	} catch (IOException e) {
	    throw new JspException
	        (messages.getMessage("link.io", e.toString()));
	}

	return (EVAL_PAGE);

    }


    /**
     * Release any acquired resources.
     */
    public void release() {

        super.release();
        this.page = null;
        this.name = "subscription";

    }


}
