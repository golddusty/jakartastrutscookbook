package com.oreilly.strutsckbk.ch11.sf;

import org.securityfilter.realm.SimpleSecurityRealmBase;

public class MemorySecurityRealm extends SimpleSecurityRealmBase {

   private SecurityService serviceImpl = new SecurityServiceImpl();

   public boolean booleanAuthenticate(String username, String password) {
       try {
           User user = serviceImpl.authenticate(username, password);
           if (user != null) return true;
       } catch (SecurityException e) {
           e.printStackTrace();
       }
       return false;
   }

   public boolean isUserInRole(String username, String role) {
       User user = serviceImpl.findUser(username);
       return user == null ? false : user.hasRole(role);
   }
}
