<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@ taglib prefix="s" uri="http://struts.apache.org/tags-faces" %>

<f:view>
<s:loadMessages var="messages"/>
<s:html locale="true">
<head>
  <title>Struts Cookbook - Integrating Struts and JSF</title>
</head>
<body>
  <h2>Struts Cookbook - Integrating Struts and JSF</h2>
  <h3><s:message key="index.welcome"/></h3>
  <h:outputText value="#{messages['msg.loggedIn']}"/> 
  <b><h:outputText value="#{user.username}"/></b>.
</body>
</s:html>
</f:view>
