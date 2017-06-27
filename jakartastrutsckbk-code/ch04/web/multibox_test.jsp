<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
  <html>
<head>
  <title>Struts Cookbook - Chapter 4 : Checkbox Test</title>
</head>
<body>
  What scripting languages do you use?<br />
  Choose all that apply.
  <p>
  <html:form method="get" action="/ProcessMultibox">
    <logic:iterate id="lang" name="MultiboxForm" property="languages">
      <html:multibox property="chosenLanguages">
        <bean:write name="lang"/>
      </html:multibox>
      &nbsp;
      <bean:write name="lang"/><br />
    </logic:iterate>
    <html:submit/>
  </html:form>
  <hr />
  You have chosen:<br />
  <logic:notEmpty name="MultiboxForm" property="chosenLanguages">
  <logic:iterate id="lang" name="MultiboxForm" property="chosenLanguages">
    <bean:write name="lang"/><br />  
  </logic:iterate>
  </logic:notEmpty>
</body>
</html>
