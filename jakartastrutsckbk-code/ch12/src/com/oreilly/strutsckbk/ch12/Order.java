package com.oreilly.strutsckbk.ch12;

import java.util.Date;

public class Order {

    
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Date getDatePlaced() {
        return datePlaced;
    }
    public void setDatePlaced(Date datePlaced) {
        this.datePlaced = datePlaced;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    private String partNumber;
    private Integer quantity;
    private Date datePlaced;
    private Double amount;
}
