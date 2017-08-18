package com.jaholm;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranches = new ArrayList<Branch>();
    }

    private int searchBranch(String customerName){
        for (int i = 0; i < this.bankBranches.size(); i++) {
            Branch branch = this.bankBranches.get(i);
            if (branch.getBranchName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }

    public boolean addNewBranch(String name){
        if (searchBranch(name)>=0){
            System.out.println(name + " branch already exist on the "
                    + this.bankName + " bank.");
            return false;
        }
        this.bankBranches.add(Branch.createBranch(name));
        return true;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double transactionAmount){
        int foundposition = searchBranch(branchName);
        if (foundposition<0){
            System.out.println("Branch does not exist, can not add customer.");
            return false;
        }

        return this.bankBranches.get(foundposition).addNewCustomer(customerName, transactionAmount);
    }

    public boolean addTransactionToCustomerOnBranch(String branchName, String customerName, double transactionAmount){
        int foundposition = searchBranch(branchName);
        if (foundposition<0){
            System.out.println("Branch does not exist, can not add transaction to customer.");
        }

        return this.bankBranches.get(foundposition).addTransaction(customerName, transactionAmount);
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        int foundposition = searchBranch(branchName);
        if (foundposition<0){
            System.out.println("Branch does not exist, can not list customers.");
            return false;
        }

        Branch branch = bankBranches.get(foundposition);
        System.out.println("Customer details for branch " + branch.getBranchName());
        ArrayList<Customer> branchCustomers = branch.getBranchCustomers();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("--------------------------------");
            System.out.println("Customer: " + branchCustomer.getName() + " [" + i + "]");
            if (showTransactions){
                System.out.println("Transactions:");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for (int j=0; j<transactions.size(); j++){
                    System.out.println("["+(j+1)+"] Amount " + transactions.get(j));
                }
            }
        }
        System.out.println("\n#o#o#o#o#o#o#o#o#o#o#o#o#o#o#o#o#\n");
        return true;
    }
}
