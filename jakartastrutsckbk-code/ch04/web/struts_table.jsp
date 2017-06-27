<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
  <html>
<head>
  <title>Struts Cookbook - Chapter 4 : Tables</title>
  <style>
  /* Even row */
  .row1 {background-color:orange;}

  /* Odd row */
  .row0 {background-color:yellow;}
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
    <logic:iterate id="forecast" name="weeklyWeather" property="weekForecast" indexId="count">
      <tr>
        <td class='row<%= count.intValue() % 2 %>'>
          <bean:write name="forecast" property="day"/>
        </td>
        <td class='row<%= count.intValue() % 2 %>'>
          <bean:write name="forecast" property="chancePrecip"/>
        </td>
        <td class='row<%= count.intValue() % 2 %>'>
          <bean:write name="forecast" property="rainfall"/>
        </td>
      </tr>
    </logic:iterate>
  </table>
</body>
</html>
