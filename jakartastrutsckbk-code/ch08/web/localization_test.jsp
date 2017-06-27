<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html:html>
<head>
  <title>Struts Cookbook - Chapter 8 : Localized Validation</title>
</head>
<body bgcolor="white">
<h2>Validation Test</h2>
  <html:errors/>
  <html:form action="/ProcessLocalizedValidationTest">
  	<bean:message key="prompt.ssn"/>: <html:text property="ssn"/><p />
  	<bean:message key="prompt.hourlyRate"/>: <html:text property="hourlyRate"/><p />
  	<html:submit/>
  </html:form>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html:html>
