<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
<head>
  <title>Test form</title>
</head>
<body>
<%--    
<html:form action="/ProcessTestForm" acceptCharset="UTF-8" enctype="application/x-www-form-urlencoded; charset=UTF-8">
--%>
    <html:form action="/ProcessTestForm">
        Field 1: <html:text property="field1"/><br />
        Field 2: <html:text property="field2"/><br />
        <%--Form File:<html:file property="formFile"/>--%>
        <html:submit/>
    </html:form>
</body>
</html:html>
