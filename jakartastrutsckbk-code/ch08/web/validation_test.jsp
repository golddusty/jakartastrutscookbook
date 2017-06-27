<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 8 : Validation Test</title>
  <script language="Javascript1.1" src="staticJavascript.jsp"></script>
</head>
<body bgcolor="white">
<h2>Validation Test</h2>
  <html:errors/>
  <html:form action="/ProcessValidationTest">
  	<bean:message key="prompt.ssn"/>: <html:text property="ssn"/><p />
  	<bean:message key="prompt.married"/> <html:checkbox property="married"/><p />
  	<bean:message key="prompt.spouse.name"/>: <html:text property="spouseName"/><p/>
  	<bean:message key="prompt.city"/>: <html:text property="city"/><p/>
  	<bean:message key="prompt.state"/>: <html:text property="state"/><p/>
  	<bean:message key="prompt.zipCode"/>: <html:text property="zipCode"/><p/>
  	<bean:message key="prompt.webPage"/>: <html:text property="webPage"/><p/>
  	
  	Date (mm/dd/yyyy): <html:text property="date1"/><p />
  	Date (mm/dd/yyyy) (strict): <html:text property="date2"/><p />
  	My checkbox: <html:checkbox property="mychkbox"/><p />
  	My date (mm/dd/yyyy): <html:text property="mydate"/><p />
  	<html:submit/>
  </html:form>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
