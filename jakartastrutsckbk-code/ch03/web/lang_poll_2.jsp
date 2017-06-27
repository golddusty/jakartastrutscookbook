<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
   <html>
<head>
  <title>Struts Cookbook – Developer Poll</title>
</head>
<body>
   Favorite Language: <b><c:out value="${DevPollForm.language}"/></b>
   <html:form action="ProcessIdeChoice">
      What's your favorite IDE?
      <p>
      <c:forEach var="langIde"
               items="${languageChoices.languageIdeMap[DevPollForm.map.language]}">
         <html:radio property="ide" idName="langIde" value="value"/>
         &nbsp;<c:out value="${langIde.label}"/><br />
      </c:forEach>
      </p>
      <html:submit value="Next >>"/>
  </html:form>
  
</body>
</html>
