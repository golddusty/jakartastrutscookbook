<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
<head>
  <title>Struts Cookbook – Developer Poll</title>
</head>
<body>
   <jsp:useBean id="languageChoices" 
             class="com.oreilly.strutsckbk.LanguageChoices"
             scope="application"/>  
   <html:form action="ProcessLanguageChoice">
      What's your favorite programming language?
      <p>
      <logic:iterate id="lang" name="languageChoices" property="languages">
         <html:radio property="language" idName="lang" value="value"/>
         &nbsp;<bean:write name="lang" property="label"/><br />
      </logic:iterate>
      </p>
      <html:submit value="Next >>"/>
  </html:form>
</body>
</html>
