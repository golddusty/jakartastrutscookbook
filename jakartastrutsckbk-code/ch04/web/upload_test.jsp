<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
  <html>
<head>
  <title>Struts Cookbook - Chapter 4 : Upload Test</title>
</head>
<body>
  <html:form enctype="multipart/form-data" action="/ProcessUpload">
    <html:file property="content"/>
    <html:submit/>
  </html:form>
</body>
</html>
