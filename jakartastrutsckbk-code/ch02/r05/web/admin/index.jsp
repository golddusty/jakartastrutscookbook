<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html:html locale="true">
<head>
<title><bean:message key="index.title"/></title>
<html:base/>
</head>
<body bgcolor="white">
<h2>Struts Example Administrative Module</h2>

<p>
   <bean:message bundle="adminResources" key="msg.hello"/>
</p>
<html:link action="/admin/EditFavorites">Tell Us Your Favorites</html:link>

<jsp:useBean id="calendar" class="com.oreilly.strutsckbk.CalendarHolder"/>

<ul>
	<li><bean:write name="calendar" property="monthSet.month[0]"/></li>
	<li><bean:write name="calendar" property="monthSet.month[1]"/></li>
	<li><bean:write name="calendar" property="monthSet.month[2]"/></li>		
</ul>
<ol>
<logic:iterate id="month" name="calendar" property="monthSet.months">
	<li><bean:write name="month"/></li>
</logic:iterate>
</ol>

<ol>
<logic:iterate id="month" name="calendar" property="monthSet.months">
	<li><bean:write name="month" property="name.bytes[2]"/></li>
</logic:iterate>
</ol>

<c:forEach begin="0" end="5" varStatus="status">
	<c:out value="${calendar.monthSet.months[1]}"/>
</c:forEach>

	<img src="../struts-power.gif" alt="Powered by Struts"/>

</body>
</html:html>
