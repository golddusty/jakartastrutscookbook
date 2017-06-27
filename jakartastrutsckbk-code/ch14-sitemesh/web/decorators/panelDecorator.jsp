<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<decorator:head />
<div class="panelDiv">
    <span class="panelTitle"><decorator:title default="Unknown panel" /></span>
    <br/>
        <%--inserts the body of whatever we are decorating here --%>
    <decorator:body />    
</div>