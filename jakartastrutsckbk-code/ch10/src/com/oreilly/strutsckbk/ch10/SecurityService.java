package com.oreilly.strutsckbk.ch10;

public interface SecurityService {
    
    public void authenticate(String username, String password) throws UnknownUserException, PasswordMatchException;

    public void add(User user) throws DuplicateUsernameException;
    
}
