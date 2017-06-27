<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<html:html lang="true">
<head>
  <title>Rendering Localized Text and Images</title>
  <style>
      <!--
          <bean:define id="globalStyle">
              <bean:message key="css.global"/>
          </bean:define>
          @import url(<html:rewrite page="<%=globalStyle%>"/>);

          <bean:define id="localStyle">
              <bean:message key="css.local"/>
          </bean:define>
          @import url(<html:rewrite page="<%=localStyle%>"/>);

          <fmt:message key="css.global" var="globalStyle"/>
          @import url(<c:url value="${globalStyle}"/>)

          <fmt:message key="css.local" var="localStyle"/>
          @import url(<c:url value="${localStyle}"/>)
      -->
  </style>
</head>
<body>
    <h3>Your session locale is <c:out value="${sessionScope['org.apache.struts.action.LOCALE']}"/></h3>
    <html:img srcKey="flag.img"/>
    <h4>Order Information</h4>
    <bean:define id="theOrder" name="order"  type="com.oreilly.strutsckbk.ch12.Order"/>
    <bean:message key="msg.confirm.order"
                 arg0="<%=theOrder.getQuantity().toString()%>"
                 arg1="<%=theOrder.getPartNumber().toString()%>"
                 arg2="<%=theOrder.getAmount().toString()%>"
    />
    <p></p>    
                 
    Part: <bean:write name="order" property="partNumber"/><br />
    Qty: <bean:write name="order" property="quantity"/><br />
    <%--
        <bean:message key="amount.prompt"/>: <bean:write name="order" property="amount" format="#,##0.00"/><br />
    --%>
    Date: <bean:write name="order" property="datePlaced"/><br />
    Formatted date: <bean:write name="order" property="datePlaced" formatKey="format.date"/><br />

<%--    
<bean:write name="beanName"
        property="numericProperty"
          format="number pattern"/>
<bean:write name="beanName"
        property="dateProperty"
          format="date pattern"/>
<bean:message key="message.key"
             argn="replacement value"/>

<fmt:formatNumber value="${beanName.numericProperty}"
                pattern="number pattern"/>     
<fmt:formatDate value="${beanName.dateProperty}"
              pattern="date pattern"/>
<fmt:message key="message.key">
    <fmt:param value="replacement value"/>
</fmt:message>     

    bean:write with no formatting: <bean:write name="order" property="amount"/><p>
    bean:write with format attr: <bean:write name="order" property="amount" format="#,##0.00"/><p>
    bean:write with formatKey: <bean:write name="order" property="amount" formatKey="format.amount"/><p>
    fmt:formatNumber: <fmt:formatNumber value="${order.amount}"/><p>
    <fmt:message key="format.amount" var="amtFmt"/>
    fmt:formatNumber with pattern (<c:out value="${amtFmt}"/>): <fmt:formatNumber value="${order.amount}" pattern="${amtFmt}"/>
--%>        
    <p></p>     
    <html:link page="/index.jsp">Return</html:link>
</body>
</html:html>
