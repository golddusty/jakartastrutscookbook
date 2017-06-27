<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
<title>Administrator's Main Menu</title>
</head>

<body>
<h3>Administrative Page</h3>
  You are logged in as, <%= request.getRemoteUser() %>.
</body>
</html>