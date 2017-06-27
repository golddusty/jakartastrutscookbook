<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html:html lang="true">
<head>
  <title><tiles:getAsString name="title"/></title>
  <html:base/>
</head>
<body bgcolor="white">
    <p>
    <h2>
        <tiles:getAsString name="title"/>
    </h2>
    </p>
    <p>
        <tiles:insert attribute="body"/>
    </p>
</body>
</html:html>
