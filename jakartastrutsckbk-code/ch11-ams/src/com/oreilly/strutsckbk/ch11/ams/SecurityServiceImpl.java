package com.oreilly.strutsckbk.ch11.ams;

import java.util.HashMap;
import java.util.Map;

public class SecurityServiceImpl implements SecurityService {

    private Map users = new HashMap();
    
    public SecurityServiceImpl() {
        users.put("gpburdell", new User("gpburdell", "gotech",new String[]{"manager"}));
        users.put("bsiggelkow", new User("bsiggelkow", "crazybill",new String[]{"manager"}));
        users.put("jmitchell", new User("jmitchell", "helga",new String[]{"admin"}));
        users.put("thusted", new User("thusted", "thebear"));
	}

	public User authenticate(String username, String password)
			throws SecurityException {
        User user = (User) users.get(username);
        if (user == null) throw new UnknownUserException();
        if (!user.matchPassword(password)) throw new AuthenticationException();
        return user;
	}
}
