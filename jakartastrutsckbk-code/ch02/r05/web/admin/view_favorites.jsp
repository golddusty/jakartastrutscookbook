<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html:html locale="true">
<head>
<title><bean:message key="index.title"/></title>
<html:base/>
</head>
<body bgcolor="white">
<h2>Your Favorites</h2>
<bean:define id="favs" name="FavoritesForm"/>
<script language="JavaScript">
   function showMessage() {
      alert( "Hello, <bean:write name='favs' property='name'/>!" );
   }
</script>
<p>
      Thanks for responding, <bean:write name="favs" property="name"/> !<br/>
      <a href="javascript:showMessage()">Click Me</a>
</p>
<p>You have indicated that your favorite colors are:
   <ul>
      <li><bean:write name="favs" property="color[0]"/></li>
      <li><bean:write name="favs" property="color[1]"/></li>
      <li><bean:write name="favs" property="color[2]"/></li>
   </ul>
   <ul>
      <c:forEach var="color" items="${favs.color}">
        <li><c:out value="${color}"/></li>
      </c:forEach>
   </ul>
   </p>
   <p>
      Your favorite links are:
      <ul>
         <logic:iterate id="webLink" name="favs" property="webLinks">
            <a href='<bean:write name="webLink" property="url"/>'>
               <bean:write name="webLink" property="name"/>
            </a>            
         </logic:iterate>
      </ul>
   </p>
   <p>
      Your favorite language is: <bean:write name="favs" property="language"/><br/>
      Your favorite IDE is: <bean:write name="favs" property="ide"/>
   </p>
   <html:link action="/admin/EditFavorites">Try Again</html:link>
</body>
</html:html>
