import java.util.Scanner;

public class BMICalculator {
    
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
    
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Team BMI Calculator");
        System.out.println("===================");
        
        double[][] teamData = new double[10][3]; // [weight, height, bmi]
        String[] statuses = new String[10];
        
        // Input data for 10 team members
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter data for team member " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            teamData[i][0] = input.nextDouble();
            
            System.out.print("Height (in cm): ");
            teamData[i][1] = input.nextDouble();
            
            // Calculate BMI
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
            statuses[i] = determineBMIStatus(teamData[i][2]);
        }
        
        // Display results
        System.out.println("\nTeam BMI Analysis:");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------\t----------\t----------\t---\t\t------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.2f\t\t%s\n", 
                (i + 1), teamData[i][1], teamData[i][0], teamData[i][2], statuses[i]);
        }
        
        input.close();
    }
}
