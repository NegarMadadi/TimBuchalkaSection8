package org.example.arrayListChallenge;

public class Contact {
    private String name;
    private String phoneNumebr;

    public Contact(String name, String phoneNumebr) {
        this.name = name;
        this.phoneNumebr = phoneNumebr;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumebr() {
        return phoneNumebr;
    }

    public static Contact createContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}
