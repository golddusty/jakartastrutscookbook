package com.oreilly.strutsckbk.ch13;

import net.sourceforge.jwebunit.TestContext;
import net.sourceforge.jwebunit.WebTestCase;

public class SimpleWebTest extends WebTestCase {

    public SimpleWebTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        TestContext testContext = getTestContext();
        testContext.setBaseUrl("http://localhost/jsc-ch13");
        testContext.setResourceBundleName(
            "org.apache.struts.webapp.example.ApplicationResources"
        );
    }
    
    public void testAppAvailable() {
        beginAt("/index.jsp");
        assertTitleEqualsKey("index.title");
    }
}
