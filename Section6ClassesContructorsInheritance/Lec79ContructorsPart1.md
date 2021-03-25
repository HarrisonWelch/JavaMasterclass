# Lec 79 Contructors Part 1

## Start with a Challenge
* Create new class BankAccount
* Fields: account number, balance, customer name, email, phone number.
* Normal getters and setters
* Method deposit funds
  * increment balance
* Method withdraw funds
  * deduct balance
  * do not allow if insufficient funds

## Java
Main.java

```java
package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance + ".");
    }

    public void withdraw(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Only $" + this.balance + " available. Withdraw not processed.");
            return;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrawal of $" + withdrawAmount + " made. New balance is $" + this.balance + ".");
    }
}
```
BankAccount.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.setPhoneNumber("+1 (123) 567 - 7890");
        // CONSTRUCTORS CAN MAKE THIS EASIER

        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100.00); // Should fail

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100.00); // Should succeed
    }
}

```

## Constructors
Main
```java
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
    }
}
```
BankAccount.java
```java
package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // Special Use case of "this" keyword.
        // You can call another constructor
        // Required to be the first line of a constructor
        this("56789", 2.50, "Default name", "Default address", "default phone");
        // Now the default constructor is calling the full constructor
        System.out.println("This is a constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance + ".");
    }

    public void withdraw(double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("Only $" + this.balance + " available. Withdraw not processed.");
            return;
        }
        this.balance -= withdrawAmount;
        System.out.println("Withdrawal of $" + withdrawAmount + " made. New balance is $" + this.balance + ".");
    }
}
```