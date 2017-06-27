<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Switch Action</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook - Chapter 6 : Module 1</h2>
  <h3><bean:message key="heading.welcome"/></h3>
  <p>
    <html:link page="/mod2/module2.jsp">Incorrect Link To Module 2</html:link>
  </p>
  <p>
    <html:link page="/SwitchModule.do?prefix=/mod2&page=/module2.jsp">Link To Module 2 using SwitchAction</html:link>
  </p>
  <p>
    <html:link page="/SwitchModule.do?prefix=&page=/default_module.jsp">Link To Default Module using SwitchAction</html:link>
  </p>
  <p>
    <html:link forward="goToDefaultModule">Link To Default Module using Forward</html:link>
  </p>
  <p>
    <html:link forward="goToModule2Action">Link To Module 2 Action using Forward</html:link>
  </p>
  <p>
    <html:link forward="goToModule2">Link To Module 2 JSP using Forward</html:link>
  </p>
</body>
</html>
