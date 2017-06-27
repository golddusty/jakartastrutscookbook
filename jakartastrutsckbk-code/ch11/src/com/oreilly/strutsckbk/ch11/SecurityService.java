package com.oreilly.strutsckbk.ch11;

import org.apache.struts.webapp.example.User;

/**
 * A service for performing security-related operations.
 * @author Bill Siggelkow
 */
public interface SecurityService {

	public User authenticate(Credentials credentials)
		throws AuthenticationException;

/*	public void changeCredentials(Credentials oldCredentials, Credentials newCredentials)
		throws AuthenticationException;
*/}
