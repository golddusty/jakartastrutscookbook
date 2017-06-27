<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<logic:notPresent name="mainLayoutDef" scope="application">
    <tiles:definition id="mainLayoutDef" 
                    page="/layouts/mainLayout.jsp" 
                   scope="application">
        <tiles:put name="header" value="/common/header.jsp"/>
        <tiles:put name="navbar" value="/common/navbar.jsp"/>
        <tiles:put name="news"   value="/common/news.html"/>
        <tiles:put name="footer" value="/common/footer.jsp"/>        
    </tiles:definition>
</logic:notPresent>
