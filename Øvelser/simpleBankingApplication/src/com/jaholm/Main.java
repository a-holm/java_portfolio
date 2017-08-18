package com.jaholm;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("DNB Nor");

        bank.addNewBranch("Drammen");

        bank.addCustomerToBranch("Drammen", "Johan Holm", 15.10);
        bank.addCustomerToBranch("Drammen", "Hest Vantmiki", 7815.10);
        bank.addCustomerToBranch("Drammen", "Tristan Vindtorn", 209.30);

        bank.addNewBranch("Ålesund");
        bank.addCustomerToBranch("Ålesund", "Hulk Hogan", 765.70);
        bank.addCustomerToBranch("Ålesund", "Linus Torvalds", 998389.2);

        bank.addTransactionToCustomerOnBranch("Drammen", "Johan Holm", 902.3);
        bank.addTransactionToCustomerOnBranch("Drammen", "Johan Holm", 90991.2);
        bank.addTransactionToCustomerOnBranch("Drammen", "Tristan Vindtorn", 91.2);

        bank.listCustomers("Drammen", true);
        bank.listCustomers("Ålesund", true);

        bank.addNewBranch("Drammen");

    }
}
