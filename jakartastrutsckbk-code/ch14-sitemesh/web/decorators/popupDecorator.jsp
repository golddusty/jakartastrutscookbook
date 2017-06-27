<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
    <head>
        <title><decorator:title default="{ Unknown Page - shouldn't see this, since pages should define title }" /></title>
        <link href="<%= request.getContextPath() %>/decorators/main.css" rel="stylesheet" type="text/css">
        <%--pulls the header from the page we are decorating and inserts it here --%>
        <decorator:head />
    </head>
    
    <body>
        <div class="popupDiv">
            <span class="popupTitle"><decorator:title default="Unknown Title - shouldn't see this" /></span>
            <br/>
            <%--inserts the body of whatever we are decorating here --%>
            <decorator:body />    
        </div>
    </body>
</html>