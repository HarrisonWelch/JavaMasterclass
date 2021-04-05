# Lec 108 ArrayList Challenge Part 1

## Challenge
* Create a simple program that emulates a mobile phone
* It can:
  * Store, modify, remove, and query contact names
  * Create a separate class for Contacts (name and phone number)
    * Use ArrayList of contancts
* Options: Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact
* When adding or updating be sure to check if the contact already exists (use name)
* Be sure not to expose the inner workings of the ArrayList to MobilePhone
  * No ints, no .get(i) etc
* MobilePhone should do everything with Contact objects only.

## My solution
* Note: Coding Exercise will contain a more optimal verison

Main.java
```java
package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	    // Write your code here
        boolean quit = false;
        int choice = -1;
        printMenu();
        while (!quit) {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContacts();
                    break;
                case 6:
                default:
                    quit = true;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nChoice");
        System.out.println("\t 0 - Print menu again");
        System.out.println("\t 1 - Print contacts");
        System.out.println("\t 2 - Add contact");
        System.out.println("\t 3 - Update contact");
        System.out.println("\t 4 - Remove contact");
        System.out.println("\t 5 - Query contact");
        System.out.println("\t 6 - Quit");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void addContact() {
        String name;
        String phoneNumber;
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();

        mobilePhone.addContact(name, phoneNumber);

    }

    private static void updateContact() {
        String oldName;
        String newName;
        String phoneNumber;
        System.out.print("Enter the old name: ");
        oldName = scanner.nextLine();
        System.out.print("Enter the new name: ");
        newName = scanner.nextLine();
        System.out.print("Enter the new phone number: ");
        phoneNumber = scanner.nextLine();

        mobilePhone.modifyContact(oldName, newName, phoneNumber);
    }

    private static void removeContact() {
        String name;
        System.out.print("What name would you like to remove?: ");
        name = scanner.nextLine();
        mobilePhone.removeContactByName(name);
    }

    private static void queryContacts() {
        String name;
        System.out.print("What name would you like to search for: ");
        name = scanner.nextLine();
        mobilePhone.queryContactsByName(name);
    }
}
```
MobilePhone.java
```java
package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MobilePhone() {
    }

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void printContacts() {
        for (Contact contact : this.contacts) {
            System.out.println(
                    "Contact | " +
                    "Name = " + contact.getName() + ", " +
                    "Phone Number = " + contact.getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber) {
        if (doesNameExist(name)){
            System.out.println("Contact with name " + name + " already exists");
            return;
        }
        this.contacts.add(new Contact(name, phoneNumber));
    }

    public void modifyContact(String oldName, String newName, String newPhoneNumber) {
        int position = getPostionByName(oldName);
        if (position == -1) {
            System.out.println("Cannot modify this contact because it does not exist.");
            return;
        }
        this.contacts.set(position, new Contact(newName, newPhoneNumber));
    }

    public void removeContactByName(String name) {
        int position = getPostionByName(name);
        if (position == -1) {
            System.out.println("The contact does not exist");
            return;
        }
        this.contacts.remove(position);
        System.out.println("Removed contact " + name + " by name");
    }

    public void removeContactByPhoneNumber(String phoneNumber) {
        int position = -1;
        int i = 0;
        for (Contact contact : this.contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                position = i;
            }
            i++;
        }
        if (position == -1) {
            System.out.println("The contact does not exist");
            return;
        }
        this.contacts.remove(position);
        System.out.println("Removed contact with phone number " + phoneNumber + " by name");
    }

    public void queryContactsByName(String name) {
        if (!doesNameExist(name)) {
            System.out.println("Contact with name " + name + " does not exist");
            return;
        }
        System.out.println(
                "Contact | " +
                "Name = " + getContactByName(name).getName() + "," +
                "Phone Number = " + getContactByName(name).getPhoneNumber());
    }

    private int getPostionByName(String name) {
        int position = -1;
        int i = 0;
        for (Contact contact : this.contacts) {
            if (contact.getName().equals(name)) {
                position = i;
            }
            i++;
        }
        return position;
    }

    private int getPostionByPhone(String phoneNumber) {
        int position = -1;
        int i = 0;
        for (Contact contact : this.contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                position = i;
            }
            i++;
        }
        return position;
    }

    private boolean doesNameExist(String name) {
        return getPostionByName(name) != -1;
    }

    private Contact getContactByName(String name) {
        return this.contacts.get(this.getPostionByName(name));
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
}
```
output
```
Choice
	 0 - Print menu again
	 1 - Print contacts
	 2 - Add contact
	 3 - Update contact
	 4 - Remove contact
	 5 - Query contact
	 6 - Quit
Enter choice: 2
Enter name: H
Enter phone number: 1
Enter choice: 2
Enter name: C
Enter phone number: 2
Enter choice: 2
Enter name: M
Enter phone number: 3
Enter choice: 1
Contact | Name = H, Phone Number = 1
Contact | Name = C, Phone Number = 2
Contact | Name = M, Phone Number = 3
Enter choice: 3
Enter the old name: H
Enter the new name: L
Enter the new phone number: 1
Enter choice: 1
Contact | Name = L, Phone Number = 1
Contact | Name = C, Phone Number = 2
Contact | Name = M, Phone Number = 3
Enter choice: 4
What name would you like to remove?: C
Removed contact C by name
Enter choice: 1
Contact | Name = L, Phone Number = 1
Contact | Name = M, Phone Number = 3
Enter choice: 0

Choice
	 0 - Print menu again
	 1 - Print contacts
	 2 - Add contact
	 3 - Update contact
	 4 - Remove contact
	 5 - Query contact
	 6 - Quit
Enter choice: 5
What name would you like to search for: M
Contact | Name = M,Phone Number = 3
Enter choice: 5
What name would you like to search for: V
Contact with name V does not exist
Enter choice: 6

```
