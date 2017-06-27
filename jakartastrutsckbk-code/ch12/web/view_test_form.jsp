<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
<head>
  <title>View test form</title>
</head>
<body>
    Field 1: <bean:write name="TestForm" property="field1"/><br />
    Field 2: <bean:write name="TestForm" property="field2"/><br />
    <p></p>     
    <html:link page="/index.jsp">Return</html:link>
</body>
</html:html>
