package com.company;
import java.util.Scanner;

public class Dog extends Pet {

    private boolean likesWalks;
    private boolean canFetch;
    private String coatType;


    public Dog(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesWalks, boolean canFetch, String coatType) {

        super(ownerName, petName, homeAddress, age, gender);
        this.likesWalks = likesWalks;
        this.canFetch = canFetch;
        this.coatType = coatType;
    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    protected String makeSound() {
        return "woof";
    }

    protected void dogYear(){
        System.out.println(getPetName()+" is " + getAge() + "in human years and " + (getAge()*7) +" in cat years");
    }
}
