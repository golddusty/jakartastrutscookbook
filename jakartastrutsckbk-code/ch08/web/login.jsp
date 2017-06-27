<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 8 : Login</title>
</head>
<body bgcolor="white">
<h2>Login</h2>
  <html:errors/>
  <html:form action="/Login">
  	<bean:message key="prompt.username"/>: <html:text property="username"/><p />
  	<bean:message key="prompt.password"/>: <html:password property="password"/>
  	<html:submit/>
  </html:form>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
