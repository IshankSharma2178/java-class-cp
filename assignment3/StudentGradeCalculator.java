import java.util.Scanner;

public class StudentGradeCalculator {
    
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50; // Physics: 50-99
            scores[i][1] = (int)(Math.random() * 50) + 50; // Chemistry: 50-99
            scores[i][2] = (int)(Math.random() * 50) + 50; // Math: 50-99
        }
        return scores;
    }
    
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }
    
    public static String[][] calculateGrades(double[][] percentages) {
        String[][] grades = new String[percentages.length][2];
        
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }
        
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] totals, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("-------\t-------\t---------\t----\t-----\t-------\t----------\t-----\t-------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\t\t%s\t%s\n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                totals[i][0], totals[i][1], totals[i][2], grades[i][0], grades[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of students:");
        int numStudents = input.nextInt();
        
        int[][] scores = generateRandomScores(numStudents);
        double[][] totals = calculateTotalsAndPercentages(scores);
        String[][] grades = calculateGrades(totals);
        
        System.out.println("\nStudent Scorecard:");
        displayScorecard(scores, totals, grades);
    }
}
