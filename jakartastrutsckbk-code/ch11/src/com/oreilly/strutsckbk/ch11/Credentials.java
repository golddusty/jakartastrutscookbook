/*
 * Created on Sep 11, 2003
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.oreilly.strutsckbk.ch11;

/**
 * Credential
 * 
 * @author Bill Siggelkow
 */
public class Credentials {

	/**
	 * Creates a credential from an encrypted credentials string encrypted using
	 * {@link #encryptToString(String) encryptToString}.
	 * @param encryptedCredentials Encrypted credentials string.
	 */
	Credentials(String encryptedCredentials) {
		decryptFromString(encryptedCredentials);
	}

	/**
	 * Creates a new credential for the given name and password.
	 */
	public Credentials(String name, String password) {
		this.name = name;
		this.password = password;
	}

	String encryptToString() {
		return name + ':' + password;
	}

	private void decryptFromString(String encryptedCredentials) {
		int separatorIndex = encryptedCredentials.indexOf(":");
		name =  encryptedCredentials.substring(0, separatorIndex);
		password =  encryptedCredentials.substring(separatorIndex+1);
	}
	
	String getName() {
		return name;
	}
	
	String getPassword() {
		return password;
	}

	private String name;
	private String password;

}
