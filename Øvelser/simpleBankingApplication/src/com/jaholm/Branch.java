package com.jaholm;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String name) {
        this.branchName = name;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    private int searchCustomer(Customer customer) {
        //index or -1 if not there
        return this.branchCustomers.indexOf(customer);
    }

    private int searchCustomer(String customerName) {
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            Customer customer = this.branchCustomers.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewCustomer(String name, double initialTransactionAmount) {
        if (searchCustomer(name) >= 0) {
            System.out.println("Name already exist on the " + this.branchName + " branch.");
            return false;
        }
        Customer newCustomer = Customer.createCustomer(name, initialTransactionAmount);
        this.branchCustomers.add(newCustomer);
        return true;
    }

    public boolean addTransaction(String customerName, double transactionAmount) {
        int foundposition = searchCustomer(customerName);
        if (foundposition < 0) {
            System.out.println("Name does not exist on the " + this.branchName + " branch.");
            return false;
        }
        this.branchCustomers.get(foundposition).addTransaction(transactionAmount);
        System.out.println("A $" + transactionAmount +
                " transaction added to " + customerName + "'s account.");
        return true;
    }

    public static Branch createBranch(String name) {
        return new Branch(name);
    }


}
