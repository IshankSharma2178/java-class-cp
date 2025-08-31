import java.util.Scanner;

public class AthleteRounds {
    
    public static int calculateRounds(double side1, double side2, double side3, double targetDistance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(targetDistance / perimeter);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Athlete Rounds Calculator");
        System.out.println("-------------------------");
        
        System.out.print("Enter first side of triangle (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter second side of triangle (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter third side of triangle (in meters): ");
        double side3 = input.nextDouble();
        
        double targetDistance = 5000; // 5 km in meters
        
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Please enter valid positive values for triangle sides.");
        } else {
            int rounds = calculateRounds(side1, side2, side3, targetDistance);
            double perimeter = side1 + side2 + side3;
            
            System.out.println("\nResults:");
            System.out.println("Triangle sides: " + side1 + "m, " + side2 + "m, " + side3 + "m");
            System.out.println("Perimeter: " + perimeter + " meters");
            System.out.println("Target distance: " + targetDistance + " meters (5 km)");
            System.out.println("Number of rounds needed: " + rounds);
        }
        
        input.close();
    }
}
