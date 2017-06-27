<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Lookup Dispatch Action Test</title>
</head>
<body bgcolor="white">
<h2>Lookup Dispatch Action Test</h2>
  <html:form method="get" action="/LookupDispatchActionTest">
    Name:&nbsp;<html:text property="name"/>
    <p>
    <html:submit property="methodToCall"><bean:message key="button.add"/></html:submit> 
    <html:submit property="methodToCall"><bean:message key="button.edit"/></html:submit> 
    <html:submit property="methodToCall"><bean:message key="button.remove"/></html:submit>     
    </p>
  </html:form>
  <hr />
  <c:if test="${not empty TestForm.map.name}">
    Name:&nbsp;<c:out value="${TestForm.map.name}"/><br />
    Dispatch Method:&nbsp;<b><c:out value="${dispatchedTo}"/></b>
  </c:if>
</body>
</html>
