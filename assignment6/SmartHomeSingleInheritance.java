class Device {
    protected String deviceId;
    protected String status;
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    private double temperatureSetting;
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public void displayStatus() {
        System.out.println("Thermostat ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting + "°C");
    }
}

class SmartHomeSingleInheritanceDemo {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T-001", "ON", 22.5);
        t.displayStatus();
    }
}
