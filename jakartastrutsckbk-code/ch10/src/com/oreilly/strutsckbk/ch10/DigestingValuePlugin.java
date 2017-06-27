package com.oreilly.strutsckbk.ch10;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.plugins.DigestingPlugIn;

public class DigestingValuePlugin extends DigestingPlugIn {

    private static Log log = LogFactory.getLog(DigestingValuePlugin.class);

    protected void storeGeneratedObject(Object obj) {
        URL sourceUrl =  null;
        URL rulesUrl =  null;
        try {
            sourceUrl = getConfigURL(configPath, configSource);
            rulesUrl = getConfigURL(digesterPath, digesterSource);
            DigestedValue digestedValue = new DigestedValue(obj, sourceUrl, rulesUrl );
            servlet.getServletContext().setAttribute(key, digestedValue);
        } catch (IOException e) {
            log.error("Unable to create URL.", e);
        }
    }
}
