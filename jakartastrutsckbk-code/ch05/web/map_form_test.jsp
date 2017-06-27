<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : Map-backed Form</title>
</head>
<body>
  <h2>Map Form Test</h2>
  <html:form action="/ProcessMapForm">
    Java Skill: 
      <html:select property="skill(java)">
        <html:options property="skillLevels"/>
      </html:select><br />
    JSP Skill: 
      <html:select property="skill(jsp)">
        <html:options property="skillLevels"/>
      </html:select><br />
    Struts Skill: 
      <html:select property="skill(struts)">
        <html:options property="skillLevels"/>
      </html:select><br />
    <html:submit/>
  </html:form>
  <hr />
  <c:if test="${not empty MapForm.skills}">
    Java Skill: <c:out value="${MapForm.skills.java}"/><br />
    JSP Skill: <c:out value="${MapForm.skills.jsp}"/><br />
    Struts Skill: <c:out value="${MapForm.skills.struts}"/><br />
  </c:if>
</body>
</html>
