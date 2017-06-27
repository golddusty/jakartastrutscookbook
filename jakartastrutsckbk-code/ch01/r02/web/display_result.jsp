<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
   <head>
      <title>Add Two Numbers</title>
   </head>
   <body>
      <jsp:useBean 
            id="valueHolder"
            class="com.oreilly.strutsckbk.ValueHolder">
         <jsp:setProperty name="valueHolder" property="*"/>
      </jsp:useBean>
      The sum of <%= valueHolder.getValue1() %> plus
      <%= valueHolder.getValue2() %> is:<p>
      <% int sum = valueHolder.getValue1() + valueHolder.getValue2(); %>
      <%= sum %>.<p>
      <a href="get_input.jsp">Perform another calculation</a>      
   </body>
</html>
