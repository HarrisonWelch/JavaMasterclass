# Lec 80 Constructors Part 2

* You can use setters in the constructor to take advantage of validation, avoid repitition
  * Its NOT common to do this 
* The `this()` fucntion can also be used to omit values in a constructor

## Challenge
* Create a new class VipCustomer
* It should have 3 fields name, credit limit, and email address
* create 3 constructors
  * cons. 1 - empty, call the csontructor with 3 parameters with default values
  * cons. 2 - pass on the 2 values it receives and add a default value for the 3rd
  * cons. 3 - should save all feilds
* Create only getters

## Solution
```java
package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 1000.00, "Default email address");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email address");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
```

Test code in Main.java
```java
VipCustomer person1 = new VipCustomer();
System.out.println(person1.getName());

VipCustomer person2 = new VipCustomer("Bob", 25000.00);
System.out.println(person2.getName());

VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email123.com");
System.out.println(person3.getName());
System.out.println(person3.getEmailAddress());
```

## Next Video
Inheritance
