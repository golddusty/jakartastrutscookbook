<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
  <title>Struts – JavaScript Example</title>
</head>
<body>   You have selected <bean:write name="MyForm" property="language"/> as 
   your favorite programming language, and <bean:write name="MyForm" property="ide"/> as your 
   favorite development tool.
</body>
</html>
