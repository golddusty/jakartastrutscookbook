<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 7 : Token Test</title>
</head>
<body bgcolor="white">
<h2>Data Saved</h2>
Successfully saved <b><c:out value="${TestForm.map.name}"/></b>.
  <hr />
  <html:link forward="home">Home</html:link>
</body>
</html>
