<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Dispatch Action Test</title>
</head>
<body bgcolor="white">
<h2>Dispatch Action Test</h2>
  <html:form method="get" action="/DispatchActionTest">
    Name:&nbsp;<html:text property="name"/>
    <input type="hidden" name="methodToCall">
    <SCRIPT>function set(target) {document.forms[0].methodToCall.value=target;}</SCRIPT>
    <p>
    <html:submit onclick="set('create');">New</html:submit> 
    <html:submit onclick="set('update');">Edit</html:submit> 
    <html:submit onclick="set('unknown');">Unknown</html:submit>
    <html:link href="javascript:set('touch');document.forms[0].submit();"><html:img border="0" srcKey="image.touch"/></html:link>
    </p>
  </html:form>
  <html:link page="/DispatchActionTest.do?methodToCall=delete">Remove</html:link>
  <hr />
  <c:if test="${not empty TestForm.map.name}">
    Name:&nbsp;<c:out value="${TestForm.map.name}"/><br />
    Dispatch Method:&nbsp;<b><c:out value="${dispatchedTo}"/></b>
  </c:if>
</body>
</html>
