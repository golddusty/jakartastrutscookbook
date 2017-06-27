<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/">
        <html>
        <body>
 		    <form action="saveUser.do">
                <table width="75%" border="1" align="center">
                    <tr bgcolor="lightgrey">
						<td colspan="2"><b>Add User</b>
						    <a href="./xsl/addUser.xsl"> (View XSL) </a>
						</td>
                    </tr>
                    <tr>
						<td><font color="red">*</font>First name:</td>
						<td>
  						    <input type="text" name="user/name/firstname" 
  						          value="{stxx/form/userForm/user/name/firstname}"/>
						</td>
                    </tr>
                    <tr>
						<td><font color="red">*</font>Last name:</td>
						<td>
                            <input type="text" name="user/name/lastname" 
                                  value="{stxx/form/userForm/user/name/lastname}"/>
                        </td>
                    </tr>
                    <tr>
						<td><font color="red">*</font>Email:</td>
						<td>
                            <input type="text" name="user/email" 
                                  value="{stxx/form/userForm/user/email}"/>
                        </td>
                    </tr>
                    <tr align="center">
						<td colspan="2">
						    <input type="submit" value="Submit"/>
						</td>
                    </tr>
                </table>
			</form>
        </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
