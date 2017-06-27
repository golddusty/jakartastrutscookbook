<%@ taglib uri="http://struts-menu.sf.net/tag" prefix="menu" %>
<html>
    <head>
        <title>
            Struts Cookbook - Chapter 14 : Menus
        </title>
        <link rel="stylesheet" type="text/css" media="screen" 
            href="styles/global.css" />   
            
        <link rel="stylesheet" type="text/css" media="screen" 
            href="styles/tabs.css" />    
    
        <script type="text/javascript" src="scripts/tabs.js"></script>
    </head>
    <body>
<menu:useMenuDisplayer name="TabbedMenu">
    <menu:displayMenu name="PageOne"/>
    <menu:displayMenu name="PageTwo"/>
    <menu:displayMenu name="PageThree"/>
</menu:useMenuDisplayer>
<body>

<div id="content" style="width: 60%">
    <h2>CSS Tabs</h2>
    <p>
        Adapted from <a href="http://www.kalsey.com/tools/csstabs/">
        Adam Kalsey's demo</a> and 
        Matt Raible's <a href="http://strutsmenu.sourceforge.net">Struts Menu</a>
        examples.
    </p>
    <p><strong>How it works</strong><br /><br />
        JavaScript is used to set the active menu when the page first loads. 
        It does this by comparing the current location with the href's
        in the menu's links.  Then it uses current.indexOf(eachLink) and
        matches the first one.  If more than one link matches the current link,
        then the cookie from the last clicked menu is used.
    </p>
</div>
        <ul>
            <li><a href="pageOne.jsp">Example 1</a></li>
            <li><a href="pageTwo.jsp">Example 2</a></li>
            <li><a href="pageThree.jsp">Example 3</a></li>
        </ul>
    </body>
</html>