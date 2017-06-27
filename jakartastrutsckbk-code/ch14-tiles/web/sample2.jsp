<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html:html lang="true">
<head>
  <title><tiles:getAsString name="title" ignore="true"/></title>
  <html:base/>
</head>
<body bgcolor="white">
    <table border="0" width="100%">
        <tr><td align="center" colspan="3" height="100" bgcolor="darkblue"><h2><font color="white">This is the header.</font></h2></td></tr>
        <tr height="400">
            <td width="20%" valign="top" bgcolor="gold">
                <p></p><h4>Navigation Sidebar</h4>
                <ul>
                    <li>Start Page</li>
                    <li><a href="page1.jsp">Page One</a></li>
                    <li><a href="page2.jsp">Page Two</a></li>
                    <li><a href="page3.jsp">Page Three</a></li>
                </ul>
            </td>
            <td width="55%" bgcolor="white">This is the body content.</td>
            <td width="25%" bgcolor="blue" valign="top">
                <span style="color:white">
                    <h4>News and Events</h4>
                    <p>Content on this region will change with the body content.</p>
                </span>
            </td>
        </tr>
        <tr><td colspan="3" height="50" bgcolor="darkblue">
                <font color="white" size="-2">
                    This is the footer where we add a bunch of legalese and 
                    talk in a really rapid voice so that no one can undertand 
                    what we are saying in this run-on sentence.
                </font>
            </td>
        </tr>
    </table>
</body>
</html:html>
