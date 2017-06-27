package com.oreilly.strutsckbk.ch10;

/**
 * An object that can be refreshed from its original source.
 */
public interface Refreshable {

    public void refresh() throws CacheException;
    
}
