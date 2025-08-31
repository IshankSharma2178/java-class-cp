import java.util.Scanner;

public class QuadraticEquation {
    
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        
        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[0];
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quadratic Equation Solver");
        System.out.println("=========================");
        System.out.println("For equation: ax² + bx + c = 0");
        
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();
        
        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero (not a quadratic equation)");
        } else {
            double[] roots = findRoots(a, b, c);
            
            System.out.println("\nEquation: " + a + "x² + " + b + "x + " + c + " = 0");
            
            if (roots.length == 0) {
                System.out.println("No real roots exist (complex roots)");
            } else if (roots.length == 1) {
                System.out.println("One real root: x = " + String.format("%.4f", roots[0]));
            } else {
                System.out.println("Two real roots:");
                System.out.println("x₁ = " + String.format("%.4f", roots[0]));
                System.out.println("x₂ = " + String.format("%.4f", roots[1]));
            }
        }
        
        input.close();
    }
}
