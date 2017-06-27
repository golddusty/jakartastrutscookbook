package com.oreilly.strutsckbk.ch13;

import com.meterware.httpunit.HttpUnitOptions;

import net.sourceforge.jwebunit.TestContext;
import net.sourceforge.jwebunit.WebTestCase;

public class RegistrationWebTest extends WebTestCase {
    public RegistrationWebTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        // disable JavaScript handling
        HttpUnitOptions.setScriptingEnabled(false);
        TestContext testContext = getTestContext();
        testContext.setBaseUrl("http://localhost/jsc-ch13");
        testContext.setResourceBundleName("org.apache.struts.webapp.example.ApplicationResources");
    }
    
    public void testRegistration() {
        // start at the welcome page
        beginAt("/index.jsp");

        // find the registration link and click it
        String regLinkText = getMessage("index.registration");
        clickLinkWithText(regLinkText);

        // check that the registration form is displayed
        assertFormElementPresent("username");

        // use the current time as part of the username for repeatability
        long ts = System.currentTimeMillis();

        // fill out the form
        setFormElement("username","t"+ts);
        setFormElement("password","gotech");
        setFormElement("password2","gotech");
        String fullName = "George P. Burdell";
        setFormElement("fullName", fullName);
        setFormElement("fromAddress","gpburdell@matech.com");
        setFormElement("replyToAddress","gpburdell@matech.com");

        // submit the form
        submit();
        
        // check that the main menu is displayed with the name included
        assertTextPresent(getMessage("mainMenu.heading")+' '+fullName);
    }

    public void tearDown() {
        // logoff to clean up the session
        gotoPage("/Logoff.do");        
    }
}
