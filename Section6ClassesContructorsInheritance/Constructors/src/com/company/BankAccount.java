package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // Special Use case of "this" keyword.
        // You can call another constructor
        // Required to be the first line of a constructor
        this("56789", 2.50, "Default name", "Default address", "default phone");
        // Now the default constructor is calling the full constructor
        System.out.println("This is a constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        // Shorthand, we only have name, email, phone number
        // use this() to go to the full cons. and pass in default values
        //    non-specified values
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance + ".");
    }

    public void withdraw(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Only $" + this.balance + " available. Withdraw not processed.");
            return;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrawal of $" + withdrawAmount + " made. New balance is $" + this.balance + ".");
    }
}
