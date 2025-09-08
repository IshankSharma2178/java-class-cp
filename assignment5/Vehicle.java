public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 50.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: $" + String.format("%.2f", registrationFee));
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Emma", "Car");
        Vehicle v2 = new Vehicle("Frank", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(65.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
