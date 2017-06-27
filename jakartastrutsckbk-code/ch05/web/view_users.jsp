<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.apache.commons.beanutils.*" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 5 : Viewing Row Sets</title>
</head>
<body>
  <h2>Viewing Row Sets</h2>
  <bean:define id="cols" name="rowSet" property="dynaProperties"/>
  <table border="2">
    <tr>
      <logic:iterate id="col" name="cols">
        <th><bean:write name="col" property="name"/></th>
      </logic:iterate>
    </tr>
    <logic:iterate id="row" name="rowSet" property="rows">
      <tr>
        <logic:iterate id="col" name="cols">
          <td>
            <bean:write name="row" property="<%=((DynaProperty)col).getName()%>"/>
          </td>
        </logic:iterate>
      </tr>
    </logic:iterate>
  </table>
</body>
</html>
