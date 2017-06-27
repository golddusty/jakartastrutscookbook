<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
    <title>Rendering Data Loaded via the Digesting Plug-in</title>
</head>

<body>
    <h3>Canadian Provinces</h3>
    <table>
        <tr>
            <th>Province</th>
            <th>Capital</th>
            <th>Joined Confederation</th>
        </tr>
        <logic:iterate id="province" name="provinces">
            <tr>
                <td><bean:write name="province" property="name"/></td>
                <td><bean:write name="province" property="capital"/></td>
                <td><bean:write name="province" property="established"/></td>
            </tr>
        </logic:iterate>
    </table>    
</body>
</html>