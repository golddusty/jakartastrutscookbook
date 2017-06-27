<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.oreilly.servlet.*" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html>
<head>
<title>Struts Cookbook - Cookie Logon</title>
</head>
<body>
<html:errors/>

<html:form action="/SubmitCookieLogon" focus="username">
  <bean:cookie id="uname" name="StrutsCookbookUsername" value=""/>
  <bean:cookie id="pword" name="StrutsCookbookPassword" value=""/>
  <table border="0" width="100%">

  <tr>
    <th align="right">
      <bean:message key="prompt.username"/>:
    </th>
    <td align="left">
      <html:text property="username" size="16" maxlength="18"
          value="<%=Base64Decoder.decode(uname.getValue())%>"/>
    </td>
  </tr>

  <tr>
    <th align="right">
      <bean:message key="prompt.password" bundle="alternate"/>:
    </th>
    <td align="left">
      <html:password property="password" size="16" maxlength="18"
                    redisplay="false" value="<%=Base64Decoder.decode(pword.getValue())%>"/>
    </td>
  </tr>

  <tr>
    <th align="right">
      <bean:message key="prompt.rememberMe"/>:
    </th>
    <td align="left">
      <html:checkbox property="rememberMe"/>
    </td>
  </tr>

  <tr>
    <td align="right">
      <html:submit property="Submit" value="Submit"/>
    </td>
    <td align="left">
      <html:reset/>
    </td>
  </tr>

</table>

</html:form>

</body>
</html>
