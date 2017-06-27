<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insert definition="mainLayoutDef2">
    <tiles:put name="title" type="string" value="Start Page (from tiles-def.xml)"/>
    <tiles:put name="body" value="/pages/pageStart.jsp"/>
</tiles:insert>
