<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
   <html>
<head>
  <title>Struts Cookbook – Developer Poll</title>
</head>
<body>
   Favorite Language: <b><bean:write name="DevPollForm" property="language"/></b><br />
   Favorite IDE: <b><bean:write name="DevPollForm" property="ide"/></b>
</body>
</html>
