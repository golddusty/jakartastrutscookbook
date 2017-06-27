<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Forward Action Test</title>
</head>
<body bgcolor="white">
<h2>Forward Action Test</h2>
You have been sent here via the ForwardAction.
<br />
Inline: <c:out value="${param.inline}"/>
</body>
</html>
