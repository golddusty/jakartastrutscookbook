package com.oreilly.strutsckbk.ch11.ams;


/**
 * A service for performing security-related operations.
 * @author Bill Siggelkow
 */
public interface SecurityService {

	public User authenticate(String username, String password)
		throws SecurityException;

}
