import java.util.Scanner;

public class MaxHandshakes {
    
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Maximum Handshakes Calculator");
        System.out.println("-----------------------------");
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        if (numberOfStudents <= 0) {
            System.out.println("Please enter a positive number of students.");
        } else {
            int maxHandshakes = calculateHandshakes(numberOfStudents);
            System.out.println("\nResults:");
            System.out.println("Number of students: " + numberOfStudents);
            System.out.println("Maximum possible handshakes: " + maxHandshakes);
        }
        
        input.close();
    }
}
