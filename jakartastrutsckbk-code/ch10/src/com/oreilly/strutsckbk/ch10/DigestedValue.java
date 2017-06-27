package com.oreilly.strutsckbk.ch10;

import java.net.URL;
import java.util.List;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.xmlrules.DigesterLoader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DigestedValue implements Refreshable {

    private static Log log = LogFactory.getLog(DigestedValue.class);

    public DigestedValue(Object value, URL sourceUrl, URL rulesUrl) {
        this.sourceUrl = sourceUrl;
        this.rulesUrl = rulesUrl;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
    
    public synchronized void refresh() {
        Digester digester = DigesterLoader.createDigester(rulesUrl);
        try {
            Object val = digester.parse(sourceUrl.openStream());
            if (val != null) 
                value = val;
            else
                log.error("Returned value was null due to unknown error");
        } catch (Exception e) {
            log.error("Unable to redigest value.", e);
        }
    }

    private Object value;
    private URL sourceUrl;
    private URL rulesUrl;
}
