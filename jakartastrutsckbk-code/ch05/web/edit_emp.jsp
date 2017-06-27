<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : Add Employee</title>
</head>
<body>
  <h2>Edit Employee</h2>
  <html:errors/>
  <script>
      function swapAction(control) {
        formAction = document.getElementById("empForm").action;
        if (control.checked)
          newAction = '<html:rewrite page="/CreateEmployee.do"/>';
        else
          newAction = '<html:rewrite page="/UpdateEmployee.do"/>';
        document.getElementById("empForm").action = newAction;
      }
  </script>
  <html:form styleId="empForm" action="/UpdateEmployee">
    New Employee: <html:checkbox property="create" 
      onclick='swapAction(this)"'/><br />
    Employee ID: <html:text property="employeeId"/><br />
    First Name: <html:text property="firstName"/><br />
    Last Name: <html:text property="lastName"/><br />
    Married? <html:checkbox property="married"/><br />
    Hired on Date: <html:text property="hireDateDisplay"/><br />
    Salary: <html:text property="salary"/><br />
    <html:submit/>
  </html:form>
</body>
</html>
