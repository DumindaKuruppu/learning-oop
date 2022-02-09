package com.company;

public class Animal {
    private String name;
    private int numberOfLegs;
    private Boolean hasWings;

    public void Walk() {
        System.out.println("Walking");
    }

    public void Communicate() {
        System.out.println("Talking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
