package com.example.smallbuisnessrecords;

public class Customer {
    String name;
    String address;
    Double accountBalance;
    int phoneNumber;

    //constructors
    public Customer(String n, String a, Double ab, int p){
        this.name = n;
        this.address = a;
        this.accountBalance = ab;
        this.phoneNumber = p;
    }
    public Customer(){}

    //setters
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getters
    public Double getAccountBalance() {
        return accountBalance;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
}
