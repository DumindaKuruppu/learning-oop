package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.Bark();
        dog.Communicate();
        dog.Walk();

        dog.setName("ජිමී");

        System.out.print("\n");
        System.out.println(dog.getName());


        }
    }

