# Lec 151 The Final Statement

## Final
* `final` stops a variable from being changed

```java
    private final int instanceNumber = 1;

    public SomeClass() {
        instanceNumber = 1; // cannot do with final
    }
```

The MathClass is private to avoid not using the static methods

```java

public final class Math {

    /**
     * Don't let anyone instantiate this class.
     */
    private Math() {}

```

Cannot extend or instantiate the class

```java
Math m = new Math(); // error "'Math()' has private access in 'java.lang.Math'"
```

## Password class example

* Demonstrate static values

```java
package com.lesson._final;

public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}

```

Main.java

```java
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(1241324);
        password.letMeIn(-7);
        password.letMeIn(8);
        password.letMeIn(999999999);
        password.letMeIn(123);
        password.letMeIn(674312);
```

## Problem: we can extend the password to override things and break this code
