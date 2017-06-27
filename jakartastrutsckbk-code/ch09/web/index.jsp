<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook Chapter 9 Examples</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 9 Examples</h2>
  <p>
    <html:link page="/login.jsp">Login</html:link>
  </p>
  <p>
    <html:link page="/validating_login.jsp">Login with Custom Errors</html:link>
  </p>
  <p>
    <html:link page="/bad_page.jsp">Test JSP Exception</html:link>
  </p>
  <p>
    <html:link page="/LegacyServlet">Test Servlet Exception</html:link>
  </p>
  <p></p>
Test Error Codes
  <p>
    <html:link page="/TestErrorCode.do?errorCode=-1">-1</html:link>&nbsp;
    <html:link page="/TestErrorCode.do?errorCode=100">100</html:link>&nbsp;
    <html:link page="/TestErrorCode.do?errorCode=110">110</html:link>&nbsp;
  </p>
</body>
</html>
