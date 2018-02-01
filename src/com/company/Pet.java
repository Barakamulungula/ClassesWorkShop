package com.company;

public class Pet {

    private String ownerName;
    private String petName;
    private long uniqueId;
    private String homeAddress;
    private int age;
    private char gender;

    public long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId() {
        int lower = 1000;
        int higher = 100000;

        this.uniqueId = (int)(Math.random() * (higher-lower)) + lower;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
