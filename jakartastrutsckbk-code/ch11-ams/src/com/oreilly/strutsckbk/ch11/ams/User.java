package com.oreilly.strutsckbk.ch11.ams;

public class User {
    
    
    public User(String username) {
        this.username = username;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(String username, String password, String[] roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public boolean hasRole(String role) {
        for (int i=0;i<roles.length;i++) {
            if (role.equals(roles[i])) return true;
        }
        return false;
    }

    protected boolean matchPassword(String pwd) {
        return password.equals(pwd);
    }
    
    private String username;
    private String password;
    private String[] roles;
}
