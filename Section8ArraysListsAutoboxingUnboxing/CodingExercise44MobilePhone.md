# Coding Exercise 44 Mobile Phone

## Solution
Main.java
* 
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        MobilePhone mobilePhone = new MobilePhone("1234567");
        System.out.println("Current contacts = ");
        mobilePhone.printContacts();


        boolean c = mobilePhone.addNewContact(Contact.createContact("H","1"));
        System.out.println("c = " + c);

        System.out.println("Current contacts = ");
        mobilePhone.printContacts();
    }
}
```
Contact.java

```java
package com.company;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
```
MobilePhone.java
```java
package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) != -1) {
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) == -1) {
            return false;
        }
        this.myContacts.set(findContact(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) {
            return false;
        }
        this.myContacts.remove(findContact(contact));
        return true;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contact.getName().equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        return this.myContacts.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
```
