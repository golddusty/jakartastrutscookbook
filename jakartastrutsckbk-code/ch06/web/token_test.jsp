<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Token Test</title>
</head>
<body bgcolor="white">
<h2>Token Test</h2>
  <html:form action="/SaveData">
  	<html:text property="name"/>
  	<html:submit/>
  </html:form>
  <html:link action="/SaveData" transaction="true">Save Data</html:link>
  <c:if test="${not empty TestForm.map.name}">
    Saved <c:out value="${TestForm.map.name}"/>.
  </c:if>
</body>
</html>
