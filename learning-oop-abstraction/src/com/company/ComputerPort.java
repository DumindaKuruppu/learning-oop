package com.company;

public interface ComputerPort {

    //    public abstract keywords are not needed because by default these are public and abstract.

//    By default, interface variables are public, static and final.

    public Boolean isPlugged = true;
    Boolean isFemale = false;

    public abstract void Plug();


//    Two methods in a same name are written with different input parameter signatures. Polymorphism.

//    Method Overriding
    void Work();

//    Method Overloading
    void Work(String workType);

    void setIsPlugged(Boolean isPlugged);

}
