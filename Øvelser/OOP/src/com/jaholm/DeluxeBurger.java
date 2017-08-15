package com.jaholm;

public class DeluxeBurger extends Hamburger{
    private boolean hasChips;
    private boolean hasDrink;

    public DeluxeBurger(boolean hasChips, boolean hasDrink) {
        super("fancy", "Entrecôte", 50.0);
        if (hasChips){
            this.hasChips = hasChips;
            super.addPrice(1);
        }
        if (hasDrink){
            this.hasDrink = hasDrink;
            super.addPrice(1);
        }
    }

    @Override
    public void checkOrder() {
        if (hasChips) System.out.println("Order has chips.");
        if (hasDrink) System.out.println("Order has drink.");
        super.checkOrder();
    }

    @Override
    public void addLettuce() {
        System.out.println("Can not add any more additions");
    }

    @Override
    public void addTomato() {
        System.out.println("Can not add any more additions");
    }

    @Override
    public void addOnion() {
        System.out.println("Can not add any more additions");
    }

    @Override
    public void addCheese() {
        System.out.println("Can not add any more additions");
    }
}
