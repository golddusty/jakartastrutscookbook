<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title><c:out value="${title}"/></title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 8 Examples</h2>
  <p>
    <html:link page="/login.jsp">Login</html:link>
  </p>
  <p>
    <html:link page="/registration.jsp">Registration</html:link>
  </p>
  <p>
    <html:link page="/validation_test.jsp">Validation Test</html:link>
  </p>
  <p>
    <html:link page="/localization_test.jsp">Localized Validation</html:link>
  </p>
  <p>
    <html:link action="/ViewStep1">Wizard Navigation Test</html:link>
  </p>
  <p>
    <html:link page="/multilist_test.jsp">Choose Two or More Test</html:link>
  </p>
  <p>
    <html:link page="/indexed_list_test.jsp">Indexed List Test</html:link>
  </p>
  <p>
    <html:link page="/indexed_list_test2.jsp">Indexed List Test (better)</html:link>
  </p>
</body>
</html>
