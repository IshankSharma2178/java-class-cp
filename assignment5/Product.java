public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + String.format("%.2f", price));
    }

    public static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 2.49);
        Product p2 = new Product("Pen", 0.99);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
