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
