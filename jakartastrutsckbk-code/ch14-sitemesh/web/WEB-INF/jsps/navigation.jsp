<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
    <head>
        <title><bean:message key="title.navigation"/></title>
        <script>
            function popUp( url ) {
               var windowFeatures = "scrollbars=yes,resizable=yes,width=300,height=300";
               popUp = window.open(url,"popup",windowFeatures);
               popUp.focus();    
            }
        </script>
    </head>
    <body>
        <br/>
        <c:url var="url" value="/main.do"/>
        <a href="<c:out value='${url}'/>">Main Page</a> 
        <br/><br/>
        <c:url var="url" value="/test.do"/>
        <a href="<c:out value='${url}'/>">Test Another Page</a> 
        <br/><br/>
        <c:url var="url" value="/summary.do"/>
        <a href="<c:out value='${url}'/>">Summary Example</a> 
        <br/><br/>
        <%-- Look at the ParameterDecoratorMapper definition in the sitemesh.xml,
        You will see how it takes a decorator parameter and can take a confirm parameter --%>
        <c:url var="url" value="/summary.do">
            <c:param name="decorator" value="popup"/>
            <c:param name="confirm" value="true"/>
        </c:url>
        <a href="javascript:popUp( '<c:out value='${url}'/>' );">Summary As PopUp</a> <br/><br/>
    </body>
</html>
    