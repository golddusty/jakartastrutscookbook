package com.oreilly.strutsckbk.ch10;

import java.net.URL;
import java.util.List;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.xmlrules.DigesterLoader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DigestedList extends RefreshableList {

    private static Log log = LogFactory.getLog(DigestedList.class);

    public DigestedList(List list, URL sourceUrl, URL rulesUrl) {
        this.sourceUrl = sourceUrl;
        this.rulesUrl = rulesUrl;
        this.backingList = list;
    }

    public synchronized void refresh() throws CacheException {
        Digester digester = DigesterLoader.createDigester(rulesUrl);
        try {
            List list = (List) digester.parse(sourceUrl.openStream());
            if (list != null) 
                backingList = list;
            else {
                log.error("Returned list was null due to unknown error");
                throw new CacheException("Backing list was null.");
            }
        } catch (Exception e) {
            log.error("Unable to redigest list.", e);
            throw new CacheException("Unable to redigest list.");
        }
    }

    private URL sourceUrl;
    private URL rulesUrl;
}
