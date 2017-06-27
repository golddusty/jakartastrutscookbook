<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : DynaForm Initial Values</title>
</head>
<body>
  <h2>Edit Employee</h2>
  <html:form action="/SaveValueObj">
    Username: <html:text property="firstName"/><br />
    First Name: <html:text property="firstName"/><br />
    Last Name: <html:text property="lastName"/><br />
    Salaried? <html:checkbox property="salaried"/><br />
    Start Date: <html:text property="startDate"/><br />
    <html:submit/>
  </html:form>
</body>
</html>
