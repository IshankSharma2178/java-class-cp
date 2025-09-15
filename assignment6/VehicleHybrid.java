interface Refuelable {
    void refuel();
}

class VehicleH {
    protected int maxSpeed;
    protected String model;
    public VehicleH(int maxSpeed, String model) { this.maxSpeed = maxSpeed; this.model = model; }
}

class ElectricVehicle extends VehicleH {
    public ElectricVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    public void charge() { System.out.println("EV " + model + " is charging."); }
}

class PetrolVehicle extends VehicleH implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    @Override public void refuel() { System.out.println("Petrol vehicle " + model + " is refueling."); }
}

class VehicleHybridDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Model-E");
        PetrolVehicle pv = new PetrolVehicle(180, "Model-P");
        ev.charge();
        pv.refuel();
    }
}
