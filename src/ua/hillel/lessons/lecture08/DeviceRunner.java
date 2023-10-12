package ua.hillel.lessons.lecture08;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();

        System.out.println("device.imei = " + device.imei);
        device.imei = "1234";
        System.out.println("device.imei = " + device.imei);

//        Device anotherDevice = new Device("777", 42, "AwesomeDevice");
        Device anotherDevice = new Device("777", 42);
        System.out.println("anotherDevice.imei = " + anotherDevice.imei + " with length = " + anotherDevice.length);
//        anotherDevice.imei = "777";
        device.imei = "qwerty";
        System.out.println("device.imei = " + anotherDevice.imei);
        System.out.println("device.imei = " + device.imei);

        anotherDevice.printInfo();
        device.printInfo();
        anotherDevice.greeting("device");
    }
}
