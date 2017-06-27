package com.oreilly.strutsckbk.ch13;

import org.apache.struts.webapp.example.Constants;
import org.apache.struts.webapp.example.User;

import servletunit.struts.MockStrutsTestCase;

public class SubmitLogonActionTest extends MockStrutsTestCase {

    private static final String ACTION_PATH = "/SubmitLogon";
    
    public SubmitLogonActionTest (String theName) {
        super(theName);
    }

    public void testValidUserLogon() throws Exception {
        addRequestParameter("username", "user");
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
        //verifyInputForward();
    }
}
