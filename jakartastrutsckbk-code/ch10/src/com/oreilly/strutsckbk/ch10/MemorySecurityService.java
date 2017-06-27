package com.oreilly.strutsckbk.ch10;

import java.util.HashMap;
import java.util.Map;

public class MemorySecurityService implements SecurityService {
    
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
