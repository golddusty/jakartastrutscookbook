<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
  <title>Struts Cookbook - Chapter 6</title>
</head>
<body bgcolor="white">
<h2>Struts Cookbook Chapter 6 Examples</h2>
  <p>
    <html:link page="/include_test.jsp">Include Action Test</html:link>
  </p>
  <p>
    <html:link action="/ForwardActionTest">Forward Action Test</html:link>
  </p>
  <p>
    <html:link action="/ChainActionTest">Chain Action Test</html:link>
  </p>
  <p>
    <html:link page="/dispatch_test.jsp">Dispatch Action Test</html:link>
  </p>
  <p>
    <html:link page="/lookup_dispatch_test.jsp">Lookup Dispatch Action Test</html:link>
  </p>
  <p>
    <html:link page="/mapping_dispatch_test.jsp">Mapping Dispatch Action Test</html:link>
  </p>
  <p>
    <html:link action="/ResponseWriterTest">Response Writer Test</html:link>
  </p>
  <p>
    <html:link page="/default_module.jsp">Switch Action Test</html:link>
  </p>
</body>
</html>
