<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:output method="html" />

    <xsl:template match="/">
		<xsl:apply-templates select="stxx/userList"/>
    </xsl:template>

    <xsl:template match="userList">
        <html>
            <body>
                <table width="75%" border="1" align="center">
                    <tr>
                        <td bgcolor="lightblue" align="center">
                            <a href="./xsl/viewUserList.xsl">View XSL</a>
                   	    </td>
                        <td bgcolor="lightblue" align="center">
                            <a href="./index.jsp">
                                <xsl:value-of select="/stxx/applicationResources/key[@name='link.index']"/>
                            </a>
                   	    </td>
                        <td bgcolor="lightblue" align="center">
                            <a href="./addUser.do">
                                <xsl:value-of select="/stxx/applicationResources/key[@name='link.add.user']"/>
                            </a>
                   	    </td>
                    </tr>
					<xsl:apply-templates select="users"/>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="users">
        <tr bgcolor="lightgrey">
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Email</b></td>
        </tr>
		<xsl:apply-templates select="user"/>
    </xsl:template>
	
	<xsl:template match="user">
		<tr>
			<td><xsl:value-of select="./name/firstname"/></td>
			<td><xsl:value-of select="./name/lastname"/></td>
			<td><xsl:value-of select="./email"/></td>
		</tr>
	</xsl:template>
    
</xsl:stylesheet>
