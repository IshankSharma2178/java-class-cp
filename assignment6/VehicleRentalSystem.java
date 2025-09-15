interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class VehicleRS implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day
    private String policyNumber; // sensitive

    public VehicleRS(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.policyNumber = policyNumber;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    protected String maskPolicy() {
        if (policyNumber == null || policyNumber.length() < 4) return "****";
        return "****" + policyNumber.substring(policyNumber.length()-4);
    }

    public abstract double calculateRentalCost(int days);
}

class CarRS extends VehicleRS {
    public CarRS(String number, double rate, String policy) { super(number, "Car", rate, policy); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return getRentalRate() * 0.1; }
    @Override public String getInsuranceDetails() { return "Car insurance policy: " + maskPolicy(); }
}

class BikeRS extends VehicleRS {
    public BikeRS(String number, double rate, String policy) { super(number, "Bike", rate, policy); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 0.6; }
    @Override public double calculateInsurance() { return getRentalRate() * 0.05; }
    @Override public String getInsuranceDetails() { return "Bike insurance policy: " + maskPolicy(); }
}

class TruckRS extends VehicleRS {
    public TruckRS(String number, double rate, String policy) { super(number, "Truck", rate, policy); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    @Override public double calculateInsurance() { return getRentalRate() * 0.2; }
    @Override public String getInsuranceDetails() { return "Truck insurance policy: " + maskPolicy(); }
}

class VehicleRentalSystemDemo {
    public static void main(String[] args) {
        VehicleRS[] vehicles = new VehicleRS[] {
            new CarRS("TN01-1234", 100, "POLICYCAR123456"),
            new BikeRS("TN01-5678", 50, "POLBIKE7890"),
            new TruckRS("TN01-9999", 200, "POLTRUCK5555")
        };
        int days = 3;
        for (VehicleRS v : vehicles) {
            double rental = v.calculateRentalCost(days);
            double insurance = v.calculateInsurance();
            System.out.println(v.getType() + " " + v.getVehicleNumber() + ": rental=" + rental + ", insurance=" + insurance + ", details=" + v.getInsuranceDetails());
        }
    }
}
