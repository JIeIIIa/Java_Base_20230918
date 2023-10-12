package ua.hillel.lessons.lecture08.subpackage;

import ua.hillel.lessons.lecture08.Device;

class Phone extends Device {
    public void printDetailedInfo() {
        System.out.println("My name is " + name);
//        System.out.println("My imei is " + imei);
//        System.out.println("My length is " + length);
        System.out.println("My width is " + width);
    }
}
