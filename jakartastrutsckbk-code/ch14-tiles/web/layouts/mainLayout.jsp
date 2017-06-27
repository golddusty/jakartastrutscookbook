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
    <table border="0" width="100%">
        <tr>
            <td align="center" colspan="3" height="100" bgcolor="darkblue">
                <tiles:insert attribute="header">
                    <tiles:put name="title" beanName="title" beanScope="tile"/>
                </tiles:insert>
            </td>
        </tr>
        <tr height="300">
            <td width="20%" valign="top" bgcolor="gold">
                <tiles:insert attribute="navbar"/>
            </td>
            <td width="55%" bgcolor="white">
                <tiles:insert attribute="body"/>
            </td>
            <td width="25%" bgcolor="blue" valign="top">
                <tiles:insert attribute="news"/>
            </td>
        </tr>
        <tr>
            <td align="center" colspan="3" height="50" bgcolor="darkblue">
                <tiles:insert attribute="footer"/>
            </td>
        </tr>
    </table>
</body>
</html:html>
