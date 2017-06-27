<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
<title>Security Filter : Logon Page</title>
</head>

<body>
<form method="POST" action="j_security_check">
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
                <bean:message key="prompt.password"/>:
            </th>
            <td align="left">
                <input type="password" name="j_password" size="16" maxlength="18">
            </td>
        </tr>

        <tr>
            <th align="right">Remember me:
            </th>
            <td align="left">
                <input type="checkbox" name="j_rememberme" value="true">
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
