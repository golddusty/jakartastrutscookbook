<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 9 : Security Problem</title>
</head>
<body bgcolor="white">
<h2>Security Exception</h2>
  <html:errors/>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
