package ua.hillel.lessons.lecture09;

import ua.hillel.lessons.lecture09.demo.DemoDeviceRunner;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device("qwerty");

        device.showInformation();

        device.setImei("fake imei");

        System.out.println("Device's imei is " + device.getImei());

        Device anotherDevice = new Device("qwerty");


        DemoDeviceRunner.main(args);

//        Device.count = -42;
        System.out.println("We created " + Device.createdObject() + " device");
    }
}
