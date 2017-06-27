<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 8 : Registration</title>
</head>
<body bgcolor="white">
<h2>New User Registration</h2>
  <html:errors/>
  <html:form action="/ProcessRegistration">
  	<bean:message key="prompt.emailAddress"/>: <html:text property="emailAddress"/><p />
  	<bean:message key="prompt.password"/>: <html:password property="password"/><p />
  	<bean:message key="prompt.password2"/>: <html:password property="password2"/><p/>
  	<html:submit/>
  </html:form>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
