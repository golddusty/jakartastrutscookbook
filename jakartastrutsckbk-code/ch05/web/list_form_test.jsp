<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : List-backed Form Property</title>
</head>
<body>
  <h2>List Form Test</h2>
  <html:form action="/ProcessListForm">
    Who are your 3 friends:<br />
      Friend 1: <html:text property="friend[0]"/><br />
      Friend 2: <html:text property="friend[1]"/><br />
      Friend 3: <html:text property="friend[2]"/><br />
    <html:submit/>
  </html:form>
  <hr />
  <c:forEach var="item" items="${ListForm.friends}">
    <c:out value="${item}"/><br />
  </c:forEach>
</body>
</html>
