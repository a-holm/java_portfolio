package com.jaholm;

public class Account {
    private int accountNum;
    private double balance;
    private String custName;
    private String custEmail;
    private String custPhoneNum;

    public Account() {
        this(123345, 2.5,
                "Default name", "Default email",
                "defauilt phone");
    }

    public Account(
            int accountNum,
            double balance,
            String custName,
            String custEmail,
            String custPhoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhoneNum = custPhoneNum;
    }

    public Account(String custName, String custEmail, String custPhoneNum) {
        this(99999, 0.0, custName, custEmail, custPhoneNum);
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPhoneNum() {
        return custPhoneNum;
    }

    public void setCustPhoneNum(String custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }

    public void deposit(double amountDeposit) {
        setBalance(getBalance() + amountDeposit);
    }

    public double withdrawal(double amountWithdrawal) {
        if (amountWithdrawal > getBalance()) {
            System.out.println("Insufficient funds, there is only $" + this.balance + " left.");
            return 0.0;
        } else {
            setBalance(getBalance() - amountWithdrawal);
            System.out.println("Withdrawn $" + amountWithdrawal + " the new balance is $" + getBalance() + ".");
            return amountWithdrawal;
        }

    }
}
