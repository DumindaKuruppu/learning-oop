package com.company;

public class Main {

    public static void main(String[] args) {
        Car electricCar = new Car();

//        Using setters to set new member variables
        electricCar.setEngineNumber("TESLA00134");
        electricCar.setChassisNumber("QW4HD-DQCRG");
        electricCar.setModel("Model-S");
        electricCar.setIsBrandNew(true);

//        Calling get methods to print defined member variables.
        System.out.println(electricCar.getEngineNumber());
        System.out.println(electricCar.getChassisNumber());
        System.out.println(electricCar.getModel());
        System.out.println(electricCar.getIsBrandNew());

//        printing a new line
        System.out.println("\n");

//        Calling methods of the class car
        electricCar.Drive();
        electricCar.Charge();
        electricCar.Park();

    }
}
