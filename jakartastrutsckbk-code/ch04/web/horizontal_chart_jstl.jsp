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
  <html:link page="/display_tag.jsp">Display Tag Examples</html:link>
  <div align="center">   
  <hr />
  <h3>Expected Rainfall</h3>
  <table border="0" width="60%">
  <c:forEach var="dayEntry" items="${weeklyWeather.weekForecast}">
    <tr>
      <td align="right" width="20%"><bean:write name="dayEntry" property="day"/></td>
      <td align="left" width="80%">
        <table background="images/raincloud.gif" 
                    width="<c:out value='${(dayEntry.rainfall div weeklyWeather.maxRainfall) * 100}'/>%">
	      <tr>
            <td align="right">
              <span style="{color:black;background-color:white}">
                <fmt:formatNumber value="${dayEntry.rainfall}" pattern="##.0"/>"
			     </span>
            </td>
           </tr>
        </table>
      </td>
    </tr>
  </c:forEach>
</table>
<hr />
</div>
</body>
</html:html>
