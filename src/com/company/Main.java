package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Cat cat = new Cat("Baraka","Garfield","123 Something ST", 6, 'M',true,true, "Ginger");

        System.out.println(cat.catYear());

        Dog dog = new Dog("Baraka","Scooby","123 Something ST", 6, 'M',true,true, "Brown");

        System.out.println(dog.inDogYears());

        System.out.printf("Dog's name: %s ", dog.getPetName());

    }
}
