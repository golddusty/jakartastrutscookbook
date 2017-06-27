<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
  <title>Struts Cookbook Chapter 10</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 10 Examples</h2>
  <p>
    <html:link page="/provinces.jsp">Provinces</html:link>
  </p>
  <p>
    <html:link action="/ViewUsers">View Users using RowSetDynaClass</html:link>
  </p>
  <p>
    <html:link action="/ViewMyUsers">View Users using iBATIS</html:link>
  </p>
  <p><bean:write name="APP_SERVICE_FACTORY"</p>
</body>
</html>
