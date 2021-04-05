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
