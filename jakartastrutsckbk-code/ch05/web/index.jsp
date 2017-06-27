<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 04</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 5 Examples</h2>
  <p>
    <html:link page="/form_test.jsp">DynaForm Initial Values Test</html:link>
  </p>
  <p>
    <html:link page="/list_form_test.jsp">List-backed Form Test</html:link>
  </p>
  <p>
    <html:link page="/map_form_test.jsp">Map-backed Form Test</html:link>
  </p>
  <p>
    <html:link page="/lazy_form_test.jsp">Lazy Form Test</html:link>
  </p>
  <p>
    <html:link action="/ViewUsers">Row Set Test</html:link>
  </p>
  <p>
    <html:link page="/edit_emp.jsp">Edit Employee</html:link>
  </p>
  <p>
    <html:link page="/new_emp_fd.jsp">New Employee using <i>Formdef</i></html:link>
  </p>
</body>
</html>
