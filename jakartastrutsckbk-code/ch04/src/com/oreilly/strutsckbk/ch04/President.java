package com.oreilly.strutsckbk.ch04;

public class President {
	public President(String lname, String fname, String term) {
		lastName = lname;
		firstName = fname;
		this.term = term;		
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

	private String lastName;
	private String firstName;
	private String term;
}
