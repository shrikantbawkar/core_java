package com.aaiaaba.oops.encapsulation;

public class Customer {

    private String firstName;
    private String lastName;
    private int creditCard;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }
    public int getCreditCard() {
        return creditCard;
    }
    
}
