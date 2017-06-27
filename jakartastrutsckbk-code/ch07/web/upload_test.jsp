<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 7 : Upload Test</title>
</head>
<body>
  <html:form enctype="multipart/form-data" action="/ProcessUpload">
    <html:file property="content"/>
    <html:submit/>
  </html:form>
</body>
</html>
