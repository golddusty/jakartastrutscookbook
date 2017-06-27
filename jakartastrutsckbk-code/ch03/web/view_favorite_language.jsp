<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
  <title>Struts – JavaScript Example</title>
</head>
<body>   You have selected <bean:write name="MyForm" property="language"/> as 
   your favorite programming language, and <bean:write name="MyForm" property="ide"/> as your 
   favorite development tool.
   <p>Your reason for liking it is:</p>
   <div><blockquote><bean:write name="MyForm" property="reason" filter="false"/></blockquote></pre>
   Thank you for playing ... would you like to <html:link action="/FavoriteLanguage2">play again</html:link>?
</body>
</html>
