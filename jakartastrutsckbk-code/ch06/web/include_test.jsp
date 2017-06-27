<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6 : Include Action Test</title>
</head>
<body bgcolor="white">
<h2>Include Action Test</h2>
  <i>Begin included content...</i>
  <blockquote>
    <jsp:include page="/IncludeContent.do"/>    
  </blockquote>
  <i>End included content</i>
</body>
</html>
