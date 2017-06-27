<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook Chapter 8 : Wizard Validation</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 8 : Wizard Validation</h2>
<h3>Wizard Step 2</h3>
  <html:errors/>
  <html:form action="/ProcessStep2">
    <html:hidden property="page" value="2"/>
    <bean:message key="prompt.username"/>:&nbsp;<bean:write name="WizardForm" property="username"/><br/>
    <bean:message key="prompt.password"/>:&nbsp;<html:password property="password"/>
    <p>
    <html:submit property="methodToCall"><bean:message key="button.previous"/></html:submit> 
    <html:submit property="methodToCall"><bean:message key="button.next"/></html:submit> 
    </p>
  </html:form>
</body>
</html>
