package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer, double initialTransactionAmount) {
        // Instructor also added validation that a customer with the same name cannot be added
        customer.addTransaction(initialTransactionAmount);
        this.customers.add(customer);
    }

    public void addCustomer(String customerName, double initialTransactionAmount) {
        // Instructor also added validation that a customer with the same name cannot be added
        Customer customer = new Customer(customerName);
        customer.addTransaction(initialTransactionAmount);
        this.customers.add(customer);
    }

    public void addTransactionsForCustomer(String customerName, ArrayList<Double> transactions) {
        Customer customer = this.getCustomer(customerName);
        // Instructor also added validation that the customer must exist
        for (int i = 0; i < transactions.size(); i++) {
            customer.addTransaction(transactions.get(i));
        }
    }

    public void addTransactionForCustomer(String customerName, Double transactionAmount) {
        Customer customer = this.getCustomer(customerName);
        // Instructor also added validation that the customer must exist
        customer.addTransaction(transactionAmount);
    }

    public Customer getCustomer(String customerName) {
        for(Customer customer : this.customers) {
            if (customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public void printCustomers(boolean printTransactions) {
        for (Customer customer : this.customers) {
            System.out.println("Customer | Name = " + customer.getCustomerName());
            if (printTransactions) {
                customer.printTransactions();
            }
        }

    }
}
