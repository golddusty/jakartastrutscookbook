<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
<head>
  <title>Change language</title>
</head>
<body>
<html:form action="/ChangeLocale">
    <html:select property="language">
        <html:option value="en">English</html:option>
        <html:option value="fr">French</html:option>
        <html:option value="ru">Russian</html:option>
        <html:option value="es">Spanish</html:option>
    </html:select>
    <html:hidden property="page" value="/Welcome.do"/>
    <html:submit/>
</html:form>
</body>
</html:html>
