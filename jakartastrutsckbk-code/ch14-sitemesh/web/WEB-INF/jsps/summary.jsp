<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
    <head>
        <title><bean:message key="title.summary"/></title>
    </head>
    <body>
         <h3>Summary</h3>
         <p>A summary page that could be displayed in a popup.</p>
         <p>Sitemesh knows how to take the body from a response
            and decorate with another JSP of your choosing.</p>
         <p>Here's a link back to the <html:link action="/main.do">main</html:link>
           page.</p>
    </body>
</html>