package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addBranch("New York");
        bank.addCustomerToBranch("New York", "Susan", 100.00d);
        bank.addCustomerToBranch("New York", "Kerry", 78.50d);

        bank.addBranch("Los Angeles");
        bank.addCustomerToBranch("Los Angeles", "Tom", 123.45d);

        bank.addBranch("Phoenix");
        bank.addCustomerToBranch("Phoenix", "Huey", 12.50d);
        bank.addCustomerToBranch("Phoenix", "Dewey", 12.50d);
        bank.addCustomerToBranch("Phoenix", "Louie", 12.50d);
        bank.addTransaction("Phoenix", "Huey", -12.50d);
        bank.addTransaction("Phoenix", "Dewey", -12.50d);
        bank.addTransaction("Phoenix", "Louie", -12.50d);

        bank.addTransaction("Chicago", "Mark", -100.0d);
        bank.addTransaction("Phoenix", "Mark", -100.0d);

        bank.addCustomerToBranch("Chicago", "Mark", 0.0d);

        bank.showCustomers("New York", true);
        bank.showCustomers("Los Angeles", true);
        bank.showCustomers("Phoenix", true);
    }
}
