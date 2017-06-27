<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook Chapter 8 : Multilist Validation</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 8 : Multilist Validation</h2>
  <html:errors/>
  <html:form action="/ProcessMultilistTest">
    What languages do you know (choose two or more):<p/>
    <html:select multiple="true" property="languages">
        <html:option value="C++">C++</html:option>
        <html:option value="Java">Java</html:option>
        <html:option value="Perl">Perl</html:option>
        <html:option value="Python">Python</html:option>
        <html:option value="Visual Basic">Visual Basic</html:option>
    </html:select>
    <html:submit/>
  </html:form>
</body>
</html>
