package com.jaholm;

public class Player {

    //Example of bad global variabled
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health<=0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
