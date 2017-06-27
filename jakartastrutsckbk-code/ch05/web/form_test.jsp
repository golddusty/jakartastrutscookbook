<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : DynaForm Initial Values</title>
</head>
<body>
  <html:errors/>
  DynaForm Initial Values Test:
  <html:form action="/ProcessForm">
    First Name: <html:text property="firstName"/><br />
    Last Name: <html:text property="lastName"/><br />
    Are you a Java Developer? <html:checkbox property="javaCoder"/><br />
    Who are your 3 best friends:<br />
      Friend 1: <html:text property="friend[0]"/><br />
      Friend 2: <html:text property="friend[1]"/><br />
      Friend 3: <html:text property="friend[2]"/><br />
    <html:submit/>
  </html:form>
</body>
</html>
