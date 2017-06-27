package com.oreilly.strutsckbk.ch10;

public class Province {
    
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public int getEstablished() {
        return established;
    }
    public void setEstablished(int established) {
        this.established = established;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private String capital;
    private int established;
}
