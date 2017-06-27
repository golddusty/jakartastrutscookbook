package com.oreilly.strutsckbk.ch13;

import org.apache.struts.Globals;
import servletunit.struts.MockStrutsTestCase;

public class EditRegistrationActionTest extends MockStrutsTestCase {

    private static final String ACTION_PATH = "/EditRegistration";
    
    public EditRegistrationActionTest (String theName) {
        super(theName);
    }

    public void setUp() throws Exception {
        super.setUp();
        setConfigFile("/WEB-INF/struts-config-registration.xml");
        setRequestPathInfo(ACTION_PATH);
    }
    
    public void testCreateRegistration() throws Exception {
        addRequestParameter("action", "Create");

        actionPerform();

        String token = (String) getRequest().getAttribute(Globals.TRANSACTION_TOKEN_KEY);
        assertNotNull(token, "Token was not saved");

        verifyForward("success");
    }
}
