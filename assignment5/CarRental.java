public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this("Customer", "Hatchback", 1, 35.0);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this(customerName, carModel, rentalDays, 40.0);
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Model: " + carModel + ", Days: " + rentalDays + ", Total: $" + String.format("%.2f", calculateTotalCost()));
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Clara", "SUV", 4);
        CarRental r3 = new CarRental("David", "Sedan", 3, 55.0);
        r1.display();
        r2.display();
        r3.display();
    }
}
