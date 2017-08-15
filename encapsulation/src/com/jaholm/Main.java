package com.jaholm;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // encapsulation example.
        /*EnhancedPlayer player = new EnhancedPlayer("hest", 50, "Sverd");
        System.out.println("Initial health is " + player.getHitpoints());*/

        Printer printer = new Printer(100,true);
        printer.printPage(150);

    }
}
