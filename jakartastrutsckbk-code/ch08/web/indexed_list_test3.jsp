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
  <html:form action="/ProcessIndexedListTest3">
    Enter up to 3 discount codes:<br />
    <table><tr>
    <logic:iterate name="IndexedListForm" property="discountCodes"
                     id="discountCodes" indexId="ndx">
        <td>
            <html:text property='<%="discountCodes["+ndx+"]"%>'/><br />&nbsp;
            <html:messages id="error" property='<%="discountCodes["+ndx+"].discountCodes"%>'>
 		        <font color="red"><bean:write name="error"/></font>
            </html:messages>
        </td>
    </logic:iterate>
    </tr></table>
    <html:submit/>
  </html:form>
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
