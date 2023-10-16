package ua.hillel.lessons.lecture09.demo;

import ua.hillel.lessons.lecture09.Device;

public class DemoDeviceRunner {
    public static void main(String[] args) {
        Device device = new Device("qwerty");
        Device.count++;
        device.showInformation();

//        device.imei("fake demo imei");

        System.out.println("Device's imei is " + device.getImei());
    }
}
