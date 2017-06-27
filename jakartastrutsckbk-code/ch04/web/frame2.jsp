<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 04: Frame Test</title>
</head>
<body bgcolor="white">
<h2>Frame 2</h2>
  Send a message to frame 1!
  <html:form action="CallFrame1" target="_frame1">
    <html:text property="message"/>
    <html:submit/>
  </html:form>
  <c:forEach var="paramValue" items="${paramValues}">
    <br />
    Parameter: <c:out value="${paramValue.key}"/><br />
    Values:
    <c:forEach var="theValue" items="${paramValue.value}">
      <c:out value="${theValue}"/><br />
    </c:forEach>
  </c:forEach>  
</body>
</html>
