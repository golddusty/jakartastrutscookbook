/*
 * Created on May 4, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.oreilly.strutsckbk;

/**
 * @author Bill Siggelkow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class Expertise {

	public Expertise(String name, String level) {
		this.name = name;
		this.level = level;
	}
	
	private String name;
	private String level;
	/**
	 * @return Returns the level.
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level The level to set.
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
