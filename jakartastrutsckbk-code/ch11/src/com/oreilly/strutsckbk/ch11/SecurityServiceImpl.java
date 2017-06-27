package com.oreilly.strutsckbk.ch11;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.webapp.example.ExpiredPasswordException;
import org.apache.struts.webapp.example.User;
import org.apache.struts.webapp.example.UserDatabase;

public class SecurityServiceImpl implements SecurityService {

	public SecurityServiceImpl(UserDatabase userDatabase) {
		this.userDatabase = userDatabase;
	}

	public User authenticate(Credentials credentials)
			throws AuthenticationException {
		User user;
        try {
            user = userDatabase.findUser(credentials.getName());
        } catch (ExpiredPasswordException e) {
            throw new AuthenticationException("Password has expired.",e);
        }
        if (user == null) throw new AuthenticationException("Authentication failed");		
		return user;
	}

/*	public void changeCredentials(Credentials oldCredentials, Credentials newCredentials)
			throws AuthenticationException {
		User user = authenticate(oldCredentials);
		.changePassword(user, newCredentials.getPassword());
	}
*/
    private UserDatabase userDatabase;

	private static final Log log = LogFactory.getLog(SecurityServiceImpl.class);

}
