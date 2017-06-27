<logic:messagesPresent>
    <table border="1" bgcolor="orange" width="100%" align="center"><tr><td>
	<p>
		<img src="/images/icon-warning.gif" border="0" vspace="2" hspace="10" align="center">
		WARNING: <bean:message key="errors.heading"/>
	</p>	
	<ul>
	   	<html:messages id="error">
	  		<li><bean:write name="error"/></li>
	   	</html:messages>
	</ul>
</td></tr></table>
<p>
</logic:messagesPresent>
