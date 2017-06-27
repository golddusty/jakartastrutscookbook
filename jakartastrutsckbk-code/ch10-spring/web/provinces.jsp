<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

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
                <td><bean:write name="province" propery="name"/></td>
                <td><bean:write name="province" propery="capital"/></td>
                <td><bean:write name="province" propery="established"/></td>
            </tr>
        </logic:iterate>
    </table>    
</body>
</html>