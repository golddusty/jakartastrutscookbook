<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 10 : Using iBATIS</title>
</head>
<body>
  <h3>Using iBATIS</h3>
  <table border="2">
    <tr>
      <th>Username</th>
      <th>First Name</th>
      <th>Last Name</th>
    </tr>
    <logic:iterate id="user" name="users">
      <tr>
        <td>
          <bean:write name="user" property="username"/>
        </td>          
        <td>
          <bean:write name="user" property="firstName"/>
        </td>          
        <td>
          <bean:write name="user" property="lastName"/>
        </td>          
      </tr>
    </logic:iterate>
  </table>
</body>
</html>
