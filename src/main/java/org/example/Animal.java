package org.example;

public class Animal {

    private final String specie;

    public Animal(String specie) {
        this.specie = specie;
    }

    public void speak() {
        System.out.println("My nmame is " + specie);
    }

    public void feed(String food) {
        System.out.println(food);
    }

    public void feed(String food, int amount) {
        System.out.println(food + amount);
    }

}
