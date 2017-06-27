/*
 * Created on May 31, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.oreilly.strutsckbk.ch04;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class MultiboxForm extends ActionForm {

	private String[] languages = new String[] {"Perl", "Python", "Ruby", "Groovy"};
	private String[] chosenLanguages = new String[4];
	
	public String[] getLanguages() {
		return languages;
	}

	public String[] getChosenLanguages() {
		return chosenLanguages;
	}

	public void setChosenLanguages(String[] langs) {
		chosenLanguages = langs;
	}

/*	public void reset( ActionMapping mapping, HttpServletRequest request) {
		languages = new String[4];
		languages[0] = "Perl";
		languages[1] = "Python";
		languages[2] = "Ruby";
		languages[3] = "Groovy";
	}
*/}
