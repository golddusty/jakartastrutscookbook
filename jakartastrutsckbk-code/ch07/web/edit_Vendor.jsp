<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 7 : Wildcard Mapping</title>
</head>
<body bgcolor="white">
  <html:errors/>
  <html:form action="/SaveVendor">
  	Vendor Name: <html:text property="name"/>
  	Tax ID: <html:text property="taxId"/>
  	<html:submit/>
  </html:form>
</body>
</html>
