package ua.hillel.lessons.lecture09;

import ua.hillel.lessons.lecture09.demo.DemoDeviceRunner;

public class DeviceRunner {
    public static void main(String[] args) {
        createDevices(args);
        System.out.println("\n\n   -= SMARTPHONES =-");
        Device device = new Smartphone();
        device.showInformation();
//        device.showSmartphoneInfo();
        Smartphone smartphone = null;
        smartphone = (Smartphone) device;

        DeviceRunner deviceRunner = new DeviceRunner();
//        device = (Device) deviceRunner; // incompatible types: ua.hillel.lessons.lecture09.DeviceRunner cannot be converted to ua.hillel.lessons.lecture09.Device

        byte byteValue = 12;
        double doubleValue = 0.0;
        doubleValue = byteValue;
        byteValue = (byte) doubleValue;

        Smartphone anotherSmartphone = new Smartphone("777");
        anotherSmartphone.showInformation();
        anotherSmartphone.showSmartphoneInfo();


//        Device.count = -42;
        System.out.println("We created " + Device.createdObject() + " device");
    }

    private static void createDevices(String[] args) {
        Device device = new Device("qwerty");

        device.showInformation();

        device.setImei("fake imei");

        System.out.println("Device's imei is " + device.getImei());

        Device anotherDevice = new Device("qwerty");


        DemoDeviceRunner.main(args);
    }
}
