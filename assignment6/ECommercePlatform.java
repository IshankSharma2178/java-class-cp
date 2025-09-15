interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class ProductEP {
    private String productId;
    private String name;
    private double price;

    public ProductEP(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

class Electronics extends ProductEP implements Taxable {
    private int warrantyMonths;
    public Electronics(String productId, String name, double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    @Override public double calculateDiscount() { return getPrice() * 0.10; }
    @Override public double calculateTax() { return getPrice() * 0.18; }
    @Override public String getTaxDetails() { return "GST 18% on electronics"; }
}

class Clothing extends ProductEP implements Taxable {
    private String size;
    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }
    @Override public double calculateDiscount() { return getPrice() * 0.15; }
    @Override public double calculateTax() { return getPrice() * 0.05; }
    @Override public String getTaxDetails() { return "VAT 5% on clothing"; }
}

class Groceries extends ProductEP {
    private boolean perishable;
    public Groceries(String productId, String name, double price, boolean perishable) {
        super(productId, name, price);
        this.perishable = perishable;
    }
    @Override public double calculateDiscount() { return perishable ? getPrice() * 0.05 : getPrice() * 0.02; }
}

class ECommercePlatformDemo {
    private static double finalPrice(ProductEP p) {
        double tax = 0;
        if (p instanceof Taxable) { tax = ((Taxable)p).calculateTax(); }
        double discount = p.calculateDiscount();
        return p.getPrice() + tax - discount;
    }

    public static void main(String[] args) {
        ProductEP[] items = new ProductEP[] {
            new Electronics("P001", "Laptop", 1000, 24),
            new Clothing("P002", "Jacket", 200, "L"),
            new Groceries("P003", "Apples", 50, true)
        };
        for (ProductEP p : items) {
            double price = finalPrice(p);
            System.out.println(p.getName() + " final: " + String.format("%.2f", price));
        }
    }
}
