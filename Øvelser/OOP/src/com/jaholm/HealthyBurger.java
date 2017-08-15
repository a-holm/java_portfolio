package com.jaholm;

public class HealthyBurger extends Hamburger {
    private boolean hasKale;
    private boolean hasSeaweed;

    public HealthyBurger(boolean hasKale, boolean hasSeaweed) {
        super("Portobello Mushroom", "vegetarian", 40);
        if (hasKale) addKale();
        if (hasSeaweed) addSeaweed();
    }

    @Override
    public void checkOrder() {
        if (hasKale) System.out.println("Burger contains Kale.");
        if (hasSeaweed) System.out.println("Burger contains Seaweed.");
        super.checkOrder();
    }

    public void addKale() {
        hasKale = hasKale;
        super.addPrice(0.25);
    }

    public void addSeaweed() {
        hasSeaweed = hasSeaweed;
        super.addPrice(0.25);
    }

}
