<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
  <html>
<head>
  <title>Struts Cookbook - Chapter 4 : Checkbox Test</title>
</head>
<body>
  <html:form method="get" action="/ProcessCheckbox">
    <input type="checkbox" name="foo_"
      onclick="javascript:elements['foo'].value=this.checked;"
      <logic:equal name="CheckboxForm" property="foo" value="true"> checked </logic:equal>
    >
    <html:hidden property="foo"/>
    <html:submit/>
  </html:form>
</body>
</html>
