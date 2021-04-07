# Lec 124 Interfaces Part 2

## Notes
* When declaring an object, attempt to make the variable a generic form and then assign it a more specific form
  * `List<Double> dbls = new Vector<>();`

## Make a MobilePhone 
```java
package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on deskphone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
```
Main.java (update only)
```java
        timsPhone = new MobilePhone(24565);
//        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
```
output (update only)
```
Mobile phone not on or number different
```

## Editting the LinkedList class
Add to playlist signature can be made from:
```java
public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
```
to
```java
public boolean addToPlayList(int trackNumber, List<Song> playList) {
```

Then you can declare the playlist like so:
```java
List<Song> playList = new Vector<Song>();
```
instead of using LinkedList
