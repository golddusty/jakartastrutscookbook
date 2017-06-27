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
	
	public String getExpertiseLevel() {
		return expertiseLevel;
	}
	
	public void setExpertiseLevel(String level) {
		expertiseLevel = level;
	}
	
	public List getExpertises() {	
		ArrayList list = new ArrayList();
		list.add( new Expertise("Beginner", "1") );
		list.add( new Expertise("Intermediate", "2") );
		list.add( new Expertise("Expert", "3") );
		list.add( new Expertise("Guru", "4") );
		return list;
	}
	
	/**
	 * @return Returns the reason.
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason The reason to set.
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
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

	private String expertiseLevel;
	private String language;
	private String ide;
	private String reason;
	private List ideList = new ArrayList();
}
