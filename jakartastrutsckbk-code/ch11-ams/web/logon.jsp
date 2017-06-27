<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
<title>Struts Cookbook - Logon</title>
</head>
<body>
<html:errors/>

<html:form action="/SubmitLogon" focus="username">
  <table border="0" width="100%">

  <tr>
    <th align="right">
      Username:
    </th>
    <td align="left">
      <html:text property="username" size="16" maxlength="18"/>
    </td>
  </tr>

  <tr>
    <th align="right">
      Password:
    </th>
    <td align="left">
      <html:password property="password" size="16" maxlength="18"/>
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
