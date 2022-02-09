package com.company;

public class Main {

    public static void main(String[] args) {


        ComputerPort usbPort = new USBPort();

        usbPort.Plug();
        usbPort.Work();
        usbPort.setIsPlugged(true);

        Boolean isPlugged = ComputerPort.isPlugged;
        System.out.println(isPlugged);

//        Calling an overloaded method
        usbPort.Work("Drilling");

    }
}
