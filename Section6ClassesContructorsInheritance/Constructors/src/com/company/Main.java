package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
//        BankAccount bobsAccount = new BankAccount();
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("+1 (123) 567 - 7890");
        // CONSTRUCTORS CAN MAKE THIS EASIER

        BankAccount bobsAccount = new BankAccount(
                "12345",
                0.00,
                "Bob Brown",
                "myemail@bob.com",
                "+1 (123) 567 - 7890"
        );
        System.out.println("bobsAccount.getAccountNumber() = " + bobsAccount.getAccountNumber());
        System.out.println("bobsAccount.getBalance() = " + bobsAccount.getBalance());

        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100.00); // Should succeed

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "8675309");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email123.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
