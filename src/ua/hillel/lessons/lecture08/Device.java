package ua.hillel.lessons.lecture08;

public class Device {
    public String name;
    String imei = "imei";
    private int length;
    protected int width;


    public Device() {
        System.out.println("Hello from constructor)");
        this.name = "unknown";
    }

    public Device(String realImei) {
        this();
        imei = realImei;
        System.out.println("Hello from constructor with ONE argument)");
    }

    public Device(String realImei, int length) {
        this(realImei);
        System.out.println("Complex object constructing...");
        this.length = length;
    }

    private Device(String realImei, int length, String name) {
        this(realImei, length);
        this.name = name;
    }

    public void printInfo() {
        System.out.println("===========");
        greeting(name);
        System.out.println("Imei = " + imei + ", length = " + length);
        System.out.println("===========");
    }

    public void printInfo(String prefix) {
        System.out.println("===========");
        System.out.println(prefix);
        greeting(name);
        System.out.println("Imei = " + imei + ", length = " + length);
        System.out.println("===========");
    }

    public void greeting(String name) {
        System.out.println("Hello, my name is " + name);
    }
}
