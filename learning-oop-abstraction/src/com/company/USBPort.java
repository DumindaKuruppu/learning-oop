package com.company;

public class USBPort implements ComputerPort {

    @Override
    public void Plug() {
        System.out.println("Plugging In");
    }

    @Override
    public void Work() {
        System.out.println("Working");
    }

    @Override
    public void setIsPlugged(Boolean isPlugged) {
        System.out.println("Is plugged = " + isPlugged);
    }

    public void Work(String s) {
        System.out.println(s);
        //newfcvbjjbhc
//        New comment
    }

    //hahvhdvdhhh hhjh
}
