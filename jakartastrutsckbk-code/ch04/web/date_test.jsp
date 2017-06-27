<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
  <html>
<head>
  <title>Struts Cookbook - Chapter 4 : Date Test</title>
  <script language="JavaScript" src="scripts/CalendarPopup.js"></script>
  <!-- This prints out the default stylehseets used by the DIV style calendar.
     Only needed if you are using the DIV style popup -->
  <script language="JavaScript">document.write(getCalendarStyles());</script>
</head>
<body>
  <html:errors/>
  <html:form action="/ProcessDate">
    Date 1 (mm|dd|yyyy):
    <html:text size="2" property="month"></html:text>
    <html:text size="2" property="day"></html:text>
    <html:text size="4" property="year"></html:text>
    <br />
  <c:if test="${not empty date1}">
    Date 1: <b><fmt:formatDate dateStyle="full" value="${date1}"/></b>.
  </c:if>
  <p></p>
    <script language="JavaScript" type="text/javascript" id="jscal1x">
      var cal1x = new CalendarPopup("testdiv1");
      cal1x.showNavigationDropdowns();
      cal1x.setYearSelectStartOffset(60);
    </script>
    Birth Date (mm/dd/yyyy):
    <html:text size="8" property="birthDateString"/>
    <a href="" onClick="cal1x.select(document.forms[0].birthDateString,'anchor1x','MM/dd/yyyy'); return false;" TITLE="cal1x.select(document.forms[0].birthDateString,'anchor1x','MM/dd/yyyy'); return false;" NAME="anchor1x" ID="anchor1x">select</A>
    <br />
  <c:if test="${not empty birthDate}">
    Birth Date: <b><fmt:formatDate dateStyle="full" value="${birthDate}"/></b>.
  </c:if>
  <p></p>
    Date 3 (month day, year):
    <html:select property="monthOpt">
      <option value="1">January</option>
      <option value="2">February</option>
      <option value="3">March</option>
      <option value="4">April</option>
      <option value="5">May</option>
      <option value="6">June</option>
      <option value="7">July</option>
      <option value="8">August</option>
      <option value="9">September</option>
      <option value="10">October</option>
      <option value="11">November</option>
      <option value="12">December</option>
    </html:select>
    <html:select property="dayOpt">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
      <option>6</option>
      <option>7</option>
      <option>8</option>
      <option>9</option>
      <option>10</option>
      <option>11</option>
      <option>12</option>
      <option>13</option>
      <option>14</option>
      <option>15</option>
      <option>16</option>
      <option>17</option>
      <option>18</option>
      <option>19</option>
      <option>20</option>
      <option>21</option>
      <option>22</option>
      <option>23</option>
      <option>24</option>
      <option>25</option>
      <option>26</option>
      <option>27</option>
      <option>28</option>
      <option>29</option>
      <option>30</option>
      <option>31</option>
    </html:select>, &nbsp;
    <html:select property="yearOpt">
      <option>2001</option>
      <option>2002</option>
      <option>2003</option>
      <option>2004</option>
      <option>2005</option>
    </html:select>
  <c:if test="${not empty date3}">
    Date 3: <b><fmt:formatDate dateStyle="full" value="${date3}"/></b>.
  </c:if>
  <p></p>
    <html:submit/>
  </html:form>
  <DIV ID="testdiv1" STYLE="position:absolute;visibility:hidden;background-color:white;layer-background-color:white;"></DIV>
</body>
</html>
