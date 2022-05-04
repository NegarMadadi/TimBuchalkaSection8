package org.example.arrayListChallenge;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private List<Contact> myContacts = new ArrayList<>();
    private String myNumber;

    public MobilePhone(List<Contact> myContacts, String myNumber) {
        this.myContacts = myContacts;
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        return !myContacts.contains(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.remove(oldContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        }
        return -1;
    }

    private int findContact(String contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        }
        return -1;
    }

    public Contact queryContact(String contact) {
        if (myContacts.contains(contact)) {
            return Contact;
        } else return null;
    }

    public void printContacts() {
        System.out.println("Contact List: ");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(myContacts.get(i));
        }
    }
}

