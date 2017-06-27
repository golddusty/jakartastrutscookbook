<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
   <html>
<head>
  <title>Struts – JavaScript Example</title>
  <script language="JavaScript">
     function getOptions(control) {
        form = control.form;
        form.action = "GetIdeOptions.do?language=";
        form.action += control.value;
        form.submit();
     }
   </script>
</head>
<body>
   <html:form action="ViewFavoriteLanguage">
      What's your favorite programming language?<br/>
      <html:radio property="language" value="Java" 
                   onclick="getOptions(this);"/> Java<br/>
      <html:radio property="language" value="C-Sharp" 
                   onclick="getOptions(this);"/> C-Sharp<br/>
      <p>What's your favorite development tool?<br/>
      IDE:
      <html:select property="ide">
         <html:optionsCollection property="ides"/>
      </html:select>   
      </p>
      <p>Why is this your favorite?<br/>
      <html:textarea property="reason"/>
      </p>
      <p>What is your level of expertise?<br/>
         <logic:iterate id="expertise" name="MyForm" property="expertises">
            <html:radio property="expertiseLevel" idName="expertise" value="level"/>
            &nbsp;<bean:write name="expertise" property="name"/><br />
         </logic:iterate>
      </p>
      <html:submit/>
  </html:form>
</body>
</html>
