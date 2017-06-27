<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/taglibs/unstandard-1.0" prefix="un" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : Using Bind</title>
</head>
<body>
  <un:bind var="servletKey"
          type="org.apache.struts.Globals"
         field="SERVLET_KEY"/>
  <p>
  Field name: SERVLET_KEY<br />
  Field value: <bean:write name="servletKey"/>< br />
  Attribute Value: <c:out value="${applicationScope[servletKey]}"/>< br />
  </p>
</body>
</html>
