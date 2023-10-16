package ua.hillel.lessons.lecture09;

import ua.hillel.lessons.lecture09.demo.DemoDeviceRunner;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device("qwerty");
        Device.count++;

        device.showInformation();

        device.setImei("fake imei");

        System.out.println("Device's imei is " + device.getImei());

        Device anotherDevice = new Device("qwerty");
        Device.count++;


        DemoDeviceRunner.main(args);


        System.out.println("We created " + Device.count + " device");
    }
}
