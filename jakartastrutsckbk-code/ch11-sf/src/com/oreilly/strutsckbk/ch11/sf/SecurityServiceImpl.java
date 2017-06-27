package com.oreilly.strutsckbk.ch11.sf;

import java.util.HashMap;
import java.util.Map;

public class SecurityServiceImpl implements SecurityService {

    private Map users = new HashMap();
    
    public SecurityServiceImpl() {
        users.put("gpburdell", new User("gpburdell", "gotech",new String[]{"jscUser"}));
        users.put("bsiggelkow", new User("bsiggelkow", "crazybill",new String[]{"jscUser","jscAdmin"}));
        users.put("jmitchell", new User("jmitchell", "helga",new String[]{"jscAdmin"}));
        users.put("thusted", new User("thusted", "thebear"));
	}

	public User authenticate(String username, String password)
			throws SecurityException {
        User user = (User) users.get(username);
        if (user == null) throw new UnknownUserException();
        if (!user.matchPassword(password)) throw new AuthenticationException();
        return user;
	}
    public User findUser(String username) {
        return (User) users.get(username);
    }
}
