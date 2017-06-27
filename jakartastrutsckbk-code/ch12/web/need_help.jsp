<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
<head>
  <title>Ask for Help</title>
</head>
<body>
    <p align="center">
        <bean:message key="prompt.help"/>
    </p>
    <p align="center">
        <a href="javascript:close()">
            <html:img border="0" srcKey="img.yes.src" titleKey="img.yes.title"/>
        </a>
        &nbsp;
        <a href="javascript:close()">
            <html:img border="0" srcKey="img.no.src" titleKey="img.no.title"/>
        </a>
    </p>
</body>
</html:html>
