package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // bound together

        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance()); // Balance for customer Tim is 12.18
        // Note that we changed customer by changing anotherCustomer

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " " + intList.get(i));
        }

        // Insertion
        // ArrayList insertion is inefficient
        // LinkList insertion is near instantaneous

    }
}
