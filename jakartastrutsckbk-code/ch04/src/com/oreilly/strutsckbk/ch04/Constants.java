package com.oreilly.strutsckbk.ch04;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts.Globals;

public class Constants {
	private Map strutsGlobals;
	
	public Constants() {
		strutsGlobals = new HashMap();
		strutsGlobals.put( "ACTION_SERVLET_KEY", Globals.ACTION_SERVLET_KEY );
		strutsGlobals.put( "SERVLET_KEY", Globals.SERVLET_KEY );
	}
	
	public Map getStrutsGlobals() {
		return strutsGlobals;
	}
	public void setStrutsGlobals(Map strutsGlobals) {
		this.strutsGlobals = strutsGlobals;
	}
}
