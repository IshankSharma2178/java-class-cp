import java.util.Scanner;

public class BMICalculator {
    
    public static String[][] calculateBMIAndStatus(double[][] heightWeight) {
        String[][] result = new String[heightWeight.length][4];
        
        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightCm = heightWeight[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        
        return result;
    }
    
    public static String[][] processTeamData(double[][] heightWeight) {
        return calculateBMIAndStatus(heightWeight);
    }
    
    public static void displayTable(String[][] data) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------\t----------\t----------\t---\t\t------");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t\t" + 
                              data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] heightWeight = new double[10][2];
        
        System.out.println("Enter data for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Enter weight (kg):");
            heightWeight[i][0] = input.nextDouble();
            System.out.println("Enter height (cm):");
            heightWeight[i][1] = input.nextDouble();
        }
        
        String[][] results = processTeamData(heightWeight);
        
        System.out.println("\nTeam BMI Analysis:");
        displayTable(results);
    }
}
