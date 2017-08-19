package com.jaholm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Linkedlist in Demo.java
        Customer customer = new Customer("Johan", 54.97);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(403.45);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i < intList.size() ; i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);

        for (int i=0; i < intList.size() ; i++) {
            System.out.println(i + ": " + intList.get(i));
        }


    }
}
