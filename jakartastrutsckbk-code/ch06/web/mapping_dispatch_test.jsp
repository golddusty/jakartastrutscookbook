<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Mapping Dispatch Action Test</title>
</head>
<body bgcolor="white">
<h2>Mapping Dispatch Action Test</h2>
  <hr />
  <h3>Add Action</h3>
  <html:form method="get" action="/AddAction">
    Name:&nbsp;<html:text property="name"/>
    <p><html:submit/></p>
  </html:form>
  <p>
  Name:&nbsp;<c:out value="${AddForm.map.name}"/><br />
  Dispatch Method:&nbsp;<b><c:out value="${AddForm.map.dispatchedTo}"/></b>
  <hr />
  <h3>Change Action</h3>
  <html:form method="get" action="/ChangeAction">
    Name:&nbsp;<html:text property="name"/>
    <p><html:submit/></p>
  </html:form>
  <p>
  Name:&nbsp;<c:out value="${ChangeForm.map.name}"/><br />
  Dispatch Method:&nbsp;<b><c:out value="${ChangeForm.map.dispatchedTo}"/></b>
  <hr />
  <h3>Remove Action</h3>
  <html:link page="/RemoveAction.do?name=Test">Remove Me</html:link> 
  <p>
  Name:&nbsp;<c:out value="${RemoveForm.map.name}"/><br />
  Dispatch Method:&nbsp;<b><c:out value="${RemoveForm.map.dispatchedTo}"/></b>
</body>
</html>
