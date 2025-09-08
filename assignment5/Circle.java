public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + ", Area: " + String.format("%.2f", area()));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        c1.display();
        c2.display();
    }
}
