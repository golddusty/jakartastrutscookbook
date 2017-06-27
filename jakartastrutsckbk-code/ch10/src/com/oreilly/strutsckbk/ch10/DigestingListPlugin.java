package com.oreilly.strutsckbk.ch10;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.plugins.DigestingPlugIn;

public class DigestingListPlugin extends DigestingPlugIn {

    private static Log log = LogFactory.getLog(DigestingPlugIn.class);

    public DigestingListPlugin() {
    }

    protected void storeGeneratedObject(Object obj) {
        if (!(obj instanceof List)) throw new IllegalArgumentException("Digested object must be a list but is:"+obj);
        List list = (List) obj;
        URL sourceUrl =  null;
        URL rulesUrl =  null;
        try {
            sourceUrl = getConfigURL(configPath, configSource);
            rulesUrl = getConfigURL(digesterPath, digesterSource);
            DigestedList digestedList = new DigestedList(list, sourceUrl, rulesUrl );
            servlet.getServletContext().setAttribute(key, digestedList);
        } catch (IOException e) {
            log.error("Unable to create URL.", e);
        }
    }
}
