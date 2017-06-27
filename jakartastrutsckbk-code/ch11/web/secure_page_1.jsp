<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/app" prefix="app" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<html>
<head>
<title>Secure Page 1</title>
<link rel="stylesheet" type="text/css" href="base.css" />
</head>
<h3>Welcome, <bean:write name="user" property="fullName" /></h3>
You should only have been able to get to this page if you are logged  in.
</body>
</html>
