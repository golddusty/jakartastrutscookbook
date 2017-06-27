package com.oreilly.strutsckbk;

public class Month {
	private String name;
	private String abbreviation;
	public Month(String name, String abbreviation) {
		this.name=name;
		this.abbreviation = abbreviation;
	}
	public String getName() {
		return name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public String toString() {
		return name;
	}
}
