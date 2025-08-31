import java.util.Scanner;

public class CollinearPoints {
    
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        // Check if all slopes are equal (with small tolerance for floating point)
        double tolerance = 1e-10;
        return Math.abs(slopeAB - slopeBC) < tolerance && Math.abs(slopeBC - slopeAC) < tolerance;
    }
    
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area of triangle formed by three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // If area is zero, points are collinear
        return Math.abs(area) < 1e-10;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Collinear Points Checker");
        System.out.println("========================");
        
        System.out.println("Enter coordinates for 3 points:");
        
        System.out.print("Point A - x1: ");
        double x1 = input.nextDouble();
        System.out.print("Point A - y1: ");
        double y1 = input.nextDouble();
        
        System.out.print("Point B - x2: ");
        double x2 = input.nextDouble();
        System.out.print("Point B - y2: ");
        double y2 = input.nextDouble();
        
        System.out.print("Point C - x3: ");
        double x3 = input.nextDouble();
        System.out.print("Point C - y3: ");
        double y3 = input.nextDouble();
        
        System.out.println("\nPoints:");
        System.out.println("A(" + x1 + ", " + y1 + ")");
        System.out.println("B(" + x2 + ", " + y2 + ")");
        System.out.println("C(" + x3 + ", " + y3 + ")");
        
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        
        System.out.println("\nResults:");
        System.out.println("Collinear by slope method: " + collinearBySlope);
        System.out.println("Collinear by area method: " + collinearByArea);
        
        if (collinearBySlope && collinearByArea) {
            System.out.println("The three points are collinear!");
        } else {
            System.out.println("The three points are not collinear.");
        }
        
        // Test with sample points A(2,4), B(4,6), C(6,8)
        System.out.println("\nTesting with sample points A(2,4), B(4,6), C(6,8):");
        boolean sampleCollinear = areCollinearByArea(2, 4, 4, 6, 6, 8);
        System.out.println("Sample points are collinear: " + sampleCollinear);
        
        input.close();
    }
}
