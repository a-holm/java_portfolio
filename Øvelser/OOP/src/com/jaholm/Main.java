package com.jaholm;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("brød", "biff", 32.3);
        hamburger.addCheese();
        hamburger.addLettuce();
        hamburger.addOnion();
        hamburger.addTomato();
        hamburger.checkOrder();

        DeluxeBurger deluxeburger = new DeluxeBurger(true, false);
        deluxeburger.checkOrder();

    }
}
