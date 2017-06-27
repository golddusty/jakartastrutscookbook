<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : Paging</title>
</head>
<body>
  <jsp:useBean id="pagedData" class="com.oreilly.strutsckbk.ch04.PagedData"/>
  <bean:size id="listSize" name="pagedData" property="data"/>
  <c:set var="pageSize" value="10"/>
  <c:set var="pageBegin" value="${param.pageBegin}"/>  
  <c:set var="pageEnd" value="${pageBegin + pageSize - 1}"/>
  <c:if test="${(pageBegin - pageSize) ge 0}">
    <a href='<c:url value="paged_data.jsp">
               <c:param name="pageBegin" value="${pageBegin - pageSize}"/>
             </c:url>'>
      Prev
    </a>
  </c:if>
  &nbsp;
  <c:if test="${(listSize gt pageSize) and (pageEnd lt listSize)}">
    <a href='<c:url value="paged_data.jsp">
               <c:param name="pageBegin" value="${pageBegin + pageSize}"/>
             </c:url>'>
      Next
    </a>
  </c:if>
  <table border="2">
    <tr>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Term of Office</th>
    </tr>
    <c:forEach var="pres" items="${pagedData.data}" 
             begin="${pageBegin}" end="${pageEnd}">
      <tr>
        <td>
          <c:out value="${pres.firstName}"/>
        </td>
        <td>
          <c:out value="${pres.lastName}"/>
        </td>
        <td>
          <c:out value="${pres.term}"/>
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
