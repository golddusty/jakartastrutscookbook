package com.oreilly.strutsckbk.ch13;

import org.apache.struts.webapp.example.Constants;
import org.apache.struts.webapp.example.User;

import servletunit.struts.CactusStrutsTestCase;

public class SubmitLogonActionCactusTest extends CactusStrutsTestCase {

    private static final String ACTION_PATH = "/SubmitLogon";

    public SubmitLogonActionCactusTest(String testName) {
        super(testName);
    }

    public void testValidUserLogon() throws Exception {
        addRequestParameter("username", "usdder");
        addRequestParameter("password", "pass");

        setRequestPathInfo(ACTION_PATH);
        actionPerform();
    
        verifyNoActionErrors();
        
        User user = (User) getSession().getAttribute(Constants.USER_KEY);
        assertNotNull("User", user);
        assertEquals("Username", "user", user.getUsername());

        verifyForward("success");
    }

    public void testInvalidUserLogon() throws Exception {
        addRequestParameter("username", "junk");
        addRequestParameter("password", "bond");

        setRequestPathInfo(ACTION_PATH);
        actionPerform();
        
        verifyActionErrors(new String[] {"error.password.mismatch"});
        
        verifyForward("logon");
    }

}