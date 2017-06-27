<logic:messagesPresent name="APP_ERROR_KEY">
    <table border="1" bgcolor="orange" width="100%" align="center"><tr><td>
	<p>
		<img src="/images/icon-alert.gif" border="0" vspace="2" hspace="10" align="center">
		<bean:message key="errors.heading"/>
	</p>	
	<ul>
	   	<html:messages id="error" name="APP_ERROR_KEY">
	  		<li><bean:write name="error"/></li>
	   	</html:messages>
	</ul>
</td></tr></table>
<p>
</logic:messagesPresent>
<logic:messagesPresent name="APP_WARNING_KEY">
    <table border="1" bgcolor="yellow" width="100%" align="center"><tr><td>
	<p>
		<img src="/images/icon-warning.gif" border="0" vspace="2" hspace="10" align="center">
		<bean:message key="warnings.heading"/>
	</p>	
	<ul>
	   	<html:messages id="error" name="APP_WARNING_KEY">
	  		<li><bean:write name="error"/></li>
	   	</html:messages>
	</ul>
</td></tr></table>
<p>
</logic:messagesPresent>
