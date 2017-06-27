<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : View Employee</title>
</head>
<body>
  <h2>View Employee</h2>
    Employee ID: <bean:write name="employee" property="employeeId"/><br />
    First Name: <bean:write name="employee" property="firstName"/><br />
    Last Name: <bean:write name="employee" property="lastName"/><br />
    Married? <bean:write name="employee" property="married"/><br />
    Hired on Date: <bean:write name="employee" property="hireDate" format="MMMMM dd, yyyy"/><br />
    Salary: <bean:write name="employee" property="salary" format="$##0.00"/><br />
</body>
</html>
