interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class VehicleRHA implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public VehicleRHA(String vehicleId, String driverName, double ratePerKm, String startLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = startLocation;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public String getVehicleDetails() {
        return driverName + " (" + vehicleId + ") @" + ratePerKm + "/km, loc=" + currentLocation;
    }

    @Override public String getCurrentLocation() { return currentLocation; }
    @Override public void updateLocation(String location) { this.currentLocation = location; }

    public abstract double calculateFare(double distance);
}

class CarRHA extends VehicleRHA {
    public CarRHA(String id, String driver, double rate, String loc) { super(id, driver, rate, loc); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance; }
}

class BikeRHA extends VehicleRHA {
    public BikeRHA(String id, String driver, double rate, String loc) { super(id, driver, rate, loc); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
}

class AutoRHA extends VehicleRHA {
    public AutoRHA(String id, String driver, double rate, String loc) { super(id, driver, rate, loc); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance * 0.9; }
}

class RideHailingApplicationDemo {
    public static void main(String[] args) {
        VehicleRHA[] rides = new VehicleRHA[] {
            new CarRHA("C101", "Dev", 12.0, "Central"),
            new BikeRHA("B202", "Eva", 10.0, "North"),
            new AutoRHA("A303", "Fay", 9.0, "South")
        };
        double distance = 15.5;
        for (VehicleRHA v : rides) {
            double fare = v.calculateFare(distance);
            System.out.println(v.getVehicleDetails() + ", Fare for " + distance + " km: " + String.format("%.2f", fare));
        }
    }
}
