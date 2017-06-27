package com.oreilly.strutsckbk.ch08;

public class OrderLine {
    
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getQuantity() {
        return quantity;
    }

    private String partNumber;
    private String quantity;
}
