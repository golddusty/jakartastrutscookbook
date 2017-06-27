<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : Sorted Struts Table</title>
</head>
<body>
  <table width="60%" border="2">
    <tr>
      <th>Day of Week<br />
        <a href="ViewForecast2.do">unsort</a>
      </th>
      <th>
        <table cellspacing="0" cellpadding="0">
            <tr>
                <td rowspan="2"><b>Chance of Precipitation</b></td>
                <td>
                    <a href="ViewForecast2.do?sortBy=chancePrecip">
                        <html:img src="images/up_arrow.gif" border="0"/>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="ViewForecast2.do?sortBy=chancePrecip&reverse=true">
                        <html:img src="images/dn_arrow.gif" border="0"/>
                    </a>
                </td>
            </tr>
         </table>
      </th>
      <th>
        <table cellspacing="0" cellpadding="0">
            <tr>
                <td rowspan="2"><b>Expected Precipitation (inches)</b></td>
                <td>
                    <a href="ViewForecast2.do?sortBy=rainfall">
                        <html:img src="images/up_arrow.gif" border="0"/>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="ViewForecast2.do?sortBy=rainfall&reverse=true">
                        <html:img src="images/dn_arrow.gif" border="0"/>
                    </a>
                </td>
            </tr>
         </table>
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
