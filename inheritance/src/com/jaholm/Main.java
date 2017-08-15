package com.jaholm;

public class Main {

    public static void main(String[] args) {
        /*Animal animal = new Animal("Animal",1,1,5, 3);
        Dog dog = new Dog("Yorkie", 8,21,2,4, 1,20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();*/

        Opel bilen = new Opel(3);
        bilen.steer(45);
        bilen.accelerate(30);
        bilen.accelerate(20);
        bilen.accelerate(-42);

    }
}
