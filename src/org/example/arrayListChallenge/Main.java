package org.example.arrayListChallenge;

//Create a program that implements a simple mobile phone with the following capabilities.
//
//1.Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
//
// Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
//
// A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
//
// And seven methods, they are (their functions are in their names):
//
// addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
//
//updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
//
// removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
//
// findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
//
// findContact(), same as above, only it has one parameter of type String.
//
// queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
//
// printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
//
//Contact List:
//1. Bob -> 31415926
//2. Alice -> 16180339
//3. Tom -> 11235813
//4. Jane -> 23571113
//
//2. Implement the Contact class with the following attributes:
//
// Two fields, both String, one called name and the other phoneNumber.
//
// A constructor that takes two Strings, and initialises name and phoneNumber.
//
//And Three methods, they are:
//
// getName(), getter for name.
//
// getPhoneNumber(), getter for phoneNumber.
//
//createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.
//
//TIP:In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.
//
//TIP:Two Contact objects are equal if they have the same name.
//
//TIP: Be extremely careful about spaces in the printed message.
//
//.NOTE: All fields are private.
//
//NOTE: Constructors should be defined as public.
//
//NOTE:All methods should be defined as public (except for the two findContact() methods which are private).
//
//NOTE: Do not add a main method to the solution code.
//
//NOTE:If you get an error from the evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0914 315 8376");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Print new comtact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully update record");

        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumebr());
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added : name" + name + ", phone = " + phone);
        } else {
            System.out.println("Can not add, " + name + "already on file");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable  actions : \npress");
        System.out.println("0 _ To shutdown \n" +
                "1 _ print contacts\n" +
                "2 _ to add a new contact\n" +
                "3 _ to update an existing contact\n" +
                "4 _ to remove an existing contact\n" +
                "5 _ query if an existing contact exists\n" +
                "6 _ to print a list of available actions.");
        System.out.println("choose your action: ");
    }
}
