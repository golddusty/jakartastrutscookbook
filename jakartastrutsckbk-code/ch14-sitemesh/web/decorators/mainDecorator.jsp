<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>
            <decorator:title default="{ Unknown Page - shouldn't see this, since pages should define title }" />
        </title>
        <html:base/>
        <link href="decorators/main.css" rel="stylesheet" type="text/css">
        <%--pulls the header from the page we are decorating and inserts it here --%>
        <decorator:head />
    </head>
        
    <body>
        <table width="100%" height="100%">
            <tr>
                <td id="header" colspan="2">
                   <bean:message key="label.header" />   
                </td>
            </tr>
            <tr>
                <td valign="top" width="20%">
                    <%-- grabs the navigation.jsp page and decorates with the panel decorator and puts it here --%>
                    <page:applyDecorator page="/WEB-INF/jsps/navigation.jsp" name="panel" />
                </td>
                <td>
                    <table width="100%" height="100%">
                        <tr>
                            <td id="pageTitle">
                                <div class="pageTitle">
                                    <%--pulls the title from the page we are decorating and inserts it here --%>
                                    <decorator:title />
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td valign="top" height="100%">
                                <%--pulls the body from the page we are decorating and inserts it here --%>
                                <decorator:body />
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td id="footer" colspan="2">
                    <bean:message key="label.footer" />
                </td>
            </tr>
        </table>
    </body>
</html>