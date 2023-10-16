package ua.hillel.lessons.lecture09;

public class Device {

    private String imei;
    private boolean enabled;

    public Device(String imei) {
        this.imei = imei;
    }

    public String getImei() {
        return imei;
    }
    void setImei(String imei) {
        this.imei = imei;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void showInformation() {
        System.out.println("i'm a device. My imei is " + imei);
    }

}
