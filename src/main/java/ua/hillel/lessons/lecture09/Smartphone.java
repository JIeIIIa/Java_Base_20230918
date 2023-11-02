package ua.hillel.lessons.lecture09;

public class Smartphone extends Device {
    public String imei;

    public Smartphone() {
        super("smartphone-imei");
    }

    public Smartphone(String imei) {
        super(imei);
//        this();
//        setImei("d-" + imei);
        enabled = true;
        super.imei = "device-" + imei;
        this.imei = "sm-" + imei;
    }

    public void showSmartphoneInfo(){
        System.out.println("I'm a smartphone) My imei is " + this.imei);
    }


}
