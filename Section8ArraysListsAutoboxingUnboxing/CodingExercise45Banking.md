# Coding Exercise 45 Banking

## Code
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        boolean b = bank.addCustomer("Adelaide", "Percy", 220.12);
//        System.out.println("b = " + b);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
//
        bank.listCustomers("Adelaide", false);

    }
}
```
Bank.java
```java
package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            for (Customer customer : branch.getCustomers()){
                if (customer.getName().equals(customerName)) {
                    return false;
                }
            }
            branch.newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null){
            for (Customer customer : branch.getCustomers()) {
                if(customer.getName().equals(customerName)){
                    customer.addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + branchName);
        int i = 0;
        int j = 0;
        for (Customer customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName()+"["+(i+1)+"]");
            if (printTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();
                j = 0;
                for (Double dbl : transactions) {
                    System.out.println("[" + (j+1) + "]  Amount " + dbl);
                    j++;
                }
            }
            i++;
        }
        return true;
    }
}
```
Branch.java
```java
package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : this.customers){
            if(customer.getName().equals(customerName)) return customer;
        }
        return null;
    }
}
```
Customer.java
```java
package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
```
