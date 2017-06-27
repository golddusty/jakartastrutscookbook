<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : The Nested Tags</title>
</head>
<body>
  <jsp:useBean id="weeklyWeather" class="com.oreilly.strutsckbk.ch04.WeeklyWeather"/>
  <table>
    <tr>
      <th>Day of Week</th>
      <th>Chance of Precipitation</th>
      <th>Expected Precipitation (inches)</th>
    </tr>
    <nested:iterate id="forecast" name="weeklyWeather" property="weekForecast">
      <tr>
        <td>
          <nested:write property="day"/>
        </td>
        <td>
          <nested:write property="chancePrecip"/>
        </td>
        <td>
          <nested:write property="rainfall"/>
        </td>
      </tr>
    </nested:iterate>
  </table>
</body>
</html>
