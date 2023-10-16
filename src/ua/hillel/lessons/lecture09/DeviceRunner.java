package ua.hillel.lessons.lecture09;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device("qwerty");
        device.showInformation();

        device.setImei("fake imei");

        System.out.println("Device's imei is " + device.getImei());
    }
}
