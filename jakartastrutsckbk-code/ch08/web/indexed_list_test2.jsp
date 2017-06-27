<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
  <title>Struts Cookbook Chapter 8 : Indexed List Validation</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 8 :  Indexed List Validation</h2>
  <html:form action="/ProcessIndexedListTest2">
    <table>
        <tr>
            <th><bean:message key="prompt.partNumber"/></th>
            <th><bean:message key="prompt.quantity"/></th>
        </tr> 
         <logic:iterate name="IndexedListForm" property="orders"
                          id="orders" indexId="ndx">
            <tr>
                <td>
                    <html:text name="orders" property="partNumber" indexed="true"/><br />&nbsp;
                    <html:messages id="error" property='<%="orders["+ndx+"].partNumber"%>'>
 		      		  <font color="red"><bean:write name="error"/></font>
                    </html:messages>
                </td>
                <td>
                    <html:text name="orders" property="quantity" indexed="true"/><br />&nbsp;
                    <html:messages id="error" property='<%="orders["+ndx+"].quantity"%>'>
 		      		  <font color="red"><bean:write name="error"/></font>
                    </html:messages>
                </td>
            </tr>
        </logic:iterate>
    </table>
    <html:submit/>
  </html:form>
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
