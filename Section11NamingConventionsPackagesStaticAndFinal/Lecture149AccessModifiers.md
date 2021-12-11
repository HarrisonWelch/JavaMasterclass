# Lecture 149 Access Modifiers

```java
package com.lesson.accessmodifiers;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance " + this.balance);
    }
}
```

The account info is all public
* So you can: `timsAccount.balance = 100000;`

## Top Level
* Only classes, interfaces, and enums can exist at the top level, everything else must be included within one of these.
* public: the object is visible to all classes everywhere, whether they are in the same package or have imported the package containing the public class.
* Package-private: the object is only available within its own package (and is visible to every class within the same package). Package-private is specified by not specifying, i.e. it is the default if you ddo not specify public. There is not a "package-private" keyword.

### Public Class example

```java
public class PublicClass {

    public PublicClass {

    }
}

```

### Public Interface

```java
public interface PublicInterface {

}
```

### Package-Private Class example

```java
class PackagePrivateClass {

    public PackagePrivateClass {

    }
}

```

### Package-Private Interface example

```java
interface PackagePrivateInterface {

}

```

## Member Level
* `public`: at the member level, public has the same meaning as at the top level. A public member (or field) and public method can be accessed from any other class anywhere, even in a different package.
* `Package-private`: this also has the same meaning as it does at the top level. An object access modifier is visible to every class within the same package (but not to classes in external packages).
* `private`: the object is only visible within the class it is declared. It is not visible anywhere else (including in subclasses of its class).
* `Protected`: the object is visible anywhere in its own package (like package-private) but also in subclasses even if they are in another package.


