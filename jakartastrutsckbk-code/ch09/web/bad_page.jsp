<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 9 : Invalid JSP</title>
</head>
<body>
    <% String bar = null; bar.toString();%>
    <bean:write name="bar"/>
</body>
</html>
