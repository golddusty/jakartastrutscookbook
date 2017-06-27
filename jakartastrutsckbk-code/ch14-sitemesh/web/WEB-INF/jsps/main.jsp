<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
    <head>
        <title><bean:message key="title.main"/></title>
    </head>
    <body>
        <h3>Jakarta Struts Cookbook Sitemesh Example</h3>
        This is the main page of the application. This page does
        not need to know anything about Sitemesh. In fact, this
        page gets constructed just like any other page of a Struts
        application. No special forwards are needed to 
        <html:link action="/test">link to another page</html:link>,
        no special syntax or changes to the <i>struts-config.xml</i>
        are needed. There is also another action in this site that displays
        <html:link action="/summary">summary information</html:link>.
    </body>
</html>