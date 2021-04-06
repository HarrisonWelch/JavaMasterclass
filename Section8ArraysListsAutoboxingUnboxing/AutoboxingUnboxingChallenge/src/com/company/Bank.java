package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }
    public void addBranch(String branchName) {
        Branch branch = new Branch(branchName);
        this.branches.add(branch);
    }

    public void addCustomerToBranch(String branchName, Customer customer, double initialTransaction) {
        Branch branch = this.getBranch(branchName);
        if (branch == null) {
            System.out.println("Could not add customer " + customer.getCustomerName() +
                    " to bank branch " + branchName + ". Branch " + branchName + " not found.");
            return;
        }
        branch.addCustomer(customer, initialTransaction);
    }

    public void addCustomerToBranch(String branchName, String customerName, double initialTransaction) {
        Branch branch = this.getBranch(branchName);
        if (branch == null) {
            System.out.println("Could not add customer " + customerName +
                    " to bank branch " + branchName + ". Branch " + branchName + " not found.");
            return;
        }
        branch.addCustomer(customerName, initialTransaction);
    }

    private Branch getBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public void addTransaction(String branchName, String customerName, double transactionAmout) {
        Branch targetBranch = getBranch(branchName);
        if (targetBranch == null) {
            System.out.println("Could not add transaction " + transactionAmout + " " + customerName +
                    " to bank branch " + branchName + ". Branch " + branchName + " not found.");
            return;
        }
        Customer targetCustomer = targetBranch.getCustomer(customerName);
        if (targetCustomer == null) {
            System.out.println("Could not add transaction " + transactionAmout + " from customer " + customerName +
                    " to bank branch " + branchName + ". Customer " + customerName + " not found.");
            return;
        }

        targetCustomer.addTransaction(transactionAmout);

    }

    public void showCustomers(String branchName, boolean printTransactions) {
        Branch branch = getBranch(branchName);
        // Instructor also added validation that the branch m1ust exist
        branch.printCustomers(printTransactions);
    }
}
