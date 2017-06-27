<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : Formdef</title>
</head>
<body>
  <h2>Edit Employee Using Formdef</h2>
  <html:form action="/SaveEmployeeFd">
    Employee ID <html:text property="employeeId"/><br />
    First Name: <html:text property="firstName"/><br />
    Last Name: <html:text property="lastName"/><br />
    Married? <html:checkbox property="married"/><br />
    Salary: <html:text property="salary"/><br />
    <html:submit/>
  </html:form>
</body>
</html>
