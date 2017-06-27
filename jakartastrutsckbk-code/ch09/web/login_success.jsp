<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 7 : Login</title>
</head>
<body bgcolor="white">
<h2>Login Success</h2>
  <html:messages message="true" id="msg">
    <c:out value="${msg}"/><br />
  </html:messages>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
