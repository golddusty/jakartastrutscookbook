<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title><c:out value="${title}"/></title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 7 Examples</h2>
  <br />Sessions: <b><c:out value="${numSessions}" default="0"/></b>
  <br />Users: <b><c:out value="${numUsers}" default="0"/></b>
  <p>
    <html:link action="/LoadData">Token Test</html:link>
  </p>
  <p>
    <html:link page="/login.jsp">Login</html:link>
  </p>
  <p>
    <html:link page="/upload_test.jsp">Upload Test</html:link>
  </p>
  <p>
    <html:link action="/ViewStep1">Wizard Navigation Test</html:link>
  </p>
</body>
</html>
