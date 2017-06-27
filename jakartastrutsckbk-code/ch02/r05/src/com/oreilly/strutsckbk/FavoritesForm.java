package com.oreilly.strutsckbk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.struts.action.ActionForm;

public final class FavoritesForm extends ActionForm  {
	
	private static String[] javaIdes = new String[] {"Eclipse", "IDEA", "JBuilder", "JDeveloper", "NetBeans"};
	private static String[] csharpIdes = new String[] {"SharpDevelop", "Visual Studio"};
	
	public FavoritesForm() {
		webLinks = new ArrayList();
		for (int i=0; i<5; i++) webLinks.add(new WebLink()); 
		colors = new String[3];
		colors[0]="Black";
		colors[1]="Blue";
		colors[2]="Red";
	}	

	public String[] getJavaIdes() {return javaIdes;}
	public String[] getCsharpIdes() {return csharpIdes;}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	public String getColor(int index) {
		return colors[index];
	}
	public void setColor(int index, String color) {
		colors[index] = color;
	}
	public String[] getColor() {
		return colors;
	}
	public List getWebLinks() {
		return webLinks;
	}
	public WebLink getWebLink(int index) {
		return (WebLink)webLinks.get(index);
	}
	public void setWebLink(int index, WebLink webLink) {
		webLinks.set(index, webLink);
	}
	
	public void reset() {
		webLinks.clear();
		colors = new String[3];
	}
	
	private List webLinks;
	private String name;		
	private String[] colors;
	private String language;
	private String ide;
}
