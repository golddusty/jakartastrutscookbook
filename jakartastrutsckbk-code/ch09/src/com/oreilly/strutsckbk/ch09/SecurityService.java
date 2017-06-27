/*
 * Created on Jul 31, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.oreilly.strutsckbk.ch09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bill Siggelkow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SecurityService {
    
    public void authenticate(String username, String password) throws UnknownUserException, PasswordMatchException {
        if (users.get(username) == null) { 
            throw new UnknownUserException();
        } else if (!users.get(username).equals(password)) {
            throw new PasswordMatchException();
        }
        return;
    }

    public void add(User user) throws DuplicateUsernameException {
        if (users.containsKey(user.getUsername())) throw new DuplicateUsernameException();
        users.put(user.getUsername(),user.getPassword());
    }
    
    private static Map users;
    static {
        users = new HashMap();
        users.put("gpburdell","gotech");
        users.put("fflintstone","yabbadabbado");
        users.put("mpython","nopuftas");
    }
    

}
