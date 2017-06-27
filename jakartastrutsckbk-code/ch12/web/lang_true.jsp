<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<html:html lang="true">
<head>
  <title><bean:message key="index.welcome"/></title>
</head>
<body>
<h2>This page uses the &lt;html:html lang=true&gt; tag.</h2>
<h3>Your session locale is <c:out value="${sessionScope['org.apache.struts.action.LOCALE']}"/></h3>
<h3>Using bean:message - <bean:message key="index.welcome"/></h3>
<h4>Using fmt:message - <fmt:message key="index.welcome"/> from JSTL</h4>
    
<h3><bean:message key="index.welcome"/></h3>
<h4><fmt:message key="index.welcome"/> from JSTL</h4>

<html:link action="/ChangeLocale?language=en">English</html:link><p>
<html:link action="/ChangeLocale?language=ru">Russian</html:link><p>
<html:link action="/ChangeLocale?language=en&country=US&variant=RN">Southeastern US</html:link>
</body>
</html:html>
