<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title><c:out value="${title}"/></title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 7 Examples</h2>
<h3>Wizard Step 3</h3>
  Received Data: <c:out value="${WizardForm.map.data}"/>
  <html:form action="/ProcessStep3">
    Data:&nbsp;<html:text property="data"/>
    <p>
    <html:submit property="methodToCall"><bean:message key="button.previous"/></html:submit> 
    <html:submit property="methodToCall"><bean:message key="button.finish"/></html:submit> 
    </p>
  </html:form>
</body>
</html>
