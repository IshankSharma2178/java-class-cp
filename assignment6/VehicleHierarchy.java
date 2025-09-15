class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle - Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override public void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private double loadCapacityTons;
    public Truck(int maxSpeed, String fuelType, double loadCapacityTons) {
        super(maxSpeed, fuelType);
        this.loadCapacityTons = loadCapacityTons;
    }
    @Override public void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Load: " + loadCapacityTons + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasABS;
    public Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }
    @Override public void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + ", Fuel: " + fuelType + ", ABS: " + hasABS);
    }
}

class VehicleHierarchyDemo {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[] {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 12.5),
            new Motorcycle(160, "Petrol", true)
        };
        for (Vehicle v : fleet) { v.displayInfo(); }
    }
}
