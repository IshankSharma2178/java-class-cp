import java.util.Scanner;

public class EuclideanDistance {
    
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope
        double slope = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept: b = y1 - m*x1
        double yIntercept = y1 - slope * x1;
        
        return new double[]{slope, yIntercept};
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Euclidean Distance and Line Equation Calculator");
        System.out.println("==============================================");
        
        System.out.println("Enter coordinates for two points:");
        
        System.out.print("Point 1 - x1: ");
        double x1 = input.nextDouble();
        System.out.print("Point 1 - y1: ");
        double y1 = input.nextDouble();
        
        System.out.print("Point 2 - x2: ");
        double x2 = input.nextDouble();
        System.out.print("Point 2 - y2: ");
        double y2 = input.nextDouble();
        
        if (x1 == x2) {
            System.out.println("Error: Cannot calculate slope for vertical line (x1 = x2)");
        } else {
            double distance = calculateEuclideanDistance(x1, y1, x2, y2);
            double[] lineEquation = findLineEquation(x1, y1, x2, y2);
            
            System.out.println("\nResults:");
            System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
            System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
            System.out.println("Euclidean Distance: " + String.format("%.4f", distance));
            
            System.out.println("\nLine Equation:");
            System.out.println("Slope (m): " + String.format("%.4f", lineEquation[0]));
            System.out.println("Y-intercept (b): " + String.format("%.4f", lineEquation[1]));
            System.out.println("Equation: y = " + String.format("%.4f", lineEquation[0]) + "x + " + String.format("%.4f", lineEquation[1]));
        }
        
        input.close();
    }
}
