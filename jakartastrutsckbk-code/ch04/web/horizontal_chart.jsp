<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

<html:html locale="true">
<head>
  <title>Struts Cookbook : Chapter 04</title>
</head>
<body bgcolor="white">
<h2><bean:message key="label.index.title"/> Chapter 4 Examples</h2>
  <html:link page="/display_tag.jsp">Display Tag Examples</html:link>
  <div align="center">   
  <hr />
  <h3>Color Bar Chart (horizontal)</h3>
  <jsp:useBean id="weeklyWeather" class="com.oreilly.strutsckbk.ch04.WeeklyWeather"/>
  <table border="0" width="60%">
  <logic:iterate id="dayEntry" name="weeklyWeather" property="weekForecast">
    <tr>
      <td align="right" width="20%"><bean:write name="dayEntry" property="day"/></td>
      <td align="left" width="80%">
        <table width='<bean:write name="dayEntry" 
                       property="chancePrecip"/>%' bgcolor="#003366">
	      <tr>
            <td align="right">
              <font color="white">
                <bean:write name="dayEntry" 
                        property="chancePrecip"/>%			          
			     </font>
            </td>
           </tr>
        </table>
      </td>
    </tr>
  </logic:iterate>
</table>
</html:html>