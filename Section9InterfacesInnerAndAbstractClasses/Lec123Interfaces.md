# Lec 123 Interfaces

## Interfaces
* An interfaces specifies methods a class must implement if a class implements said interfaces
* You MUST implement all methods
  * if one is not ned
* IntelliJ can do some of this for you

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        DeskPhone timsPhone;
        timsPhone = new DeskPhone(1234567);
        timsPhone.powerOn();
        timsPhone.callPhone(9876543);
        timsPhone.answer();
    }
}
```
Interface ITelephone.java
```java
package com.company;

public interface ITelephone { // Note the use of "interface" instead of class
    // access modifiers are useless here. This is elected at implementation
    void powerOn();
    void dial(int phoneNumber); // defining the "signature" (params & return type(s))
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
```
DeskPhone.java
```java
package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
```
