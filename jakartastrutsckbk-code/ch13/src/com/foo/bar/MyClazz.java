package com.foo.bar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyClazz {

    private static Log log = LogFactory.getLog(MyClazz.class);

    public void doSomething() {
        log.debug("About to do something.");
        try {
            //call something that throws an exception
        } catch (Exception e) {
            log.error("An exception occured doing something.", e);
        }
        log.info("Successfully did something.");
    }
}
