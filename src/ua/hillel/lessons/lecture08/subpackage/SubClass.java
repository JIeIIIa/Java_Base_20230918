package ua.hillel.lessons.lecture08.subpackage;

import ua.hillel.lessons.lecture08.Device;

public class SubClass {
    public static void main(String[] args) {
        Device device = new Device("12345");
        device.name = "device";
//        device.imei = "imei";
//        device.length = 0;
//        device.width = 0;
        device.printInfo();
    }
}
