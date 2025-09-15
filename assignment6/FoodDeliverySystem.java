interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

abstract class FoodItemFDS implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItemFDS(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getItemDetails() {
        return itemName + " x" + quantity + " @" + price;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItemFDS {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override public double applyDiscount(double amount) { return amount * 0.95; }
    @Override public String getDiscountDetails() { return "5% veg discount"; }
}

class NonVegItem extends FoodItemFDS {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity() + 10.0; }
    @Override public double applyDiscount(double amount) { return amount * 0.90; }
    @Override public String getDiscountDetails() { return "10% non-veg discount"; }
}

class FoodDeliverySystemDemo {
    private static double process(FoodItemFDS item) {
        double total = item.calculateTotalPrice();
        return item.applyDiscount(total);
    }
    public static void main(String[] args) {
        FoodItemFDS[] order = new FoodItemFDS[] {
            new VegItem("Paneer Wrap", 6.0, 2),
            new NonVegItem("Chicken Burger", 8.5, 1)
        };
        for (FoodItemFDS i : order) {
            double finalAmt = process(i);
            System.out.println(i.getItemDetails() + ", Final: " + String.format("%.2f", finalAmt) + " (" + i.getDiscountDetails() + ")");
        }
    }
}
