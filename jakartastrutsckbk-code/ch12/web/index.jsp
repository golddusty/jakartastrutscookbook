<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<html:html lang="false">
<head>
  <title><bean:message key="index.welcome"/></title>
  <script language="JavaScript">
      function Popup(id) {
	     popwin(id, 325, 125, 0, 0);
      }

function popwin(id, w, h, l, t) {
	var args;
	args += 'resizable=yes,';
	args += 'scrollbars=yes,'; 
	args += 'location=no,';
	args += 'directories=no,';
	args += 'status=no,';
	args += 'toolbar=no,';
	args += 'menubar=no,';
	args += 'width=' + w + ',';
	args += 'height=' + h + ',';
	args += 'left=' + l + ',';
	args += 'top=' + t;
	
	window_handle = window.open(id, 'popup', args);
	window_handle.focus();
}      
  </script>
</head>
<body>
<h2>Struts Cookbook Chapter 12 Examples</h2>
<h3>Your session locale is <c:out value="${sessionScope['org.apache.struts.action.LOCALE']}"/></h3>
<h3>Using bean:message - <bean:message key="index.welcome"/></h3>
<h4>Using fmt:message - <fmt:message key="index.welcome"/> from JSTL</h4>
<p>
bean:message from alt bundle - 
<bean:message bundle="alt" key="msg.hello" arg0="Bill"/>     
</p>
<p>
fmt:message from alt bundle - 
<fmt:bundle basename="AlternateResources">
    <fmt:message key="msg.hello">
        <fmt:param value="Bill"/>
    </fmt:message>     
</fmt:bundle>
</p>
<html:link action="/ChangeLocale?language=en">English</html:link><p>
<html:link action="/ChangeLocale?language=ru">Russian</html:link><p>
<html:link action="/ChangeLocale?language=es">Spanish</html:link><p>
<html:link action="/ChangeLocale?language=en&country=US&variant=SE">Southeastern US</html:link>
<ul>
    <li><html:link page="/no_lang_or_locale.jsp">Test Plain HTML tag</html:link></li>
    <li><html:link page="/locale_true.jsp">Test html:html with locale=true</html:link></li>
    <li><html:link page="/lang_true.jsp">Test html:html with lang=true</html:link></li>
    <li><html:link href="javascript:Popup('need_help.jsp')">Popup with localized images</html:link></li>
    <li><html:link page="/test_form.jsp">Test character encodings</html:link></li>
</ul>
<html:link page="/change_lang.jsp">Change Language Form</html:link>
<p>
<html:link action="/ViewLocalizedData">View Localized Data</html:link>
<%@ include file="debug.jsp" %>
</body>
</html:html>
