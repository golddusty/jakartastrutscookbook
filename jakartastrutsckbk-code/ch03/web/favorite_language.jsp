<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html>
<head>
  <title>Struts – JavaScript Example</title>
  <script language="JavaScript">
     // Create the array for the first set of options
     javaIdesArray = new Array();
     <logic:iterate id="ide" indexId="ctr" 
                  name="MyForm"  property="javaIdes">
          javaIdesArray[<bean:write name="ctr"/>] = 
             new Option("<bean:write name='ide'/>",
                        "<bean:write name='ide'/>",
                        false, false);
     </logic:iterate>

     // Create the array for the second set of options
     csharpIdesArray = new Array();
     <logic:iterate id="ide" indexId="ctr" 
                  name="MyForm"  property="csharpIdes">
          csharpIdesArray[<bean:write name="ctr"/>] = 
             new Option("<bean:write name='ide'/>",
                        "<bean:write name='ide'/>",
                        false, false);
     </logic:iterate>

     function changeOptions(control) {       
       ideControl = document.MyForm.ide;
       ideControl.options.length=0;

       if (control.value == 'Java') 
         ideArray = javaIdesArray;
       else
         ideArray = csharpIdesArray;

       for (i=0; i < ideArray.length; i++)
           ideControl.options[i] = ideArray[i];
     }
  </script>
</head>
<body>
  <html:form action="/admin/ViewFavoriteLanguage">
      What's your favorite programming language?<br/>
      <html:radio property="language" value="Java" 
                   onclick="changeOptions(this);"/> Java<br/>
      <html:radio property="language" value="C-Sharp" 
                   onclick="changeOptions(this);"/> C-Sharp<br/>
      <p>What's your favorite development tool?<br/>
      IDE: <html:select property="ide"/>
      </p>
      <html:submit/>
  </html:form>
</body>
</html>
