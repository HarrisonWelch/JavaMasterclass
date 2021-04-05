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
