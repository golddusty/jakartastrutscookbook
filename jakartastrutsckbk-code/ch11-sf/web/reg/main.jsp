<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<title>Registered Users Main Menu</title>
</head>
<h3>Welcome, <%= request.getRemoteUser() %></h3>
<html:link forward="logoff">Logoff</html:link>
</body>
</html>
