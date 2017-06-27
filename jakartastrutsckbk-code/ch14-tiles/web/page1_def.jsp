<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<jsp:include page="/layouts/mainLayoutDef.jsp"/>
<tiles:insert beanName="mainLayoutDef" beanScope="application">
    <tiles:put name="title" type="string" value="Page One"/>
    <tiles:put name="body" value="/pages/pageOne.jsp"/>
</tiles:insert>
