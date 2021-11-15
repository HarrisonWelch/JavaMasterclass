# Lecture152FinalPart2andStaticInitializers

* Extend Password to override the methods and allow decrypted password to be shown

```java
package com.lesson._final;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }
}

```

```java

Password password = new ExtendedPassword(pw);
password.storePassword();

password.letMeIn(1);
password.letMeIn(1241324);
password.letMeIn(-7);
password.letMeIn(8);
password.letMeIn(999999999);
password.letMeIn(123);
password.letMeIn(674312);
```

The output shows the password now, oops.

```
Saving password as 674312
Nope, you cannot come in
Nope, you cannot come in
Nope, you cannot come in
Nope, you cannot come in
Nope, you cannot come in
Nope, you cannot come in
Welcome
```

* A method can be made final to deny overriders

Password.java
```java
    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }
```

Now this fails

ExtendedPassword.java
```java
    @Override
    public void storePassword() { // 'storePassword()' cannot override 'storePassword()' in 'com.lesson._final.Password'; overridden method is final
        System.out.println("Saving password as " + this.decryptedPassword);
    }
```

## Static Initializer Block

It looks like this
```java
static {
    // code
}
```

Example

SIBTest.java
```java
package com.lesson._final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB Constructor");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod () {
        System.out.println("someMethod called");
    }
}

```

Main.java

```java
System.out.println("Main method called");
SIBTest test = new SIBTest();
test.someMethod();
System.out.println("Owner is " + test.owner); // BOTH static initializer blocks

SIBTest test2 = new SIBTest();
test2.someMethod();
System.out.println("Owner is " + test2.owner);
```

out

```
Main method called
SIBTest static initialization block called
2nd initialization block called
SIB Constructor
someMethod called
Owner is tim
SIB Constructor
someMethod called
Owner is tim
```

static stuff is setup after being called for the 1st time but never again
