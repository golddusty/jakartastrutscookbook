package com.oreilly.strutsckbk.ch11.ssl;

public class User {
    public User(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    private String username;
}
