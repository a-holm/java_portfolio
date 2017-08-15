package com.jaholm;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    public void brake() {
        System.out.println("Car -> brake()");
    }
}

class Mitchubishi extends Car {
    public Mitchubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitchubishi -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitchubishi -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Mitchubishi -> brake()");
    }
}
