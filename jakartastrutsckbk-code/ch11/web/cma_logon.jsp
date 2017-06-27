<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html>
<head>
<title><bean:message key="logon.cma.title"/></title>
</head>

<body>
<form action="/j_security_check" focus="j_username">
    <table border="0" width="100%">
        <tr>
            <th align="right">
                <bean:message key="prompt.username"/>:
            </th>
            <td align="left">
                <input type="text" name="j_username" size="16" maxlength="18">
            </td>
        </tr>

        <tr>
            <th align="right">
                <bean:message key="prompt.password" bundle="alternate"/>:
            </th>
            <td align="left">
                <input type="password" name="j_password" size="16" maxlength="18">
            </td>
        </tr>

        <tr>
            <td align="right">
                <input type="submit" value="Submit">
            </td>
            <td align="left">
                <input type="reset">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
