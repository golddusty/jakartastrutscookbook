<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<title><bean:message key="mainMenu.title"/></title>
</head>
<h3>Welcome, <bean:write name="user" property="username"/></h3>
<html:link forward="logoff">Logoff</html:link>
</body>
</html>
