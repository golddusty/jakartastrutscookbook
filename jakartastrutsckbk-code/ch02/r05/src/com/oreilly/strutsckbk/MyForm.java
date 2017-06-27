package com.oreilly.strutsckbk;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public final class MyForm extends ActionForm  {
	
	private static String[] javaIdes = 
		new String[] {"Eclipse", "IDEA", "JBuilder", 
			           "JDeveloper", "NetBeans"};
	private static String[] csharpIdes = 
		new String[] {"SharpDevelop", "Visual Studio"};
	
	public String[] getJavaIdes() {return javaIdes;}
	public String[] getCsharpIdes() {return csharpIdes;}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}

	public List getIdes() {
		return ideList;
	}
	
	public void setIdes(List ides) {
		ideList = ides;
	}
	private String language;
	private String ide;
	private List ideList = new ArrayList();
}
