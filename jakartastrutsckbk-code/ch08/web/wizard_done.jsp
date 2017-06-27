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
<bean:message key="prompt.username"/>: <b><bean:write name="WizardForm" property="username"/></b><br />
<bean:message key="prompt.password"/>: <b><bean:write name="WizardForm" property="password"/></b><br />
<bean:message key="prompt.ssn"/>: <b><bean:write name="WizardForm" property="ssn"/></b><br />
<h3>Wizard Done!</h3>
</body>
</html>
