import java.util.Scanner;

public class StudentScorecard {
    
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // [physics, chemistry, math]
        
        for (int i = 0; i < numStudents; i++) {
            // Generate 2-digit random scores (10 to 99)
            scores[i][0] = 10 + (int)(Math.random() * 90); // Physics
            scores[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int)(Math.random() * 90); // Math
        }
        
        return scores;
    }
    
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [total, average, percentage]
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        
        return results;
    }
    
    public static void displayScorecard(int[][] scores, double[][] totals) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-------\t-------\t--------\t----\t-----\t-------\t----------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                totals[i][0], totals[i][1], totals[i][2]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Student Scorecard Generator");
        System.out.println("===========================");
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Please enter a positive number of students.");
        } else {
            int[][] scores = generateRandomScores(numStudents);
            double[][] totals = calculateTotalsAndPercentages(scores);
            
            System.out.println("\nStudent Scorecard:");
            displayScorecard(scores, totals);
        }
        
        input.close();
    }
}
