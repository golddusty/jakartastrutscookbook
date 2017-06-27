<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : Tables</title>
  <style>
  /* Even row */
  .evenRow {background-color:orange;}

  /* Odd row */
  .oddRow {background-color:yellow;}
  </style>
</head>
<body>
  <jsp:useBean id="weeklyWeather" class="com.oreilly.strutsckbk.ch04.WeeklyWeather"/>
  <table>
    <tr>
      <th>Day of Week</th>
      <th>Chance of Precipitation</th>
      <th>Expected Precipitation (inches)</th>
    </tr>
    <c:forEach var="forecast" items="${weeklyWeather.weekForecast}" varStatus="loop">
      <c:set var="tdclass" value="oddRow"/>
      <c:if test="${loop.count % 2 == 0}">
        <c:set var="tdclass" value="evenRow"/>
      </c:if>
      <tr>
        <td class='<c:out value="${tdclass}"/>'>
          <c:out value="${forecast.day}"/>
        </td>
        <td class='<c:out value="${tdclass}"/>'>
          <c:out value="${forecast.chancePrecip}"/>
        </td>
        <td class='<c:out value="${tdclass}"/>'>
          <c:out value="${forecast.rainfall}"/>
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
