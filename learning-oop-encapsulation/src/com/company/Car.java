package com.company;

public class Car {

//    private strings are encapsulated.
    private String engineNumber;
    private String chassisNumber;
    private String model;
    private Boolean isBrandNew;

    public void Drive() {
        System.out.println("Driving");
    }

    public void Charge() {
        System.out.println("Charging");
    }

    public void Park() {
        System.out.println("Parked");
    }

//    To access private member variables, getter and setter methods are introduced.

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getIsBrandNew() {
        return isBrandNew;
    }

    public void setIsBrandNew(Boolean isBrandNew) {
        this.isBrandNew = isBrandNew;
    }
}


