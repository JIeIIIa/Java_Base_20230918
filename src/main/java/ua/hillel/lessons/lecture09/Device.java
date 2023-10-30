package ua.hillel.lessons.lecture09;

public class Device {
    private static int count = 0;

    String imei;
    boolean enabled;

    public Device(String imei) {
        this.imei = imei;
        count++;
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
        System.out.println("I'm a device. My imei is " + imei);
    }

    public static int createdObject() {
        return count;
    }

}
