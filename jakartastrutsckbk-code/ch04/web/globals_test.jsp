<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/taglibs/unstandard-1.0" prefix="un" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : Accessing Constants</title>
</head>
<body>
  <p>
  Field name: ACTION_SERVLET_KEY<br />
  Field value: <bean:write name="Constants" 
                       property="strutsGlobals(ACTION_SERVLET_KEY)"/><br />
  </p>
  <p>
  Field name: SERVLET_KEY<br />
  Field value: <c:out value="${Constants.strutsGlobals.SERVLET_KEY}"/><br />
  </p>
</body>
</html>
