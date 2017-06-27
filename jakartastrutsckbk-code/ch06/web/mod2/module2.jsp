<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Switch Action</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook - Chapter 6 : Module 2</h2>
  <h3><bean:message key="heading.welcome"/></h3>
  <p>
    <html:link page="/mod1/module1.jsp">Incorrect Link To Module 1</html:link>
  </p>
  <p>
    <html:link page="/SwitchModule.do?prefix=/mod1&page=/module1.jsp">Link To Module 1 using SwitchAction</html:link>
  </p>
  <p>
    <html:link page="/SwitchModule.do?prefix=&page=/default_module.jsp">Link To Default Module using SwitchAction</html:link>
  </p>
</body>
</html>
