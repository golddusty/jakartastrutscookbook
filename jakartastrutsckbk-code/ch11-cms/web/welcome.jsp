<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
<title><bean:message key="logon.cma.title"/></title>
</head>

<body>
<h3>Welcome to the Chapter 11 Container-managed Security Example</h3>
<logic:present name="user">
  You are logged in as, <bean:write name="user" property="username"/>.
</logic:present> 
<html:link action="/reg/Main">Main Menu</html:link> (must be logged on)
</body>
</html>