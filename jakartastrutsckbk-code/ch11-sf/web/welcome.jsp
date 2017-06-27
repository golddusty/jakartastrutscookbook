<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
<title>Struts Cookbook Chapter 11 : Security Filter</title>
</head>

<body>
<h3>Welcome to Struts Cookbook Chapter 11 : Security Filter</h3>
  You are logged in as, <%= request.getRemoteUser() %>.
<html:link action="/reg/Main">Main Menu</html:link> (must be logged on)
</body>
</html>