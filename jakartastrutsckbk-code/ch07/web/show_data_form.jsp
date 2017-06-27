<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 7 : Token Test</title>
</head>
<body bgcolor="white">
<h2>Token Test</h2>
  <html:errors/>
  <html:form action="/SaveData">
  	<html:text property="name"/>
  	<html:submit/>
  </html:form>
  <html:link action="/SaveData" transaction="true">Save Data</html:link>
  <hr />
  <html:link forward="home">Home</html:link>
</body>
</html>
