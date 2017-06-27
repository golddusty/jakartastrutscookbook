<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html-el" prefix="html-el" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html:html locale="true">
<head>
<title><bean:message key="index.title"/></title>
<html:base/>
  <script language="JavaScript">
       // Create the array for the first set of options
       javaIdes = new Array();
       <logic:iterate indexId="ctr" id="ide" name="FavoritesForm" property="javaIdes">
          javaIdes[<bean:write name="ctr"/>]=new Option("<bean:write name='ide'/>","<bean:write name='ide'/>", false,false);
       </logic:iterate>

       csharpIdes = new Array();
       <logic:iterate indexId="ctr" id="ide" name="FavoritesForm" property="csharpIdes">
          csharpIdes[<bean:write name="ctr"/>]=new Option("<bean:write name='ide'/>","<bean:write name='ide'/>", false,false);
       </logic:iterate>

     function changeOptions(f) {
       ideSelect = document.FavoritesForm.ide;
       ideSelect.options.length=0;

       if (f.value == 'Java') 
         optionsArray = javaIdes;
       else
         optionsArray = csharpIdes;

       for (i=0; i < optionsArray.length; i++)
           ideSelect.options[i] = optionsArray[i];
     }
  </script>
</head>
<body bgcolor="white">
<h2>Favorites Poll</h2>
   <html:form action="/ViewFavorites">
   <p>What is your favorite language and IDE?<br/>
      <html:radio property="language" value="Java" onclick="changeOptions(this);"/> Java<br/>
      <html:radio property="language" value="C-Sharp" onclick="changeOptions(this);"/> C-Sharp<br/>
      IDE: <html:select property="ide">         
      </html:select>
   </p>
	<p>
		What is your name:
		<br/><html:text property="name"/>
	</p>
	<p>
		What are your three favorite colors:
		<%--<logic:iterate id="color" name="FavoritesForm" property="color" indexId="ctr"> 
         <br/><input type="text" name="color[<c:out value='${ctr}'/>]"
                     value="<c:out value='${FavoritesForm.color[ctr]}'/>"/>
      </logic:iterate>--%>
	  <%--<logic:iterate id="color" name="FavoritesForm" property="color" indexId="ctr"> 
         <br/><html-el:text property="color[${ctr}]"/>
      </logic:iterate>--%>
		<%--<logic:iterate id="c" name="colors" indexId="ctr"> 
         <br/><html:text property="color" indexed="true"/>
      </logic:iterate>--%>
	</p>
  What are your three favorite colors:
  <c:forEach var="theColor" items="${FavoritesForm.colors}" varStatus="loopStatus">
    <bean:define id="ctr">
      <c:out value="${loopStatus.index}"/>
    </bean:define>
	<br/><html:text property='<%="color["+ctr+"]"%>'/>
  </c:forEach>
   <p>
      What are your favorite links?
      <table>
         <tr>
            <th>Name</th>
            <th>URL</th>
         </tr>
         <logic:iterate offset="1" length="3" id="webLink" name="FavoritesForm" property="webLinks">
           <tr>
             <td><html:text name="webLink" property="name" indexed="true"/></td>
             <td><html:text name="webLink" property="url" indexed="true"/></td>
           </tr>
         </logic:iterate>
      </table>
      What are your favorite links?
      <table>
         <tr>
            <th>Name</th>
            <th>URL</th>
         </tr>
         <c:forEach var="webLink" items="${FavoritesForm.webLinks}">
           <tr>
             <td><html:text name="webLink" property="name" indexed="true"/></td>
             <td><html:text name="webLink" property="url" indexed="true"/></td>
           </tr>
         </c:forEach>
      </table>
   </p>
	<html:submit/>
	<html:reset/>
</html:form>
<p>

<html:link href="javascript:document.FavoritesForm.submit()">
   <html:img page="/struts-power.gif" 
              alt="Submit" border="0"/> 
</html:link>
</p>
</body>
</html:html>
