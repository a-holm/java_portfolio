package com.jaholm;

public class VipCostumer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    VipCostumer(){
        this("Default name", 100, "Defailt email");
    }

    VipCostumer(String name, String emailAddress){
        this(name, 0, emailAddress);
    }

    VipCostumer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
