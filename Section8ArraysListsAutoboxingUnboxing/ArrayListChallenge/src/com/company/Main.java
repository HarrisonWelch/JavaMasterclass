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
