<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<html>
<head>
  <title>Struts Cookbook - Chapter 4 : Display Tag Example</title>
  <style>
  .even {background-color:orange;}
  .odd {background-color:yellow;}
  </style>
</head>
<body>
  <h2>Display Tag Examples</h2>
  <jsp:useBean id="pagedData" class="com.oreilly.strutsckbk.ch04.PagedData"/>
  <display:table id="pres" name="${pagedData.data}"
                 sort="list" pagesize="10" defaultsort="3">
    <display:caption>United States Presidents</display:caption>
    <display:setProperty name="basic.show.header" value="true"/>
    <display:column property="firstName" title="First Name"
                    sortable="true"/>
    <display:column property="lastName" title="Last Name"
                    sortable="true"/>
    <display:column property="term" title="Term of Office"
                    sortable="true"/>
  </display:table>  
</body>
</html>
