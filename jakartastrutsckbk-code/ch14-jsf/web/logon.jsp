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
  <p />
  <s:form id="logon" action="/Logon" 
     focus="username" styleClass="form">
    <h:outputLabel for="username" styleClass="label" value="Username:"/>
    <h:inputText id="username" value="#{logonForm.username}" 
           required="true" size="10"/> <p />
    <h:outputLabel for="password" styleClass="label" value="Password:"/>
    <h:inputSecret id="password" value="#{logonForm.password}"
             required="true" size="10"/> <p />
    <h:commandButton id="submit" type="SUBMIT" value="Logon" />
  </s:form>
</body>
</s:html>
</f:view>
