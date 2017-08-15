package com.jaholm;

public class Hamburger {
    private String rollType;
    private String meat;
    private double price;
    private boolean hasLettuce = false;
    private boolean hasTomato = false;
    private boolean hasOnion = false;
    private boolean hasCheese = false;

    public Hamburger(String rollType, String meat, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addPrice(double amount){
        price += amount;
    }

    public void checkOrder(){
        if (hasLettuce) System.out.println("Burger contains Lettuce.");
        if (hasTomato) System.out.println("Burger contains Tomato.");
        if (hasOnion) System.out.println("Burger contains Onion.");
        if (hasCheese) System.out.println("Burger contains Cheese.");
        System.out.println("############################");
        System.out.println("The current price is $" + price);
    }


    public void addLettuce(){
        hasLettuce = true;
        addPrice(0.25);
    }
    public void addTomato(){
        hasTomato = true;
        addPrice(0.25);
    }
    public void addOnion(){
        hasOnion = true;
        addPrice(0.25);
    }
    public void addCheese(){
        hasCheese = true;
        addPrice(0.5);
    }

}

