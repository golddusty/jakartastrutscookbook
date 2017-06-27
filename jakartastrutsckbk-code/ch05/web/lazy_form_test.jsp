<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : Lazy Form</title>
</head>
<body>
  <h2>Lazy Form Test</h2>
  <html:form action="/ProcessLazyForm">
    What is your name:<br />
      First Name: <html:text property="firstName"/><br />
      Last Name: <html:text property="lastName"/><br />
    Who are your 3 friends:<br />
      Friend 1: <html:text property="friend[0].name"/><br />
      Friend 2: <html:text property="friend[1].name"/><br />
      Friend 3: <html:text property="friend[2].name"/><br />
    <html:submit/>
  </html:form>
  <hr />
  Your name is: <bean:write name="LazyForm" property="firstName"/>&nbsp;
                <bean:write name="LazyForm" property="lastName"/><br />
  Your friends are:<br />
  <bean:write name="LazyForm" property="friend[0].name"/><br />
  <bean:write name="LazyForm" property="friend[1].name"/><br />
  <bean:write name="LazyForm" property="friend[2].name"/><br />
</body>
</html>
