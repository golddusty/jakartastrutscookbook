<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 04: Frame Test</title>
</head>
<body bgcolor="white">
<h2>Frame 1</h2>
  <html:link href="frame2.jsp?calledBy=FRAME_1">Call Frame2</html:link>
  <p>
  Message received:&nbsp;
  <c:out value="${FrameForm.map.message}"/>
</body>
</html>
