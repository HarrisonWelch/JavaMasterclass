package com.lesson.accessmodifiers;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.deposit(500);
        timsAccount.deposit(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();

        //        timsAccount.balance = 100000;
        //        timsAccount.transactions.add(1000);

        System.out.println("Balance on account is " + timsAccount.getBalance());
    }
}
