package com.example.model;

public class PhonebookEntry {
    private int id;
    private String lastname;
    private String phoneNumber;

    public PhonebookEntry(String lastname, String phoneNumber) {
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public PhonebookEntry(int id, String lastname, String phoneNumber) {
        this.id = id;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
