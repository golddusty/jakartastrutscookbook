<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
    <head>
        <title><bean:message key="title.test"/></title>
    </head>
    <body>
        <h3>Test Page</h3>
        <p>This is another page rendered by Sitemesh.
           Here's a link back to the <html:link action="/main.do">main</html:link>
           page.</p>
        
    </body>
</html>