import java.util.Scanner;

public class TrigonometricCalculator {
    
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[]{sine, cosine, tangent};
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Trigonometric Functions Calculator");
        System.out.println("---------------------------------");
        
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        
        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.println("\nResults for angle " + angle + " degrees:");
        System.out.println("Sine: " + String.format("%.6f", results[0]));
        System.out.println("Cosine: " + String.format("%.6f", results[1]));
        System.out.println("Tangent: " + String.format("%.6f", results[2]));
        
        input.close();
    }
}
