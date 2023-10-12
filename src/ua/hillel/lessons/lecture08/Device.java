package ua.hillel.lessons.lecture08;

public class Device {
    String imei = "imei";
    int length;


    public Device() {
        System.out.println("Hello from constructor)");
    }

    public Device(String realImei) {
        imei = realImei;
        System.out.println("Hello from constructor with ONE argument)");
    }

    public Device(String realImei, int length) {
        this(realImei);
        System.out.println("Complex object constructing...");
        this.length = length;
    }
}
