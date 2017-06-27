<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
  <html>
<head>
  <title>Struts Cookbook - Chapter 4 : Sorted Struts Table</title>
</head>
<body>
  <table width="60%" border="2">
    <tr>
      <th>Day of Week<br />
        <a href="ViewForecast.do">unsort</a>
      </th>
      <th>Chance of Precipitation<br />
        <a href="ViewForecast.do?sortBy=chancePrecip">asc</a>
        <a href="ViewForecast.do?sortBy=chancePrecip&reverse=true">desc</a>
      </th>
      <th>Expected Precipitation (inches)<br />
        <a href="ViewForecast.do?sortBy=rainfall">asc</a>
        <a href="ViewForecast.do?sortBy=rainfall&reverse=true">desc</a>
      </th>
    </tr>
    <logic:iterate id="forecast" name="weekForecast">
      <tr>
        <td>
          <bean:write name="forecast" property="day"/>
        </td>
        <td>
          <bean:write name="forecast" property="chancePrecip"/>
        </td>
        <td>
          <bean:write name="forecast" property="rainfall"/>
        </td>
      </tr>
    </logic:iterate>
  </table>
</body>
</html>
