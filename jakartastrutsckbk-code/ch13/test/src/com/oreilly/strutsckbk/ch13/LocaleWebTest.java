package com.oreilly.strutsckbk.ch13;

import java.util.Locale;

import net.sourceforge.jwebunit.TestContext;
import net.sourceforge.jwebunit.WebTestCase;

public class LocaleWebTest extends WebTestCase {

    public LocaleWebTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        testContext = getTestContext();
        testContext.setBaseUrl("http://localhost/jsc-ch13");
        testContext.setResourceBundleName(
            "org.apache.struts.webapp.example.ApplicationResources"
        );
    }
    
    public void testRussian() {
        testContext.setLocale(new Locale("ru"));
        testContext.getWebClient().setHeaderField("Accept-Language","ru");
        beginAt("/index.jsp");
        assertTitleEqualsKey("index.title");
    }
    
    private TestContext testContext;
}
