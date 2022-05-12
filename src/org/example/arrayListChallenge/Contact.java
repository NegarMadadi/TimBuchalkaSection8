package org.example.arrayListChallenge;

public class Contact {
    private String name;
    private String phoneNumebr;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumebr = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumebr() {
        return phoneNumebr;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
