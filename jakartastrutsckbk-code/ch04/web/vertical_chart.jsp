<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<html:html locale="true">
<head>
  <title>Struts Cookbook : Chapter 04</title>
</head>
<body bgcolor="white">
<h2><bean:message key="label.index.title"/> Chapter 4 Examples</h2>
  <div align="center">   
  <hr />
  <h3>Color Bar Chart (vertical)</h3>
  <table height="400" width="60%">
    <tr>
      <logic:iterate id="dayEntry" name="weeklyWeather" property="weekForecast">
        <td valign="bottom">
          <table height='<bean:write name="dayEntry" property="chancePrecip"/>%' width="100%" bgcolor="#003366">
             <tr>
                <td align="center" valign="top">
                   <font color="white"><bean:write name="dayEntry" property="chancePrecip"/>%</font>
                </td>
             </tr>
          </table>
        </td>
      </logic:iterate>
    </tr>
    <bean:size id="cols" name="weeklyWeather" property="weekForecast"/>
    <tr align="center" height="10%">
      <logic:iterate id="dayEntry" name="weeklyWeather" property="weekForecast">
        <td align="center" width="<c:out value='${100 div cols}'/>%">
           <bean:write name="dayEntry" property="day"/>
        </td>
      </logic:iterate>
    </tr>
  </table>
<hr />
  <h3>Image Bar Chart (vertical)</h3>
  <table height="500" width="60%">
    <tr>
      <logic:iterate id="dayEntry" name="weeklyWeather" property="weekForecast">
        <td valign="bottom">
          <table height='<bean:write name="dayEntry" property="chancePrecip"/>%' width="100%" background="images/raincloud.gif">
             <tr>
                <td align="center" valign="top">
                   <span style="{color:black;background-color:white}"><bean:write name="dayEntry" property="chancePrecip"/>%</span>
                </td>
             </tr>
          </table>
        </td>
      </logic:iterate>
    </tr>
    <bean:size id="cols" name="weeklyWeather" property="weekForecast"/>
    <tr align="center" height="10%">
      <logic:iterate id="dayEntry" name="weeklyWeather" property="weekForecast">
        <td align="center" width="<c:out value='${100 div cols}'/>%"><bean:write name="dayEntry" property="day"/></td>
      </logic:iterate>
    </tr>
  </table>
  <hr />
</div>
</body>
</html:html>
