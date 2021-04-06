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
