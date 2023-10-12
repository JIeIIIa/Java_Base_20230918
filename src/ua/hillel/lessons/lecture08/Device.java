package ua.hillel.lessons.lecture08;

public class Device {
    String imei = "imei";


    public Device() {
        System.out.println("Hello from constructor)");
    }

    public Device(String realImei) {
        imei = realImei;

    }
}
