package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    // Instructor included the initial transaction in the constructor
    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
    }

    public void addTransaction(double transactionAmount) {
        this.transactions.add(transactionAmount); // Auto-boxing
    }

    public String getCustomerName() {
        return customerName;
    }

    public void printTransactions() {
        for (Double dbl : this.transactions) {
            System.out.println("Transaction | Amount = " + dbl);
        }
    }
}
