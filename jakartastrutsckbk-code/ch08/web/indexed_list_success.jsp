<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
  <title>Struts Cookbook Chapter 8 : Indexed List Validation</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 8 :  Indexed List Validation</h2>
  Validation passed.<p>
    <table>
        <tr>
            <th><bean:message key="prompt.partNumber"/></th>
            <th><bean:message key="prompt.quantity"/></th>
        </tr> 
        <c:forEach var="order" items="${IndexedListForm.map.orders}">
            <tr>
                <td><c:out value="${order.partNumber}"/></td>
                <td><c:out value="${order.quantity}"/></td>
            </tr>
        </c:forEach>
    </table>
    <table>
        <tr>
            <th><bean:message key="prompt.discountCode"/></th>
        </tr> 
        <c:forEach var="code" items="${IndexedListForm.map.discountCodes}">
            <tr>
                <td><c:out value="${code}"/></td>
            </tr>
        </c:forEach>
    </table>
  <hr />
  <html:link forward="home">Home</html:link> <html:link forward="logout">Logout</html:link>
</body>
</html>
